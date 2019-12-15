package com.iisi.newOpendataService.makeXml;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;

import com.iisi.newOpendataService.MakeFile;
import com.iisi.newOpendataService.dbEntity.DbNOAA;
import com.iisi.newOpendataService.utility.TimeInputException;
import com.iisi.newOpendataService.utility.Utility;
import com.iisi.newOpendataService.xml.XmlNOAA;
import com.iisi.newOpendataService.xml.XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics;
import com.iisi.newOpendataService.xml.XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics.Location;
import com.iisi.newOpendataService.xml.XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics.Location.Temperature;
import com.iisi.newOpendataService.xml.XmlNOAA.Resources.Resource.Metadata;
import com.iisi.newOpendataService.xml.XmlNOAAObjectFactory;


public abstract class MakeNOAAXml extends MakeXmlTemplate<DbNOAA, XmlNOAA> {

	private String datasetId;
	private String dataItemId;
	private String datasetName;
	private String resourceName;
	private String resourceDescription;
	private String language;
	private String precpDct;
	private String sP98Dct;
	private String sP9991Dct;
	private String sP99995Dct;
	private String sP99996Dct;
	private String sP99997Dct;
	private String sP99999Dct;
	private String sPUnobservedDct;
	private String tempDct;
	private String maxTempDct;
	private String minTempDct;
	private String sT997Dct;
	
	
	@Autowired
	private XmlNOAAObjectFactory factory;

	protected LocalDate startDate;

	protected void setType(boolean isChinese, boolean isManual) {
		if(isChinese) {
			this.datasetName = "每日氣象";
			this.language = "zh";
			this.precpDct = "日累積雨量";
			this.sP98Dct = "雨跡";
			this.sP9991Dct = "儀器故障待修";
			this.sP99995Dct = "儀器故障";
			this.sP99996Dct = "資料累計於後";
			this.sP99997Dct = "因不明原因或故障而無資料";
			this.sP99999Dct = "未觀測而無資料";
			this.sPUnobservedDct = "無觀測";
			this.tempDct = "日溫度統計";
			this.maxTempDct = "日最高溫";
			this.minTempDct = "日最低溫";
			this.sT997Dct = "儀器故障";
			if (isManual) {
				datasetId = attr.manualNoaaCNDatasetID;
				dataItemId = attr.manualNoaaCNDataItemID;
				resourceName = "中央氣象局有人氣象站逐日觀測資料";
				resourceDescription = "中央氣象局有人氣象站逐日觀測資料";
			} else {
				datasetId = attr.autoNoaaCNDatasetID;
				dataItemId = attr.autoNoaaCNDataItemID;
				resourceName = "中央氣象局自動氣象站逐日觀測資料";
				resourceDescription = "中央氣象局自動氣象站逐日觀測資料";
			}
		} else {
			this.datasetName = "Daily_Weather";
			this.language = "en";
			this.precpDct = "Daily accumulated rainfall";
			this.sP98Dct = "Trace";
			this.sP9991Dct = "Instrument failure to be repaired";
			this.sP99995Dct = "Instrument failure";
			this.sP99996Dct = "Data accumulated after";
			this.sP99997Dct = "No data for unknown reasons or malfunction";
			this.sP99999Dct = "No data due to unobserved";
			this.sPUnobservedDct = "Unobserved";
			this.tempDct = "Daily temperature";
			this.maxTempDct = "The highest temperature of the day";
			this.minTempDct = "The lowest temperature of the day";
			this.sT997Dct = "Instrument failure";
			if (isManual) {
				datasetId = attr.manualNoaaENDatasetID;
				dataItemId = attr.manualNoaaENDataItemID;
				resourceName = "CWB_Daily_PWS";
				resourceDescription = "CWB Observaton Data_Daily_Personal weather station";
			} else {
				datasetId = attr.autoNoaaENDatasetID;
				dataItemId = attr.autoNoaaENDataItemID;
				resourceName = "CWB_Daily_AWS";
				resourceDescription = "CWB Observaton Data_Daily_Automatic weather station";
			}
		}
		
	}

