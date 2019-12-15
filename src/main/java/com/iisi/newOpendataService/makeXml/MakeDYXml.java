package com.iisi.newOpendataService.makeXml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iisi.newOpendataService.MakeFile;
import com.iisi.newOpendataService.dbEntity.DbDY;
import com.iisi.newOpendataService.utility.TimeInputException;
import com.iisi.newOpendataService.utility.Utility;
import com.iisi.newOpendataService.utility.MakeFileServiceType;
import com.iisi.newOpendataService.xml.XmlDY;
import com.iisi.newOpendataService.xml.XmlDY.Resources.Resource.Data.SurfaceObs;
import com.iisi.newOpendataService.xml.XmlDY.Resources.Resource.Data.SurfaceObs.Location.Station;
import com.iisi.newOpendataService.xml.XmlDY.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics;
import com.iisi.newOpendataService.xml.XmlDY.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Precipitation;
import com.iisi.newOpendataService.xml.XmlDY.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Precipitation.Monthly;
import com.iisi.newOpendataService.xml.XmlDY.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes;
import com.iisi.newOpendataService.xml.XmlDY.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime;
import com.iisi.newOpendataService.xml.XmlDY.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime.WeatherElements;
import com.iisi.newOpendataService.xml.XmlDY.Resources.Resource.Metadata;
import com.iisi.newOpendataService.xml.XmlDYObjectFactory;

@Component
public class MakeDYXml extends MakeXmlTemplate<DbDY, XmlDY> {

	@Autowired
	private XmlDYObjectFactory factory;
	
	private LocalDate dataStartDate;
	private LocalDate dataEndDate;
	private LocalDate endDate;
	
