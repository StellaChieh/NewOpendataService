package com.iisi.newOpendataService.makeXml;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iisi.newOpendataService.MakeFile;
import com.iisi.newOpendataService.dbEntity.DbCODiS;
import com.iisi.newOpendataService.utility.TimeInputException;
import com.iisi.newOpendataService.utility.Utility;
import com.iisi.newOpendataService.utility.MakeFileServiceType;
import com.iisi.newOpendataService.xml.XmlCODiS;
import com.iisi.newOpendataService.xml.XmlCODiS.Resources.Resource.Data.SurfaceObs;
import com.iisi.newOpendataService.xml.XmlCODiS.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes;
import com.iisi.newOpendataService.xml.XmlCODiS.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime;
import com.iisi.newOpendataService.xml.XmlCODiS.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime.WeatherElements;
import com.iisi.newOpendataService.xml.XmlCODiS.Resources.Resource.Metadata;
import com.iisi.newOpendataService.xml.XmlCODiS.Resources.Resource.Metadata.WeatherElements.SpecialValues;
import com.iisi.newOpendataService.xml.XmlCODiS.Resources.Resource.Metadata.WeatherElements.SpecialValues.SpecialValue;
import com.iisi.newOpendataService.xml.XmlCODiSObjectFactory;


@Service
public class MakeCODiSXml extends MakeXmlTemplate<DbCODiS, XmlCODiS> {

	@Autowired
	private XmlCODiSObjectFactory factory;

	private LocalDate startDate;

	@Override
	public void setParameters(String... arg) throws TimeInputException, NumberFormatException, DateTimeException {
		if(arg.length == 0) {
			this.startDate = LocalDate.now().minusDays(1);
//			this.startDate = LocalDate.of(2019, 8, 25); // test only
		} else {
			String[] date = arg[0].split(MakeFile.timeSplitter);
			this.startDate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
			if(startDate.isAfter(LocalDate.now().minusDays(1))) {
				throw new TimeInputException("CODiS error: user should not input time that is later then yesterday");
			}
		}
		// this file has "2018-12-02T24:00+08:00" format, only valid in version 1.1
		super.xmlVersion = "1.1";
	}

	@Override
	protected Class<XmlCODiS> getXmlClass() {
		return XmlCODiS.class;
	}

	@Override
	protected String getFilename() {
		return attr.cODiSFilename;
	}
	
	@Override
	protected List<String> getDestinationFolders() {
		return attr.cODiSFolder;
	}

	@Override
	protected void register() {
		super.register(MakeFileServiceType.CODiS, "makeCODiSXml");
	}

	@Override
	protected List<DbCODiS> query() {
		return query.query(startDate, startDate.plusDays(1));
	}

	@Override
	protected XmlCODiS createCwbData(List<DbCODiS> dbEntity) throws DatatypeConfigurationException {
		XmlCODiS cwbData = factory.createCwbdata();
		cwbData.setIdentifier(UUID.randomUUID().toString());
		cwbData.setDatasetID(attr.cODiSDatasetID);
		cwbData.setDatasetName(attr.DATASET_NAME);
		cwbData.setDataItemID(attr.cODiSDataItemID);
		cwbData.setSender(attr.SENDER);
		cwbData.setSent(Utility.getXmlDateTime(LocalDateTime.now()));
		cwbData.setStatus(attr.STATUS_ACTUAL);
		cwbData.setScope(attr.SCOPE_PUBLIC);
		cwbData.setMsgType(attr.MSG_TYPE_ISSUE);
		cwbData.setPublisherOID(attr.PUBLISHER_OID);

		XmlCODiS.Resources resources = factory.createCwbdataResources();
		XmlCODiS.Resources.Resource resource = factory.createCwbdataResourcesResource();
		XmlCODiS.Resources.Resource.Metadata metadata = factory.createCwbdataResourcesResourceMetadata();
		metadata = createMetadata(metadata);
		resource.setMetadata(metadata);
		
		XmlCODiS.Resources.Resource.Data data = factory.createCwbdataResourcesResourceData();
		XmlCODiS.Resources.Resource.Data.SurfaceObs surfaceObs = factory.createCwbdataResourcesResourceDataSurfaceObs();
		surfaceObs = createSurfaceObs(surfaceObs, dbEntity);
		data.setSurfaceObs(surfaceObs);
		resource.setData(data);
		
		resources.setResource(resource);
		cwbData.setResources(resources);
		return cwbData;
	}

