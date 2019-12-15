package com.iisi.newOpendataService.makeXml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iisi.newOpendataService.MakeFile;
import com.iisi.newOpendataService.dbEntity.DbMN;
import com.iisi.newOpendataService.utility.MakeFileServiceType;
import com.iisi.newOpendataService.utility.TimeInputException;
import com.iisi.newOpendataService.utility.Utility;
import com.iisi.newOpendataService.xml.XmlMN;
import com.iisi.newOpendataService.xml.XmlMN.Resources;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Data;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Data.SurfaceObs;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Data.SurfaceObs.Location;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Data.SurfaceObs.Location.Station;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.GustDirection;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.GustSpeed;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Precipitation;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.RelativeHumidity;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.StationPressure;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.SunshineDuration;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.WindDirection;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.WindSpeed;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Metadata;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Metadata.Sources;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Metadata.Sources.Source;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Metadata.Spatial;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Metadata.Statistics;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Metadata.Statistics.SpecialValues;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Metadata.Statistics.SpecialValues.SpecialValue;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Metadata.Statistics.StatisticalPeriods;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Metadata.Statistics.StatisticalPeriods.StatisticalPeriod;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Metadata.Statistics.WeatherElements;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Metadata.Statistics.WeatherElements.WeatherElement;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Metadata.Statistics.WeatherElements.WeatherElement.StatisticalMethods;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Metadata.Statistics.WeatherElements.WeatherElement.StatisticalMethods.StatisticalMethod;
import com.iisi.newOpendataService.xml.XmlMN.Resources.Resource.Metadata.Temporal;
import com.iisi.newOpendataService.xml.XmlMNObjectFactory;

@Service
public class MakeMNXml extends MakeXmlTemplate<DbMN, XmlMN> {

	@Autowired
	private XmlMNObjectFactory factory;
		
	private LocalDate startDate;
	private LocalDate endDate;
	
	@Override
	protected List<DbMN> query() {
		return query.query(startDate, endDate);
	}

