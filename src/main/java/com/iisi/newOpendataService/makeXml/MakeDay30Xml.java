package com.iisi.newOpendataService.makeXml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
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
import com.iisi.newOpendataService.dbEntity.DbDay30;
import com.iisi.newOpendataService.dbEntity.DbDay30.OneHourData;
import com.iisi.newOpendataService.utility.TimeInputException;
import com.iisi.newOpendataService.utility.Utility;
import com.iisi.newOpendataService.utility.MakeFileServiceType;
import com.iisi.newOpendataService.xml.XmlDay30;
import com.iisi.newOpendataService.xml.XmlDay30ObjectFactory;

@Service
public class MakeDay30Xml extends MakeXmlTemplate<DbDay30, XmlDay30> {

	@Autowired
	private XmlDay30ObjectFactory factory;

	private LocalDate startDate;

	private LocalDate endDate;

	@Override
	public void setParameters(String... arg) throws TimeInputException {
		if (arg.length == 0) {
			this.endDate = LocalDate.now().minusDays(1);
			this.startDate = endDate.minusDays(30);
		} else {
			String[] date = arg[0].split(MakeFile.timeSplitter);
			this.endDate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]),
					Integer.parseInt(date[2]));
			this.startDate = endDate.minusDays(30);
			if (endDate.isAfter(LocalDate.now().minusDays(1))) {
				throw new TimeInputException("day30 error: user should not input time that is later then yesterday");
			}
		}

		// this file has "2018-12-02T24:00+08:00" format, only valid in version 1.1
		super.xmlVersion = "1.1";
	}

	@Override
	protected List<DbDay30> query() {
		return query.query(startDate, endDate);
	}

	@Override
	protected Class<XmlDay30> getXmlClass() {
		return XmlDay30.class;
	}

	@Override
	protected String getFilename() {
		return attr.day30Filename;
	}

	@Override
	protected List<String> getDestinationFolders() {
		return attr.day30Folder;
	}

	@Override
	protected void register() {
		super.register(MakeFileServiceType.Day30Report, "makeDay30Xml");
	}

	@Override
	protected XmlDay30 createCwbData(List<DbDay30> locationDatas) throws DatatypeConfigurationException {
		XmlDay30 cwbData = factory.createCwbdata();

		cwbData.setIdentifier(UUID.randomUUID().toString());
		cwbData.setDatasetID(attr.day30DatasetID);
		cwbData.setDatasetName(attr.DATASET_NAME);
		cwbData.setDataItemID(attr.day30DataItemID);
		cwbData.setSender(attr.SENDER);
		cwbData.setSent(Utility.getXmlDateTime(LocalDateTime.now()));
		cwbData.setStatus(attr.STATUS_ACTUAL);
		cwbData.setScope(attr.SCOPE_PUBLIC);
		cwbData.setMsgType(attr.MSG_TYPE_ISSUE);
		cwbData.setPublisherOID(attr.PUBLISHER_OID);

		XmlDay30.Resources resources = factory.createCwbdataResources();
		XmlDay30.Resources.Resource resource = factory.createCwbdataResourcesResource();
		XmlDay30.Resources.Resource.Metadata metadata = factory.createCwbdataResourcesResourceMetadata();
		metadata = createMetadata(metadata);
		resource.setMetadata(metadata);

		XmlDay30.Resources.Resource.Data data = factory.createCwbdataResourcesResourceData();
		XmlDay30.Resources.Resource.Data.SurfaceObs surfaceObs = factory.createCwbdataResourcesResourceDataSurfaceObs();
		surfaceObs = createSurfaceObs(surfaceObs, locationDatas);
		data.setSurfaceObs(surfaceObs);
		resource.setData(data);

		resources.setResource(resource);
		cwbData.setResources(resources);
		return cwbData;
	}

	private XmlDay30.Resources.Resource.Data.SurfaceObs createSurfaceObs(
			XmlDay30.Resources.Resource.Data.SurfaceObs surfaceObs, List<DbDay30> locationDatas) throws DatatypeConfigurationException {
		Map<String, List<DbDay30>> stnMap = locationDatas.stream().collect(
				Collectors.groupingBy(DbDay30::getStno, TreeMap::new, Collectors.toCollection(ArrayList::new)));

		for (Entry<String, List<DbDay30>> entry : stnMap.entrySet()) {
			
			XmlDay30.Resources.Resource.Data.SurfaceObs.Location location = factory
					.createCwbdataResourcesResourceDataSurfaceObsLocation();
			XmlDay30.Resources.Resource.Data.SurfaceObs.Location.Station station = factory
					.createCwbdataResourcesResourceDataSurfaceObsLocationStation();
			station.setStationID(entry.getValue().get(0).getStno());
			station.setStationName(entry.getValue().get(0).getStnCName());
			station.setStationNameEN(entry.getValue().get(0).getStnEName());
			station.setStationAttribute(Utility.getStationAttribution(entry.getValue().get(0).getStno()));
			location.setStation(station);
			
			List<OneHourData> hours = entry.getValue().stream()
										.flatMap(e-> e.getHourlyDatas().values().stream())
										.sorted(Comparator.comparing(OneHourData::getObsTime))
										.collect(Collectors.toList());
			
			XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes times = factory
					.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsTimes();
			
			for(OneHourData hrData : hours) {
				XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime time = factory
						.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsTimesStationObsTime();
				// change time of "yyyy-MM-dd'T'23:59:00" to "yyyy-MM-dd'T'24:00:00"
				time.setDataTime(Utility.transTo24HourTimeType(hrData.getObsTime()));
				XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime.WeatherElements wes = factory
						.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsTimesStationObsTimeWeatherElements();
				wes.setStationPressure(hrData.getStnPres());
				wes.setTemperature(hrData.getTx());
				wes.setRelativeHumidity(hrData.getRh());
				wes.setPrecipitation(hrData.getPrecp());
				wes.setWindSpeed(hrData.getWs());
				wes.setWindDirectionDescription(hrData.getWdC() + "," + hrData.getWdE());
				wes.setPrecipitation(hrData.getPrecp());
				wes.setSunshineDuration(hrData.getSunshine());
				time.setWeatherElements(wes);
				times.getStationObsTime().add(time);
			}
			location.setStationObsTimes(times);
				
			XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics statistics = factory
					.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatistics();
			XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature temperature = factory
					.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsTemperature();
			entry.getValue().sort(Comparator.comparing(DbDay30::getObsTimeDate));
			for(DbDay30 dyData : entry.getValue()) {
				XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature.Daily daily = factory
						.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsTemperatureDaily();
				daily.setDataDate(Utility.getXmlDate(dyData.getObsTimeDate()));
				daily.setMaximum(dyData.getTxMaxAbs());
				daily.setMinimum(dyData.getTxMinAbs());
				daily.setMean(dyData.getTx());
				temperature.getDaily().add(daily);
			}
			statistics.setTemperature(temperature);
			location.setStationObsStatistics(statistics);
			
			surfaceObs.getLocation().add(location);
		}
		
		return surfaceObs;
	}

	private XmlDay30.Resources.Resource.Metadata createMetadata(XmlDay30.Resources.Resource.Metadata metadata) {

		metadata.setResourceID(attr.day30ResourceID);
		metadata.setResourceName("中央氣象局氣候觀測_逐時_多要素氣象資料");
		metadata.setResourceDescription("氣象局所屬氣象觀測站，逐時的各項氣象因子資料。");
		metadata.setLanguage("zh");
		metadata.setHomepage(attr.day30Homepage);

		XmlDay30.Resources.Resource.Metadata.Sources sources = factory.createCwbdataResourcesResourceMetadataSources();
		XmlDay30.Resources.Resource.Metadata.Sources.Source source1 = factory
				.createCwbdataResourcesResourceMetadataSourcesSource();
		source1.setTitle("中央氣象局氣象測站代號及站況資料");
		source1.setPath(attr.reportObsPath);
		XmlDay30.Resources.Resource.Metadata.Sources.Source source2 = factory
				.createCwbdataResourcesResourceMetadataSourcesSource();
		source2.setTitle("Abbreviation for unit of measure - as defined within WMO "
				+ "No. 306 Common code-table C-6 1List of units for TDCFs1. (use wmo abbreviation)");
		source2.setPath(attr.reportWmoPath);
		sources.getSource().add(source1);
		sources.getSource().add(source2);
		metadata.setSources(sources);

		XmlDay30.Resources.Resource.Metadata.Temporal temporal = factory
				.createCwbdataResourcesResourceMetadataTemporal();
		temporal.setStartTime(Utility.transTo24HourTimeType(startDate.atTime(01, 0, 0)));
		temporal.setEndTime(Utility.transTo24HourTimeType(endDate.atTime(23, 59, 0)));
		metadata.setTemporal(temporal);

		XmlDay30.Resources.Resource.Metadata.Spatial spatial = factory.createCwbdataResourcesResourceMetadataSpatial();
		spatial.setDescription("中央氣象局所屬氣象觀測站");
		XmlDay30.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem system = factory
				.createCwbdataResourcesResourceMetadataSpatialCoordinateReferenceSystem();
		system.setEPSGCode("EPSG:4326");
		system.setName("WGS84");
		system.setDatum("World Geodetic System 1984");
		system.setCoordinateFormat("decimal degrees");
		spatial.setCoordinateReferenceSystem(system);
		metadata.setSpatial(spatial);

		XmlDay30.Resources.Resource.Metadata.WeatherElements wes = factory
				.createCwbdataResourcesResourceMetadataWeatherElements();
		wes.getWeatherElement().add(createWetherElement("stationPressure", "測站氣壓", null, "hPa", Arrays.asList("", "X"),
				Arrays.asList("無觀測", "故障")));
		wes.getWeatherElement().add(createWetherElement("temperature", "溫度", null, "˚C", Arrays.asList("", "X"),
				Arrays.asList("無觀測", "故障")));
		wes.getWeatherElement().add(createWetherElement("relativeHumidity", "相對溼度", null, "%", Arrays.asList("", "X"),
				Arrays.asList("無觀測", "故障")));
		wes.getWeatherElement().add(createWetherElement("windSpeed", "風速", null, "m s^-1", Arrays.asList("", "X"),
				Arrays.asList("無觀測", "故障")));
		wes.getWeatherElement().add(createWetherElement("windDirectionDescription", "風向描述", "zh,en", null,
				Arrays.asList("", "X"), Arrays.asList("無觀測", "故障")));
		wes.getWeatherElement().add(createWetherElement("precipitation", "降水量", null, "mm", Arrays.asList("", "T", "X"),
				Arrays.asList("無觀測", "雨跡", "故障")));
		wes.getWeatherElement().add(createWetherElement("sunshineDuration", "日照時數", null, "hr", Arrays.asList("", "X"),
				Arrays.asList("無觀測", "故障")));
		metadata.setWeatherElements(wes);

		XmlDay30.Resources.Resource.Metadata.Statistics statistics = factory
				.createCwbdataResourcesResourceMetadataStatistics();
		XmlDay30.Resources.Resource.Metadata.Statistics.StatisticalPeriods periods = factory
				.createCwbdataResourcesResourceMetadataStatisticsStatisticalPeriods();
		XmlDay30.Resources.Resource.Metadata.Statistics.StatisticalPeriods.StatisticalPeriod period = factory
				.createCwbdataResourcesResourceMetadataStatisticsStatisticalPeriodsStatisticalPeriod();
		period.setPeriodTagName("daily");
		period.setDescription("每日統計(氣溫平均、最高、最低)");
		periods.getStatisticalPeriod().add(period);
		statistics.setStatisticalPeriods(periods);

		XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement sWe = factory
				.createCwbdataResourcesResourceMetadataStatisticsWeatherElement();
		sWe.setTagName("temperature");
		sWe.setDescription("溫度");
		sWe.setUnits("˚C");
		XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods methods = factory
				.createCwbdataResourcesResourceMetadataStatisticsWeatherElementStatisticalMethods();
		methods.getStatisticalMethod().add(this.createStatisticalMethod("minimum", "當日溫度最小值"));
		methods.getStatisticalMethod().add(this.createStatisticalMethod("maximum", "當日溫度最大值"));
		methods.getStatisticalMethod().add(this.createStatisticalMethod("mean", "當日溫度平均值"));
		sWe.setStatisticalMethods(methods);
		statistics.setWeatherElement(sWe);
		metadata.setStatistics(statistics);

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
	private XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement createWetherElement(String tagName,
			String description, String format, String units, List<String> specialValues,
			List<String> specialDescriptions) {

		XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement we = factory
				.createCwbdataResourcesResourceMetadataWeatherElementsWeatherElement();
		we.setTagName(tagName);
		we.setDescription(description);
		if (format != null && !format.isEmpty()) {
			we.setFormat(format);
		}
		if (units != null && !units.isEmpty()) {
			we.setUnits(units);
		}
		if (specialValues != null && specialValues.size() > 0) {
			XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues svs = factory
					.createCwbdataResourcesResourceMetadataWeatherElementsWeatherElementSpecialValues();
			for (int i = 0; i < specialValues.size(); i++) {
				XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues.SpecialValue sv = factory
						.createCwbdataResourcesResourceMetadataWeatherElementsWeatherElementSpecialValuesSpecialValue();
				sv.setValue(specialValues.get(i));
				sv.setDescription(specialDescriptions.get(i));
				svs.getSpecialValue().add(sv);
			}
			we.setSpecialValues(svs);
		}
		return we;
	}

	/**
	 * @param methodTagName
	 * @param description
	 * @return
	 */
	private XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods.StatisticalMethod createStatisticalMethod(
			String methodTagName, String description) {
		XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods.StatisticalMethod method = factory
				.createCwbdataResourcesResourceMetadataStatisticsWeatherElementStatisticalMethodsStatisticalMethod();
		method.setMethodTagName(methodTagName);
		method.setDescription(description);
		return method;
	}

}