	private SurfaceObs createSurfaceObs(SurfaceObs surfaceObs, List<DbCODiS> dbEntity) {
		
		Map<String, List<DbCODiS>> map = dbEntity.stream().collect(
				Collectors.groupingBy(DbCODiS::getStno, TreeMap::new, Collectors.toCollection(ArrayList::new))
				);
		
		for(Entry<String, List<DbCODiS>> entry :map.entrySet()) {
			
			entry.getValue().sort(Comparator.comparing(DbCODiS::getObsTime));;
			XmlCODiS.Resources.Resource.Data.SurfaceObs.Location location 
				= factory.createCwbdataResourcesResourceDataSurfaceObsLocation();
			XmlCODiS.Resources.Resource.Data.SurfaceObs.Location.Station station 
				= factory.createCwbdataResourcesResourceDataSurfaceObsLocationStation();
			station.setStationID(entry.getValue().get(0).getStno());
			station.setStationName(entry.getValue().get(0).getStnCName());
			station.setStationNameEN(entry.getValue().get(0).getStnEName());
			location.setStation(station);
			
			StationObsTimes stationObsTimes = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsTimes();
			for(DbCODiS entity : entry.getValue()) {
				
				StationObsTime stationObsTime = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsTimesStationObsTime();
				stationObsTime.setDataTime(Utility.transTo24HourTimeType(entity.getObsTime()));
				WeatherElements wes = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsTimesStationObsTimeWeatherElements();
				wes.setStationPressure(entity.getStnPres());
				wes.setSeaLevelPressure(entity.getSeaPres());
				wes.setTemperature(entity.getTx());
				wes.setDewPointTemperature(entity.getTd());
				wes.setRelativeHumidity(entity.getRh());
				wes.setWindSpeed(entity.getWs());
				wes.setWindDirection(entity.getWd());
				wes.setGustSpeed(entity.getWsGust());
				wes.setGustDirection(entity.getWdGust());
				wes.setPrecipitation(entity.getPrecp());
				wes.setPrecipitationDuration(entity.getPrecpHour());
				wes.setSunshineDuration(entity.getSunShine());
				wes.setGlobalSolarRadiation(entity.getGloblRad());
				wes.setVisibility(entity.getVisb());
				wes.setUVIndex(entity.getUvi());
				wes.setCloudAmount(entity.getcAmtTotal());
				stationObsTime.setWeatherElements(wes);
				stationObsTimes.getStationObsTime().add(stationObsTime);
			}
			location.setStationObsTimes(stationObsTimes);
			surfaceObs.getLocation().add(location);
		}
		return surfaceObs;
	}