	@Override
	public void setParameters(String... arg) throws TimeInputException {
		if(arg.length == 0) {
			endDate = LocalDate.now();
		} else {
			String[] date = arg[0].split(MakeFile.timeSplitter);
			endDate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[02])).plusDays(1);
			if(endDate.minusDays(1).isAfter(LocalDate.now().minusDays(1))) {
				throw new TimeInputException("dy_report error: user should not input time that is later than yesterday");
			}
		}
		// data range is from dataStartDate ~ dataEndDate (included)
		dataStartDate = LocalDate.of(endDate.minusDays(1).getYear(), 1, 1);
		dataEndDate = endDate.minusDays(1);
	}

	@Override
	protected List<DbDY> query() {
		return query.query(dataStartDate, dataEndDate);
	}

	@Override
	protected Class<XmlDY> getXmlClass() {
		return XmlDY.class;
	}

	@Override
	protected String getFilename() {
		return attr.dyFilename;
	}
	
	@Override
	protected List<String> getDestinationFolders() {
		return attr.dyReportFolder;
	}

	@Override
	protected void register() {
		super.register(MakeFileServiceType.DYReport, "makeDYXml");
	}
	
	@Override
	protected XmlDY createCwbData(List<DbDY> locationDatas) throws DatatypeConfigurationException {
		XmlDY cwbData = factory.createCwbdata();
		cwbData.setIdentifier(UUID.randomUUID().toString());
		cwbData.setDatasetID(attr.dyReportDatasetID);
		cwbData.setDatasetName(attr.DATASET_NAME);
		cwbData.setDataItemID(attr.dyReportDataItemID);
		cwbData.setSender(attr.SENDER);
		cwbData.setSent(Utility.getXmlDateTime(LocalDateTime.now()));
		cwbData.setStatus(attr.STATUS_ACTUAL);
		cwbData.setScope(attr.SCOPE_PUBLIC);
		cwbData.setMsgType(attr.MSG_TYPE_ISSUE);
		cwbData.setPublisherOID(attr.PUBLISHER_OID);
		
		XmlDY.Resources resources = factory.createCwbdataResources();
		XmlDY.Resources.Resource resource = factory.createCwbdataResourcesResource();
		XmlDY.Resources.Resource.Metadata metadata = factory.createCwbdataResourcesResourceMetadata();
		metadata = createMetadata(metadata);
		resource.setMetadata(metadata);
		
		XmlDY.Resources.Resource.Data data = factory.createCwbdataResourcesResourceData();
		XmlDY.Resources.Resource.Data.SurfaceObs surfaceObs = factory.createCwbdataResourcesResourceDataSurfaceObs();
		surfaceObs = createSurfaceObs(surfaceObs, locationDatas);
		data.setSurfaceObs(surfaceObs);
		resource.setData(data);		
		resources.setResource(resource);
		cwbData.setResources(resources);
		return cwbData;
	}

	private XmlDY.Resources.Resource.Data.SurfaceObs createSurfaceObs(SurfaceObs surfaceObs, List<DbDY> locationDatas) throws DatatypeConfigurationException {
		for(DbDY item : locationDatas) {
			XmlDY.Resources.Resource.Data.SurfaceObs.Location location 
				= factory.createCwbdataResourcesResourceDataSurfaceObsLocation();
			Station station = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStation();
			station.setStationID(item.getStno());
			station.setStationName(item.getStnCName());
			station.setStationNameEN(item.getStnEName());
			station.setStationAttribute(Utility.getStationAttribution(item.getStno()));
			location.setStation(station);
			StationObsTimes times = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsTimes();
			String[][] dateAry = item.getData();
			for(int i=0; i<dataEndDate.getMonthValue(); i++) {
				for(int j=0; j<YearMonth.of(dataEndDate.getYear(), i+1).lengthOfMonth(); j++) {
					if(LocalDate.of(dataEndDate.getYear(), i+1, j+1).isAfter(dataEndDate) ) {
						break;
					}
					StationObsTime time = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsTimesStationObsTime();
					time.setDataDate(Utility.getXmlDate(LocalDate.of(item.getYear(), i+1, j+1)));
					WeatherElements wes = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsTimesStationObsTimeWeatherElements();
					time.setWeatherElements(wes);
					if(dateAry[j][i] == null || dateAry[j][i].equals("")) { // 無觀測
						wes.setPrecipitation("");
					} else {
						wes.setPrecipitation(dateAry[j][i]);
					}
					times.getStationObsTime().add(time);
				}
			}
			location.setStationObsTimes(times);
			
			StationObsStatistics statistics = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatistics();
			Precipitation precp = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsPrecipitation();
			String[] totalAry = item.getTotal();
			for(int i=0; i<dataEndDate.getMonthValue(); i++) {
				Monthly m = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsPrecipitationMonthly();
				String month = i<=8 ? "0" + String.valueOf(i+1) : String.valueOf(i+1);
				m.setDataYearMonth(item.getYear() + "-" + month);
				if(totalAry[i] == null || totalAry[i].equals("")) { // 無觀測
					m.setTotal("");
				} else {
					m.setTotal(totalAry[i]);
				}
				precp.getMonthly().add(m);
			}
			statistics.setPrecipitation(precp);
			location.setStationObsStatistics(statistics);
			
			surfaceObs.getLocation().add(location);
		}
		return surfaceObs;
	}

	private Metadata createMetadata(Metadata metadata) throws DatatypeConfigurationException {
		metadata.setResourceID(attr.dyReportResourceID);
		metadata.setResourceName("中央氣象局氣候觀測_逐日_單一氣象要素資料");
		metadata.setResourceDescription("氣象局所屬氣象觀測站，逐日的單項氣象因子資料。");
		metadata.setLanguage("zh");
		metadata.setHomepage(attr.dyHomepage);
		
		XmlDY.Resources.Resource.Metadata.Sources sources = factory.createCwbdataResourcesResourceMetadataSources();
		XmlDY.Resources.Resource.Metadata.Sources.Source source1 = 
				factory.createCwbdataResourcesResourceMetadataSourcesSource();
		source1.setTitle("中央氣象局氣象測站代號及站況資料");
		source1.setPath(attr.reportObsPath);
		XmlDY.Resources.Resource.Metadata.Sources.Source source2 = 
				factory.createCwbdataResourcesResourceMetadataSourcesSource();
		source2.setTitle("Abbreviation for unit of measure - as defined within WMO "
				+ "No. 306 Common code-table C-6 1List of units for TDCFs1. (use wmo abbreviation)");
		source2.setPath(attr.reportWmoPath);
		sources.getSource().add(source1);
		sources.getSource().add(source2);
		metadata.setSources(sources);
		
		XmlDY.Resources.Resource.Metadata.Temporal temporal = 
				factory.createCwbdataResourcesResourceMetadataTemporal();
		temporal.setStartTime(Utility.getXmlDateTime(dataStartDate.atStartOfDay()));
		temporal.setEndTime(Utility.getXmlDateTime(dataEndDate.atTime(23, 59, 59)));
		metadata.setTemporal(temporal);
		
		XmlDY.Resources.Resource.Metadata.Spatial spatial = 
				factory.createCwbdataResourcesResourceMetadataSpatial();
		XmlDY.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem system = 
				factory.createCwbdataResourcesResourceMetadataSpatialCoordinateReferenceSystem();
		system.setEPSGCode("EPSG:4326");
		system.setName("WGS84");
		system.setDatum("World Geodetic System 1984");
		system.setCoordinateFormat("decimal degrees");
		spatial.setCoordinateReferenceSystem(system);
		metadata.setSpatial(spatial);
		
		XmlDY.Resources.Resource.Metadata.WeatherElements wes = 
				factory.createCwbdataResourcesResourceMetadataWeatherElements();
		wes.getWeatherElement().add(createWetherElement("precipitation", "降水量", "mm"
					, Arrays.asList("", "T", "X"), Arrays.asList("無觀測", "雨跡", "故障")));
		
		XmlDY.Resources.Resource.Metadata.WeatherElements.Statistics statistics = 
			factory.createCwbdataResourcesResourceMetadataWeatherElementsStatistics();
		XmlDY.Resources.Resource.Metadata.WeatherElements.Statistics.StatisticalPeriods periods = 
			factory.createCwbdataResourcesResourceMetadataWeatherElementsStatisticsStatisticalPeriods();
		XmlDY.Resources.Resource.Metadata.WeatherElements.Statistics.StatisticalPeriods.StatisticalPeriod period = 
			factory.createCwbdataResourcesResourceMetadataWeatherElementsStatisticsStatisticalPeriodsStatisticalPeriod();
		period.setPeriodTagName("monthly");
		period.setDescription("當月");
		periods.setStatisticalPeriod(period);
		statistics.setStatisticalPeriods(periods);
		
		XmlDY.Resources.Resource.Metadata.WeatherElements.Statistics.WeatherElement we = 
			factory.createCwbdataResourcesResourceMetadataWeatherElementsStatisticsWeatherElement();
		we.setTagName("precipitation");
		we.setDescription("降水量");
		we.setUnits("mm");
		XmlDY.Resources.Resource.Metadata.WeatherElements.Statistics.WeatherElement.StatisticalMethods methods = 
			factory.createCwbdataResourcesResourceMetadataWeatherElementsStatisticsWeatherElementStatisticalMethods();
		XmlDY.Resources.Resource.Metadata.WeatherElements.Statistics.WeatherElement.StatisticalMethods.StatisticalMethod method = 
			factory.createCwbdataResourcesResourceMetadataWeatherElementsStatisticsWeatherElementStatisticalMethodsStatisticalMethod();
		method.setMethodTagName("total");
		method.setDescription("當月降水量累積值");
		methods.setStatisticalMethod(method);
		we.setStatisticalMethods(methods);
		statistics.getWeatherElement().add(we);
		wes.setStatistics(statistics);
		
		metadata.setWeatherElements(wes);
		return metadata;
	}
	
	/**
	 * 
	 * @param tagName
	 * @param description
	 * @param format
	 * @param units
	 * @param specialValues
	 * @param specialDescriptions
	 * @return
	 */
	private XmlDY.Resources.Resource.Metadata.WeatherElements.WeatherElement 
				createWetherElement (String tagName, String description, String units
					, List<String> specialValues, List<String> specialDescriptions) {
		
		XmlDY.Resources.Resource.Metadata.WeatherElements.WeatherElement we = 
				factory.createCwbdataResourcesResourceMetadataWeatherElementsWeatherElement();
		we.setTagName(tagName);
		we.setDescription(description);
		if(units != null && !units.isEmpty()) {
			we.setUnits(units);
		}
		if(specialValues != null && specialValues.size() > 0) {
			XmlDY.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues svs =
					factory.createCwbdataResourcesResourceMetadataWeatherElementsWeatherElementSpecialValues();
				for(int i=0; i<specialValues.size(); i++) {
					XmlDY.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues.SpecialValue sv = 
						factory.createCwbdataResourcesResourceMetadataWeatherElementsWeatherElementSpecialValuesSpecialValue();
					sv.setValue(specialValues.get(i));
					sv.setDescription(specialDescriptions.get(i));
					svs.getSpecialValue().add(sv);
				}
			we.setSpecialValues(svs);	
		}
		return we;
	}
	
}
