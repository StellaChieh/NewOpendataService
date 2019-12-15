package com.iisi.newOpendataService.makeXml;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
import com.iisi.newOpendataService.dbEntity.DbDay7HourlyRain;
import com.iisi.newOpendataService.utility.TimeInputException;
import com.iisi.newOpendataService.utility.Utility;
import com.iisi.newOpendataService.utility.MakeFileServiceType;
import com.iisi.newOpendataService.xml.XmlDay7HourlyRain;
import com.iisi.newOpendataService.xml.XmlDay7HourlyRain.Resources.Resource.Data.SurfaceObs;
import com.iisi.newOpendataService.xml.XmlDay7HourlyRain.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes;
import com.iisi.newOpendataService.xml.XmlDay7HourlyRain.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime;
import com.iisi.newOpendataService.xml.XmlDay7HourlyRain.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime.WeatherElements;
import com.iisi.newOpendataService.xml.XmlDay7HourlyRain.Resources.Resource.Metadata;
import com.iisi.newOpendataService.xml.XmlDay7HourlyRain.Resources.Resource.Metadata.WeatherElements.SpecialValues;
import com.iisi.newOpendataService.xml.XmlDay7HourlyRain.Resources.Resource.Metadata.WeatherElements.SpecialValues.SpecialValue;
import com.iisi.newOpendataService.xml.XmlDay7HourlyRainObjectFactory;

@Service
public class MakeDay7HourlyRain extends MakeXmlTemplate<DbDay7HourlyRain , XmlDay7HourlyRain> {
	
	@Autowired
	private XmlDay7HourlyRainObjectFactory factory;
	
	private LocalDate startDate;
	private LocalDate endDate;

	@Override
	public void setParameters(String... arg) throws TimeInputException, NumberFormatException, DateTimeException {
		if(arg.length == 0) {
			this.endDate = LocalDate.now().minusDays(1);
			this.startDate = endDate.minusDays(6);
			
		} else {
			String[] date = arg[0].split(MakeFile.timeSplitter);
			this.endDate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
			this.startDate = endDate.minusDays(6);
			if(endDate.isAfter(LocalDate.now().minusDays(1))) {
				throw new TimeInputException("Day7HourlyRain error: user should not input time that is later then yesterday");
			}
		}
		// this file has "2018-12-02T24:00+08:00" format, only valid in version 1.1
		super.xmlVersion = "1.1";
	}

	@Override
	protected Class<XmlDay7HourlyRain> getXmlClass() {
		return XmlDay7HourlyRain.class;
	}

	@Override
	protected String getFilename() {
		return attr.day7HourlyRainFilename;
	}

	@Override
	protected List<String> getDestinationFolders() {
		return attr.day7HourlyRainFolder;
	}

	@Override
	protected void register() {
		super.register(MakeFileServiceType.Day7HourlyRain, "makeDay7HourlyRain");
	}

	@Override
	protected List<DbDay7HourlyRain> query() {
		return query.query(startDate, endDate.plusDays(1));
	}

	@Override
	protected XmlDay7HourlyRain createCwbData(List<DbDay7HourlyRain> dbEntity) throws DatatypeConfigurationException {
		XmlDay7HourlyRain cwbData = factory.createCwbdata();
		
		cwbData.setIdentifier(UUID.randomUUID().toString());
		cwbData.setDatasetID(attr.day7HourlyRainDatasetID);
		cwbData.setDatasetName(attr.DATASET_NAME);
		cwbData.setDataItemID(attr.day7HourlyRainDataItemID);
		cwbData.setSender(attr.SENDER);
		cwbData.setSent(Utility.getXmlDateTime(LocalDateTime.now()));
		cwbData.setStatus(attr.STATUS_ACTUAL);
		cwbData.setScope(attr.SCOPE_PUBLIC);
		cwbData.setMsgType(attr.MSG_TYPE_ISSUE);
		cwbData.setPublisherOID(attr.PUBLISHER_OID);
		
		XmlDay7HourlyRain.Resources resources = factory.createCwbdataResources();
		XmlDay7HourlyRain.Resources.Resource resource = factory.createCwbdataResourcesResource();
		XmlDay7HourlyRain.Resources.Resource.Metadata metadata = factory.createCwbdataResourcesResourceMetadata();
		metadata = createMetadata(metadata);
		resource.setMetadata(metadata);
		
		XmlDay7HourlyRain.Resources.Resource.Data data = factory.createCwbdataResourcesResourceData();
		XmlDay7HourlyRain.Resources.Resource.Data.SurfaceObs surfaceObs = factory.createCwbdataResourcesResourceDataSurfaceObs();
		surfaceObs = createSurfaceObs(surfaceObs, dbEntity);
		data.setSurfaceObs(surfaceObs);
		resource.setData(data);
		
		resources.setResource(resource);
		cwbData.setResources(resources);
		return cwbData;
	}