	private Metadata createMetadata(Metadata metadata) throws DatatypeConfigurationException {

		metadata.setResourceID(attr.cODiSResourceID);
		metadata.setResourceName("過去1天逐時氣象資料");
		metadata.setResourceDescription("氣象局所屬氣象觀測站，過去一天逐時的各項氣象因子資料。");
		metadata.setLanguage("zh");
		metadata.setHomepage(attr.cODiSHomepage);

		XmlCODiS.Resources.Resource.Metadata.Sources sources = factory.createCwbdataResourcesResourceMetadataSources();
		XmlCODiS.Resources.Resource.Metadata.Sources.Source source1 = factory
				.createCwbdataResourcesResourceMetadataSourcesSource();
		source1.setTitle("中央氣象局氣象測站代號及站況資料");
		source1.setPath(attr.reportObsPath);
		XmlCODiS.Resources.Resource.Metadata.Sources.Source source2 = factory
				.createCwbdataResourcesResourceMetadataSourcesSource();
		source2.setTitle("Abbreviation for unit of measure - as defined within WMO "
				+ "No. 306 Common code-table C-6 1List of units for TDCFs1. (use wmo abbreviation)");
		source2.setPath(attr.reportWmoPath);
		sources.getSource().add(source1);
		sources.getSource().add(source2);
		metadata.setSources(sources);

		XmlCODiS.Resources.Resource.Metadata.Temporal temporal = factory
				.createCwbdataResourcesResourceMetadataTemporal();
		temporal.setStartTime(Utility.getXmlDateTime(startDate.atTime(0, 0, 0)));
		temporal.setEndTime(Utility.getXmlDateTime(startDate.plusDays(1).atTime(0, 0, 0)));
		metadata.setTemporal(temporal);

		XmlCODiS.Resources.Resource.Metadata.Spatial spatial = factory.createCwbdataResourcesResourceMetadataSpatial();
		spatial.setDescription("中央氣象局所屬氣象觀測站");
		metadata.setSpatial(spatial);

		XmlCODiS.Resources.Resource.Metadata.WeatherElements wes = factory
				.createCwbdataResourcesResourceMetadataWeatherElements();
		wes.getWeatherElement().add(createWetherElement("stationPressure", "測站氣壓", "hPa"));
		wes.getWeatherElement().add(createWetherElement("seaLevelPressure", "海平面氣壓，氣象站高度在 762 公尺以上(如鞍部、日月潭、阿里山、玉山…等)的海平面氣壓資料為鄰近標準等壓面高度，以重力位公尺標示。", "hPa"));
		wes.getWeatherElement().add(createWetherElement("temperature", "溫度", "˚C"));
		wes.getWeatherElement().add(createWetherElement("dewPointTemperature", "露點溫度", "˚C"));
		wes.getWeatherElement().add(createWetherElement("relativeHumidity", "相對溼度", "%"));
		wes.getWeatherElement().add(createWetherElement("windSpeed",
				"風速，為觀測時（整點）前10分鐘之平均　The wind speed(WS), wind direction(WD) of the daily report is the average of 10 minutes before the hour.",
				"m s^-1"));
		wes.getWeatherElement().add(createWetherElement("windDirection",
				"風向，為觀測時（整點）前10分鐘之平均，當風速<=0.2m/s時，風向記為0，北風記為360　When the wind speed <= 0.2 m/s, the wind direction(WD) is recorded as 0, and the north wind is recorded as 360.",
				"˚"));
		wes.getWeatherElement().add(createWetherElement("gustSpeed",
				"最大陣風風速，為觀測時（整點）前1小時內最大瞬間風速　The maximum gust(WSGust) is the maximum instantaneous wind speed within the hour.",
				"m s^-1"));
		wes.getWeatherElement().add(createWetherElement("gustDirection", "最大陣風風向", "˚"));
		wes.getWeatherElement().add(createWetherElement("precipitation", "降水量", "mm"));
		wes.getWeatherElement().add(createWetherElement("precipitationDuration", "降水時數", "h"));
		wes.getWeatherElement().add(createWetherElement("sunshineDuration", "日照時數", "h"));
		wes.getWeatherElement().add(createWetherElement("globalSolarRadiation", "全天空日射量", "J m^-2"));
		wes.getWeatherElement().add(createWetherElement("visibility", "能見度", "km"));
		wes.getWeatherElement().add(createWetherElement("UVIndex",
				"紫外線指數，　僅部分有人氣象站實行觀測，如台北、台中、嘉義、高雄、花蓮、台東、新竹、日月潭、恆春、宜蘭、澎湖、玉山、台南、成功、金門、馬祖、基隆、蘭嶼、鞍部、新屋等氣象站。UVIisonly observed by someCWB’s mannedstations, such as Taipei, Taichung, Chiayi, Kaohsiung, Hualien, Taitung, Hsinchu, Sun Moon Lake, Hengchun, Yilan, Penghu, Yushan, Tainan, Chenggong, Kinmen, Matsu, Keelung, Lanyu, AnBu, XinWu",
				""));
		wes.getWeatherElement().add(createWetherElement("cloudAmount", "總雲量", "deca"));
		
		SpecialValues sps = factory.createCwbdataResourcesResourceMetadataWeatherElementsSpecialValues();
		sps.getSpecialValue().add(createSpecialValue("T", "微量 trace（雨量precipitation<0.1mm）"));
		sps.getSpecialValue().add(createSpecialValue("X", "故障 instrument malfunction"));
		sps.getSpecialValue().add(createSpecialValue("V", "風向不定 variable wind with no mean wind direction"));
		sps.getSpecialValue().add(createSpecialValue("/", "不明 status unknown"));
		sps.getSpecialValue().add(createSpecialValue("", "無觀測 no observation"));
		wes.setSpecialValues(sps);
		
		metadata.setWeatherElements(wes);
		
		return metadata;
	}

	private XmlCODiS.Resources.Resource.Metadata.WeatherElements.WeatherElement createWetherElement(String tagName,
			String description, String unit) {
		XmlCODiS.Resources.Resource.Metadata.WeatherElements.WeatherElement we = factory
				.createCwbdataResourcesResourceMetadataWeatherElementsWeatherElement();
		we.setTagName(tagName);
		we.setDescription(description);
		we.setUnits(unit);
		return we;
	}
	
	private XmlCODiS.Resources.Resource.Metadata.WeatherElements.SpecialValues.SpecialValue createSpecialValue(
			String value, String description){
		SpecialValue sp = factory.createCwbdataResourcesResourceMetadataWeatherElementsSpecialValuesSpecialValue();
		sp.setValue(value);
		sp.setDescription(description);
		return sp;
	}

	

}