	@Override
	public void setParameters(String... arg) throws TimeInputException {
		if(arg.length == 0) {
			LocalDate temp = LocalDate.now().minusMonths(1);
			this.startDate = LocalDate.of(temp.getYear(), temp.getMonth(), 1);
			this.endDate = LocalDate.of(temp.getYear(), temp.getMonth(), temp.getMonth().maxLength());
		} else {
			String[] date = arg[0].split(MakeFile.timeSplitter);
			this.startDate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), 1);
			this.endDate = LocalDate.of(startDate.getYear(), startDate.getMonth(), startDate.lengthOfMonth());
			if(endDate.isAfter(LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth().minus(1)
					, LocalDate.now().getMonth().minus(1).maxLength()))) {
				throw new TimeInputException("mn_report error: user should only input month that is before(included) last month.");
			}
		}
	}
	
	@Override
	protected Class<XmlMN> getXmlClass() {
		return XmlMN.class;
	}

	@Override
	protected String getFilename() {
		return attr.mnFilename;
	}
	
	@Override
	protected List<String> getDestinationFolders() {
		return attr.mnReportFolder;
	}

	@Override
	protected void register() {
		super.register(MakeFileServiceType.MNReport, "makeMNXml");
	}
	
	///////
	/////// make xml
	///////
	@Override
	protected XmlMN createCwbData(List<DbMN> locationDatas) throws DatatypeConfigurationException {
		XmlMN cwbData = factory.createCwbdata();
		cwbData.setIdentifier(UUID.randomUUID().toString());
		cwbData.setDatasetID(attr.mnReportDatasetID);
		cwbData.setDatasetName(attr.DATASET_NAME);
		cwbData.setDataItemID(attr.mnReportDataItemID);
		cwbData.setSender(attr.SENDER);
		cwbData.setSent(Utility.getXmlDateTime(LocalDateTime.now()));
		cwbData.setStatus(attr.STATUS_ACTUAL);
		cwbData.setScope(attr.SCOPE_PUBLIC);
		cwbData.setMsgType(attr.MSG_TYPE_ISSUE);
		cwbData.setPublisherOID(attr.PUBLISHER_OID);
		
		Resources resources = factory.createCwbdataResources();
		Resources.Resource resource = factory.createCwbdataResourcesResource();
		Metadata metadata = factory.createCwbdataResourcesResourceMetadata();
		metadata = createMetadata(metadata);
		resource.setMetadata(metadata);
		
		Data data = factory.createCwbdataResourcesResourceData();
		SurfaceObs surfaceObs = factory.createCwbdataResourcesResourceDataSurfaceObs();
		surfaceObs = createSurfaceObs(surfaceObs, locationDatas);
		data.setSurfaceObs(surfaceObs);
		resource.setData(data);		
		resources.setResource(resource);
		cwbData.setResources(resources);
		return cwbData;
	}

	private SurfaceObs createSurfaceObs(SurfaceObs surfaceObs, List<DbMN> locationDatas) throws DatatypeConfigurationException {
		
		for(DbMN item :locationDatas) {
			Location location = factory.createCwbdataResourcesResourceDataSurfaceObsLocation();
			
			Station station = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStation();
			station.setStationID(item.getStno());
			station.setStationName(item.getStnCName());
			station.setStationNameEN(item.getStnEName());
			station.setStationAttribute(Utility.getStationAttribution(item.getStno()));
			location.setStation(station);
			
			StationObsStatistics statistics = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatistics();
			String monthS = startDate.getMonthValue() <= 9 ? "0"+String.valueOf(startDate.getMonthValue()) : String.valueOf(startDate.getMonthValue());
			statistics.setDataYearMonth(startDate.getYear() + "-" + monthS);
			
			/// temperature
			Temperature temp = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsTemperature();
			Temperature.Monthly tempM = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsTemperatureMonthly();
			tempM.setMean(item.getTx());
			tempM.setMaximum(item.getTxMaxAbs());
			tempM.setMaximumDate(Utility.getXmlDate(item.getTxMaxAbsDate().toLocalDateTime().toLocalDate()));
			tempM.setMinimum(item.getTxMinAbs());
			tempM.setMinimumDate(Utility.getXmlDate(item.getTxMinAbsDate().toLocalDateTime().toLocalDate()));
			temp.setMonthly(tempM);
			statistics.setTemperature(temp);
			
			
			/// precipitation
			Precipitation precp = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsPrecipitation();
			Precipitation.Monthly precpM = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsPrecipitationMonthly();
			precpM.setAccumulation(item.getPrecp());
			precpM.setGE01Days(item.getPrecpGE01Day());
			precp.setMonthly(precpM);
			statistics.setPrecipitation(precp);
			
			
			/// windSpeed
			WindSpeed ws = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsWindSpeed();
			WindSpeed.Monthly wsM = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsWindSpeedMonthly();
			wsM.setMaximum(item.getWindSpeedMax());
			wsM.setMaximumDate(Utility.getXmlDate(item.getWindSpeedMaxDate().toLocalDateTime().toLocalDate()));
			ws.setMonthly(wsM);
			statistics.setWindSpeed(ws);
			
			
			/// windDirection
			WindDirection wd = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsWindDirection();
			WindDirection.Monthly wdM = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsWindDirectionMonthly();
			wdM.setMaximum(item.getWindSpeedMaxDir());
			wd.setMonthly(wdM);
			statistics.setWindDirection(wd);
			
			/// gustSpeed
			GustSpeed gs = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsGustSpeed();
			GustSpeed.Monthly gsM = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsGustSpeedMonthly();
			gsM.setMaximum(item.getGustSpeedMax());
			gsM.setMaximumDate(Utility.getXmlDate(item.getGustSpeedMaxDate().toLocalDateTime().toLocalDate()));
			gs.setMonthly(gsM);
			statistics.setGustSpeed(gs);
			
			/// gustDirection
			GustDirection gsd = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsGustDirection();
			GustDirection.Monthly gsdM = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsGustDirectionMonthly();
			gsdM.setMaximum(item.getGustSpeedMaxDir());
			gsd.setMonthly(gsdM);
			statistics.setGustDirection(gsd);
			
			/// relativeHumidity
			RelativeHumidity rh = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsRelativeHumidity();
			RelativeHumidity.Monthly rhM = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsRelativeHumidityMonthly();
			rhM.setMean(item.getRh());
			rhM.setMinimum(item.getRhMin());
			rhM.setMinimumDate(Utility.getXmlDate(item.getRhMinTime().toLocalDateTime().toLocalDate()));
			rh.setMonthly(rhM);
			statistics.setRelativeHumidity(rh);
			
			/// stationPressure
			StationPressure stnP = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsStationPressure();
			StationPressure.Monthly stnPM = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsStationPressureMonthly();
			stnPM.setMean(item.getStnPres());
			stnP.setMonthly(stnPM);
			statistics.setStationPressure(stnP);
			
			/// sunshineDuration
			SunshineDuration sd = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsSunshineDuration();
			SunshineDuration.Monthly sdM = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsSunshineDurationMonthly();
			sdM.setTotal(item.getSunShine());
			sd.setMonthly(sdM);
			statistics.setSunshineDuration(sd);
			
			location.setStationObsStatistics(statistics);
			surfaceObs.getLocation().add(location);
		}
		
		return surfaceObs;
	}
	

	private Metadata createMetadata(Metadata metadata) throws DatatypeConfigurationException {
		metadata.setResourceID(attr.mnReportResourceID);
		metadata.setResourceName("中央氣象局氣候觀測_逐月_多要素氣象資料");
		metadata.setResourceDescription("氣象局所屬氣象觀測站，逐月的各項氣象因子資料。");
		metadata.setLanguage("zh");
		metadata.setHomepage(attr.mnHomepage);
		
		Sources sources = factory.createCwbdataResourcesResourceMetadataSources();
		Source source1 = factory.createCwbdataResourcesResourceMetadataSourcesSource();
		source1.setTitle("中央氣象局氣象測站代號及站況資料");
		source1.setPath(attr.reportObsPath);
		Source source2 = factory.createCwbdataResourcesResourceMetadataSourcesSource();
		source2.setTitle("Abbreviation for unit of measure - as defined within WMO "
				+ "No. 306 Common code-table C-6 1List of units for TDCFs1. (use wmo abbreviation)");
		source2.setPath(attr.reportWmoPath);
		sources.getSource().add(source1);
		sources.getSource().add(source2);
		metadata.setSources(sources);
		
		Temporal temporal = factory.createCwbdataResourcesResourceMetadataTemporal();
		temporal.setStartTime(Utility.getXmlDateTime(startDate.atTime(0, 0, 0)));
		temporal.setEndTime(Utility.getXmlDateTime(endDate.atTime(0, 0, 0)));
		metadata.setTemporal(temporal);
		
		Spatial spatial = factory.createCwbdataResourcesResourceMetadataSpatial();
		spatial.setDescription("中央氣象局所屬氣象觀測站");
		metadata.setSpatial(spatial);
		
		Statistics statistics = factory.createCwbdataResourcesResourceMetadataStatistics();
		
		StatisticalPeriods periods = factory.createCwbdataResourcesResourceMetadataStatisticsStatisticalPeriods();
		StatisticalPeriod period = factory.createCwbdataResourcesResourceMetadataStatisticsStatisticalPeriodsStatisticalPeriod();
		period.setPeriodTagName("monthly");
		period.setDescription("逐月");
		periods.setStatisticalPeriod(period);
		statistics.setStatisticalPeriods(periods);
		
		WeatherElements wes = factory.createCwbdataResourcesResourceMetadataStatisticsWeatherElements();
		wes.getWeatherElement().add(createWeatherElement("temperature", "溫度", "˚C", Arrays.asList("mean", "maximum", "maximumDate", "minimum", "minimumDate")
											,Arrays.asList("平均溫度", "最高溫度", "最高溫度發生日期", "最低溫度", "最低溫度發生日期")));
		wes.getWeatherElement().add(createWeatherElement("precipitation", "降水量", "mm", Arrays.asList("accumulation", "GE01Days")
											,Arrays.asList("累積降水量", "降雨日數, 降雨量&gt;=0.1mm日數,Number of Days with Precipitation &gt;=0.1mm")));
		wes.getWeatherElement().add(createWeatherElement("windSpeed", "10分鐘風風速", "m s^-1", Arrays.asList("maximum", "maximumDate")
											,Arrays.asList("最大10分鐘風風速", "最大10分鐘風發生日期")));
		wes.getWeatherElement().add(createWeatherElement("windDirection", "10分鐘風風向", "˚", Arrays.asList("maximum")
											,Arrays.asList("最大10分鐘風風向")));
		wes.getWeatherElement().add(createWeatherElement("gustSpeed", "瞬間風風速", "m s^-1", Arrays.asList("maximum", "maximumDate")
											,Arrays.asList("最大瞬間風風速", "最大瞬間風發生日期")));
		wes.getWeatherElement().add(createWeatherElement("gustDirection", "瞬間風風向", "˚", Arrays.asList("maximum")
											,Arrays.asList("最大瞬間風風向")));
		wes.getWeatherElement().add(createWeatherElement("relativeHumidity", "相對溼度", "%", Arrays.asList("mean", "minimum", "minimumDate")
											,Arrays.asList("平均相對濕度", "最小相對濕度", "最小相對濕度發生日期")));
		wes.getWeatherElement().add(createWeatherElement("stationPressure", "測站氣壓", "hPa", Arrays.asList("mean")
											,Arrays.asList("平均測站氣壓")));
		wes.getWeatherElement().add(createWeatherElement("sunshineDuration", "日照時數", "hr", Arrays.asList("total")
											,Arrays.asList("總日照時數")));
		statistics.setWeatherElements(wes);
		
		SpecialValues sps = factory.createCwbdataResourcesResourceMetadataStatisticsSpecialValues();
		SpecialValue sp = factory.createCwbdataResourcesResourceMetadataStatisticsSpecialValuesSpecialValue();
		sp.setValue("");
		sp.setDescription("無觀測");
		sps.getSpecialValue().add(sp);
		statistics.setSpecialValues(sps);
		
		metadata.setStatistics(statistics);
		
		return metadata;
	}
	
	
	private WeatherElement createWeatherElement(String tagName, String description, String units
				, List<String> methodTagName, List<String> methodDescription) {
		
		WeatherElement we = factory.createCwbdataResourcesResourceMetadataStatisticsWeatherElementsWeatherElement();
		we.setTagName(tagName);
		we.setDescription(description);
		if(units != null) {
			we.setUnits(units);
		}
		StatisticalMethods methods = factory.createCwbdataResourcesResourceMetadataStatisticsWeatherElementsWeatherElementStatisticalMethods();
		for(int i=0; i<methodTagName.size(); i++) {
			StatisticalMethod method = factory.createCwbdataResourcesResourceMetadataStatisticsWeatherElementsWeatherElementStatisticalMethodsStatisticalMethod();
			method.setMethodTagName(methodTagName.get(i));
			method.setDescription(methodDescription.get(i));
			methods.getStatisticalMethod().add(method);
		}
		we.setStatisticalMethods(methods);
		return we;
	}


}