	private SurfaceObs createSurfaceObs(SurfaceObs surfaceObs, List<DbDay7HourlyRain> dbEntity) {
		
		Map<String, List<DbDay7HourlyRain>> map = dbEntity.stream().collect(
				Collectors.groupingBy(DbDay7HourlyRain::getStno, TreeMap::new, Collectors.toCollection(ArrayList::new))
				);
		
		for(Entry<String, List<DbDay7HourlyRain>> entry :map.entrySet()) {
			
			entry.getValue().sort(Comparator.comparing(DbDay7HourlyRain::getObsTime));
			XmlDay7HourlyRain.Resources.Resource.Data.SurfaceObs.Location location 
				= factory.createCwbdataResourcesResourceDataSurfaceObsLocation();
			XmlDay7HourlyRain.Resources.Resource.Data.SurfaceObs.Location.Station station 
				= factory.createCwbdataResourcesResourceDataSurfaceObsLocationStation();
			station.setStationID(entry.getValue().get(0).getStno());
			station.setStationName(entry.getValue().get(0).getStnCName());
			station.setStationNameEN(entry.getValue().get(0).getStnEName());
			location.setStation(station);
			
			StationObsTimes stationObsTimes = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsTimes();
			for(DbDay7HourlyRain entity : entry.getValue()) {
				
				StationObsTime stationObsTime = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsTimesStationObsTime();
				stationObsTime.setDataTime(Utility.transTo24HourTimeType(entity.getObsTime()));
				WeatherElements wes = factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsTimesStationObsTimeWeatherElements();
				wes.setPrecipitation(entity.getPrecp());
				stationObsTime.setWeatherElements(wes);
				stationObsTimes.getStationObsTime().add(stationObsTime);
			}
			location.setStationObsTimes(stationObsTimes);
			surfaceObs.getLocation().add(location);
		}
		return surfaceObs;
	}

	private Metadata createMetadata(Metadata metadata) throws DatatypeConfigurationException {
		metadata.setResourceID(attr.day7HourlyRainResourceID);
		metadata.setResourceName("中央氣象局氣候觀測_逐時_單一氣象要素資料");
		metadata.setResourceDescription("氣象局所屬氣象觀測站，過去七天逐時的單項氣象因子資料。");
		metadata.setLanguage("zh");
		metadata.setHomepage(attr.day7HourlyRainHomepage);
		
		XmlDay7HourlyRain.Resources.Resource.Metadata.Sources sources = factory.createCwbdataResourcesResourceMetadataSources();
		XmlDay7HourlyRain.Resources.Resource.Metadata.Sources.Source source1 = 
				factory.createCwbdataResourcesResourceMetadataSourcesSource();
		source1.setTitle("中央氣象局氣象測站代號及站況資料");
		source1.setPath(attr.reportObsPath);
		XmlDay7HourlyRain.Resources.Resource.Metadata.Sources.Source source2 = 
				factory.createCwbdataResourcesResourceMetadataSourcesSource();
		source2.setTitle("Abbreviation for unit of measure - as defined within WMO "
				+ "No. 306 Common code-table C-6 1List of units for TDCFs1. (use wmo abbreviation)");
		source2.setPath(attr.reportWmoPath);
		sources.getSource().add(source1);
		sources.getSource().add(source2);
		metadata.setSources(sources);
		
		XmlDay7HourlyRain.Resources.Resource.Metadata.Temporal temporal = 
				factory.createCwbdataResourcesResourceMetadataTemporal();
		temporal.setStartTime(Utility.getXmlDateTime(LocalDateTime.of(startDate, LocalTime.of(0, 0,0))));
		temporal.setEndTime(Utility.getXmlDateTime(LocalDateTime.of(endDate.plusDays(1), LocalTime.of(0, 0,0))));
		metadata.setTemporal(temporal);
		
		XmlDay7HourlyRain.Resources.Resource.Metadata.Spatial spatial = 
				factory.createCwbdataResourcesResourceMetadataSpatial();
		spatial.setDescription("中央氣象局所屬氣象觀測站");
		metadata.setSpatial(spatial);
		
		XmlDay7HourlyRain.Resources.Resource.Metadata.WeatherElements wes = factory
				.createCwbdataResourcesResourceMetadataWeatherElements();
		XmlDay7HourlyRain.Resources.Resource.Metadata.WeatherElements.WeatherElement we = factory
				.createCwbdataResourcesResourceMetadataWeatherElementsWeatherElement();
		we.setTagName("precipitation");
		we.setDescription("降水量");
		we.setUnits("mm");
		wes.setWeatherElement(we);
		
		SpecialValues sps = factory.createCwbdataResourcesResourceMetadataWeatherElementsSpecialValues();
		sps.getSpecialValue().add(createSpecialValue("T", "微量 trace (雨量precipitation <0.1mm)"));
		sps.getSpecialValue().add(createSpecialValue("X", "故障 instrument malfunction"));
		sps.getSpecialValue().add(createSpecialValue("", "無觀測 no observation"));
		wes.setSpecialValues(sps);
		
		metadata.setWeatherElements(wes);
		
		return metadata;
		
	}
	
	private XmlDay7HourlyRain.Resources.Resource.Metadata.WeatherElements.SpecialValues.SpecialValue createSpecialValue(
			String value, String description){
		SpecialValue sp = factory.createCwbdataResourcesResourceMetadataWeatherElementsSpecialValuesSpecialValue();
		sp.setValue(value);
		sp.setDescription(description);
		return sp;
	}
	

}