	@Override
	public void setParameters(String... arg) throws TimeInputException, NumberFormatException, DateTimeException {
		if (arg.length == 0) {
			this.startDate = LocalDate.now().minusDays(1);
//			this.startDate = LocalDate.of(2019, 8, 25); // test only
		} else {
			String[] date = arg[0].split(MakeFile.timeSplitter);
			this.startDate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]),
					Integer.parseInt(date[2]));
			if (startDate.isAfter(LocalDate.now().minusDays(1))) {
				throw new TimeInputException(
						"NOAA report error: user should not input time that is later then yesterday");
			}
		}
	}

	@Override
	protected Class<XmlNOAA> getXmlClass() {
		return XmlNOAA.class;
	}


	@Override
	protected XmlNOAA createCwbData(List<DbNOAA> dbEntity) throws DatatypeConfigurationException {
		XmlNOAA cwbData = factory.createCwbdata();
		cwbData.setIdentifier(UUID.randomUUID().toString());
		cwbData.setDatasetID(this.datasetId);
		cwbData.setDatasetName(datasetName);
		cwbData.setDataItemID(this.dataItemId);
		cwbData.setSender(attr.SENDER);
		cwbData.setSent(Utility.getXmlDateTime(LocalDateTime.now()));
		cwbData.setStatus(attr.STATUS_ACTUAL);
		cwbData.setScope(attr.SCOPE_PUBLIC);
		cwbData.setMsgType(attr.MSG_TYPE_ISSUE);
		cwbData.setPublisherOID(attr.PUBLISHER_OID);

		XmlNOAA.Resources resources = factory.createCwbdataResources();
		XmlNOAA.Resources.Resource resource = factory.createCwbdataResourcesResource();
		XmlNOAA.Resources.Resource.Metadata metadata = factory.createCwbdataResourcesResourceMetadata();
		metadata = createMetadata(metadata);
		resource.setMetadata(metadata);

		XmlNOAA.Resources.Resource.Data data = factory.createCwbdataResourcesResourceData();
		XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics surfaceObsDailyStatistics = factory
				.createCwbdataResourcesResourceDataSurfaceObsDailyStatistics();
		surfaceObsDailyStatistics = createSurfaceObs(surfaceObsDailyStatistics, dbEntity);
		data.setSurfaceObsDailyStatistics(surfaceObsDailyStatistics);
		resource.setData(data);
		resources.setResource(resource);
		cwbData.setResources(resources);
		return cwbData;
	}

	private SurfaceObsDailyStatistics createSurfaceObs(SurfaceObsDailyStatistics surfaceObsDailyStatistics,
			List<DbNOAA> dbEntity) throws DatatypeConfigurationException {
		surfaceObsDailyStatistics.setDataDate(Utility.getXmlDate(startDate));
		dbEntity.sort(Comparator.comparing(DbNOAA::getStno));
		for(DbNOAA e : dbEntity) {
			Location location = factory.createCwbdataResourcesResourceDataSurfaceObsDailyStatisticsLocation();
			location.setStationID(e.getStno());
			if(e.getPrecp() == null){
				location.setPrecipitation("");
			} else {
				location.setPrecipitation(e.getPrecp());
			}
			Temperature tmp = factory.createCwbdataResourcesResourceDataSurfaceObsDailyStatisticsLocationTemperature();
			if(e.getTxMaxAbs() == null) {
				tmp.setMaximum("");
			} else {
				tmp.setMaximum(e.getTxMaxAbs());
			}
			if(e.getTxMinAbs() == null) {
				tmp.setMinimum("");
			} else {
				tmp.setMinimum(e.getTxMinAbs());
			}
			location.setTemperature(tmp);
			surfaceObsDailyStatistics.getLocation().add(location);
		}
		return surfaceObsDailyStatistics;
	}

	private Metadata createMetadata(Metadata metadata) throws DatatypeConfigurationException {
		metadata.setResourceName(this.resourceName);
		metadata.setResourceDescription(this.resourceDescription);
		metadata.setLanguage(this.language);

		/*
		XmlNOAA.Resources.Resource.Metadata.Sources sources = factory.createCwbdataResourcesResourceMetadataSources();
		XmlNOAA.Resources.Resource.Metadata.Sources.Source source = factory
				.createCwbdataResourcesResourceMetadataSourcesSource();
		source.setTitle("中央氣象局氣象測站代號及站況資料");
		source.setPath(attr.reportObsPath);
		sources.setSource(source);
		*/

		XmlNOAA.Resources.Resource.Metadata.Temporal temporal = factory
				.createCwbdataResourcesResourceMetadataTemporal();
		temporal.setDataDate(Utility.getXmlDate(startDate));
		metadata.setTemporal(temporal);
		
		XmlNOAA.Resources.Resource.Metadata.WeatherElements wes = 
				factory.createCwbdataResourcesResourceMetadataWeatherElements();
		wes.getWeatherElement().add(createWetherElement("precipitation", this.precpDct, "mm"
				, Arrays.asList("-9.8", "-999.1", "-9999.5", "-9999.6", "-9999.7", "-9999.9", "")
				, Arrays.asList(this.sP98Dct, this.sP9991Dct, this.sP99995Dct, this.sP99996Dct, this.sP99997Dct, this.sP99999Dct, this.sPUnobservedDct)));
		
		XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement tmp = createWetherElement("temperature", this.tempDct, "˚C"
				, Arrays.asList("-99.7")
				, Arrays.asList(this.sT997Dct));
		XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.StatisticalMethods methods = 
				factory.createCwbdataResourcesResourceMetadataWeatherElementsWeatherElementStatisticalMethods();
		XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.StatisticalMethods.StatisticalMethod method1 = 
			factory.createCwbdataResourcesResourceMetadataWeatherElementsWeatherElementStatisticalMethodsStatisticalMethod();
		method1.setMethodTagName("maximum");
		method1.setDescription(this.maxTempDct);
		methods.getStatisticalMethod().add(method1);
		XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.StatisticalMethods.StatisticalMethod method2 = 
				factory.createCwbdataResourcesResourceMetadataWeatherElementsWeatherElementStatisticalMethodsStatisticalMethod();
		method2.setMethodTagName("minimum");
		method2.setDescription(this.minTempDct);
		methods.getStatisticalMethod().add(method2);
		tmp.setStatisticalMethods(methods);
		wes.getWeatherElement().add(tmp);
		
		metadata.setWeatherElements(wes);
		return metadata;
	}

	private XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement createWetherElement(String tagName,
			String description, String units, List<String> specialValues, List<String> specialDescriptions) {

		XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement we = factory
				.createCwbdataResourcesResourceMetadataWeatherElementsWeatherElement();
		we.setTagName(tagName);
		we.setDescription(description);
		if (units != null && !units.isEmpty()) {
			we.setUnits(units);
		}
		if (specialValues != null && specialValues.size() > 0) {
			XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues svs = factory
					.createCwbdataResourcesResourceMetadataWeatherElementsWeatherElementSpecialValues();
			for (int i = 0; i < specialValues.size(); i++) {
				XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues.SpecialValue sv = factory
						.createCwbdataResourcesResourceMetadataWeatherElementsWeatherElementSpecialValuesSpecialValue();
				sv.setValue(specialValues.get(i));
				sv.setDescription(specialDescriptions.get(i));
				svs.getSpecialValue().add(sv);
			}
			we.setSpecialValues(svs);
		}
		return we;
	}

}
