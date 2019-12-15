package com.iisi.newOpendataService.makeXml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iisi.newOpendataService.dbEntity.DbSummary;
import com.iisi.newOpendataService.utility.CwbColumns;
import com.iisi.newOpendataService.utility.TimeInputException;
import com.iisi.newOpendataService.utility.Utility;
import com.iisi.newOpendataService.utility.MakeFileServiceType;
import com.iisi.newOpendataService.xml.XmlSummary;
import com.iisi.newOpendataService.xml.XmlSummaryObjectFactory;

@Component
public class MakeSummaryXml extends MakeXmlTemplate<DbSummary, XmlSummary> {

	@Autowired
	private XmlSummaryObjectFactory factory;
		
	private int startYear;
	
	@Override
	public void setParameters(String... arg) throws TimeInputException {
		if(arg.length == 0) {
			startYear = ((LocalDate.now().getYear()/10)*10 - 30)+1;
		} else {
			startYear = Integer.parseInt(arg[0]);
			if(startYear % 10 != 1) {
				throw new TimeInputException("Summary report error: Input year should only end with '1', like '2001', '2011'.");
			}
			
			int lastYear = (LocalDate.now().getYear()/10)*10;
			if (startYear+29 > lastYear) {
				throw new TimeInputException("Summary report error: Input year sould not be newer than " + lastYear + ".");
			}
		}
	}

	@Override
	protected List<DbSummary> query() {
		return query.query(LocalDate.of(startYear, 1, 1), null);
	}

	@Override
	protected Class<XmlSummary> getXmlClass() {
		return XmlSummary.class;
	}

	@Override
	protected String getFilename() {
		return attr.summaryFilename;
	}
	
	@Override
	protected List<String> getDestinationFolders() {
		return attr.summaryReportFolder;
	}

	@Override
	protected void register() {
		super.register(MakeFileServiceType.SummaryReport, "makeSummaryXml");
	}
	
	@Override
	protected XmlSummary createCwbData(List<DbSummary> locationDatas) throws DatatypeConfigurationException {
		XmlSummary cwbData = factory.createCwbdata();
		cwbData.setIdentifier(UUID.randomUUID().toString());
		cwbData.setDatasetID(attr.summaryReportDatasetID);
		cwbData.setDatasetName(attr.DATASET_NAME);
		cwbData.setDataItemID(attr.summaryReportDataItemID);
		cwbData.setSender(attr.SENDER);
		cwbData.setSent(Utility.getXmlDateTime(LocalDateTime.now()));
		cwbData.setStatus(attr.STATUS_ACTUAL);
		cwbData.setScope(attr.SCOPE_PUBLIC);
		cwbData.setMsgType(attr.MSG_TYPE_ISSUE);
		cwbData.setPublisherOID(attr.PUBLISHER_OID);
		
		XmlSummary.Resources resources = factory.createCwbdataResources();
		XmlSummary.Resources.Resource resource = factory.createCwbdataResourcesResource();
		XmlSummary.Resources.Resource.Metadata metadata = factory.createCwbdataResourcesResourceMetadata();
		metadata = createMetadata(metadata);
		resource.setMetadata(metadata);
		
		XmlSummary.Resources.Resource.Data data = factory.createCwbdataResourcesResourceData();
		XmlSummary.Resources.Resource.Data.SurfaceObs surfaceObs = factory.createCwbdataResourcesResourceDataSurfaceObs();
		surfaceObs = createSurfaceObs(surfaceObs, locationDatas);
		data.setSurfaceObs(surfaceObs);
		resource.setData(data);		
		resources.setResource(resource);
		cwbData.setResources(resources);
		return cwbData;
	}
	
	private XmlSummary.Resources.Resource.Data.SurfaceObs createSurfaceObs(
				XmlSummary.Resources.Resource.Data.SurfaceObs surfaceObs, List<DbSummary> locationDatas){
		
		for(DbSummary data : locationDatas) {
			
			XmlSummary.Resources.Resource.Data.SurfaceObs.Location location = 
				factory.createCwbdataResourcesResourceDataSurfaceObsLocation();
			
			/// station
			XmlSummary.Resources.Resource.Data.SurfaceObs.Location.Station station = 
				factory.createCwbdataResourcesResourceDataSurfaceObsLocationStation();
			station.setStationID(data.getStnId());
			station.setStationName(data.getStnCName());
			station.setStationNameEN(data.getStnEName());
			station.setStationAttribute(Utility.getStationAttribution(data.getStnId()));
			location.setStation(station);
			
			XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics stnStatistics = 
				factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatistics();
			
			//// pressure
			XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.StationPressure pressure = 
				factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsStationPressure();
			String[] pressureTxt = data.getWeatherElementData(CwbColumns.StnPres);
			pressure.setStartYear(Integer.parseInt(pressureTxt[12]));
			pressure.setEndYear(Integer.parseInt(pressureTxt[13]));
			for(int i=0; i<12; i++) {
				XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.StationPressure.Monthly monthly
					= factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsStationPressureMonthly();
				monthly.setDataMonth(i+1);
				monthly.setMean(pressureTxt[i]);
				pressure.getMonthly().add(monthly);
			}
			stnStatistics.setStationPressure(pressure);
			
			/// temperature
			XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature temperature = 
					factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsTemperature();
			String[] tmpMeanTxt = data.getWeatherElementData(CwbColumns.Tx);
			String[] tmpMaxTxt = data.getWeatherElementData(CwbColumns.MeanTxMax);
			String[] tmpMinTxt = data.getWeatherElementData(CwbColumns.MeanTxMin);
			String[] tmpMaxGE30Txt = data.getWeatherElementData(CwbColumns.TxMaxGE30Day);
			String[] tmpMeanGE25Txt = data.getWeatherElementData(CwbColumns.TxGE25Day);
			String[] tmpMinLE10Txt = data.getWeatherElementData(CwbColumns.TxMinLE10Day);
			temperature.setStartYear(Integer.parseInt(tmpMeanTxt[12]));
			temperature.setEndYear(Integer.parseInt(tmpMeanTxt[13]));
			for(int i=0; i<12; i++) {
				XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature.Monthly monthly
					= factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsTemperatureMonthly();
				monthly.setDataMonth(i+1);
				monthly.setMean(tmpMeanTxt[i]);
				monthly.setMaximum(tmpMaxTxt[i]);
				monthly.setMinimum(tmpMinTxt[i]);
				monthly.setMaxGE30Days(tmpMaxGE30Txt[i]);
				monthly.setMeanGE25Days(tmpMeanGE25Txt[i]);
				monthly.setMinLE10Days(tmpMinLE10Txt[i]);
				temperature.getMonthly().add(monthly);
			}
			stnStatistics.setTemperature(temperature);
			
			/// relative humidity
			XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.RelativeHumidity rh = 
				factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsRelativeHumidity();
			String[] rhTxt = data.getWeatherElementData(CwbColumns.RH);
			rh.setStartYear(Integer.parseInt(rhTxt[12]));
			rh.setEndYear(Integer.parseInt(rhTxt[13]));
			for(int i=0; i<12; i++) {
				XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.RelativeHumidity.Monthly monthly
					= factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsRelativeHumidityMonthly();
				monthly.setDataMonth(i+1);
				monthly.setMean(rhTxt[i]);
				rh.getMonthly().add(monthly);
			}
			stnStatistics.setRelativeHumidity(rh);
			
			/// cloud cover
			XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.CloudCover cc = 
				factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsCloudCover();
			String[] ccTxt = data.getWeatherElementData(CwbColumns.CAmtMean);
			cc.setStartYear(Integer.parseInt(ccTxt[12]));
			cc.setEndYear(Integer.parseInt(ccTxt[13]));
			for(int i=0; i<12; i++) {
				XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.CloudCover.Monthly monthly = 
					factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsCloudCoverMonthly();
				monthly.setDataMonth(i+1);
				monthly.setMean(ccTxt[i]);
				cc.getMonthly().add(monthly);
			}
			stnStatistics.setCloudCover(cc);
			
			/// shine duration
			XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.SunshineDuration sd = 
				factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsSunshineDuration();
			String[] sdTxt = data.getWeatherElementData(CwbColumns.SunShine);
			sd.setStartYear(Integer.parseInt(sdTxt[12]));
			sd.setEndYear(Integer.parseInt(sdTxt[13]));
			for(int i=0; i<12; i++) {
				XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.SunshineDuration.Monthly monthly = 
					factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsSunshineDurationMonthly();
				monthly.setDataMonth(i+1);
				monthly.setTotal(sdTxt[i]);
				sd.getMonthly().add(monthly);
			}
			stnStatistics.setSunshineDuration(sd);
			
			/// precipitation
			XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Precipitation precip = 
				factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsPrecipitation();
			String[] pAccumTxt = data.getWeatherElementData(CwbColumns.Precp);
			String[] pGE01Txt = data.getWeatherElementData(CwbColumns.PrecpDay);
			precip.setStartYear(Integer.parseInt(pAccumTxt[12]));
			precip.setEndYear(Integer.parseInt(pGE01Txt[13]));
			for(int i=0; i<12; i++) {
				XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Precipitation.Monthly monthly = 
					factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsPrecipitationMonthly();
				monthly.setDataMonth(i+1);
				monthly.setAccumulation(pAccumTxt[i]);
				monthly.setGE01Days(pGE01Txt[i]);
				precip.getMonthly().add(monthly);
			}
			stnStatistics.setPrecipitation(precip);
			
			/// wind speed
			XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.WindSpeed wd = 
				factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsWindSpeed();
			String[] wdTxt = data.getWeatherElementData(CwbColumns.WS);
			wd.setStartYear(Integer.parseInt(wdTxt[12]));
			wd.setEndYear(Integer.parseInt(wdTxt[13]));
			for(int i=0; i<12; i++) {
				XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.WindSpeed.Monthly monthly = 
					factory.createCwbdataResourcesResourceDataSurfaceObsLocationStationObsStatisticsWindSpeedMonthly();
				monthly.setDataMonth(i+1);
				monthly.setMean(wdTxt[i]);
				wd.getMonthly().add(monthly);
			}
			stnStatistics.setWindSpeed(wd);
			
			location.setStationObsStatistics(stnStatistics);
			surfaceObs.getLocation().add(location);
		}
		
		return surfaceObs;
	}
	
	private XmlSummary.Resources.Resource.Metadata createMetadata(
								XmlSummary.Resources.Resource.Metadata metadata){
		metadata.setResourceID(attr.summaryReportResourceID);
		metadata.setResourceName("中央氣象局氣候觀測_月平均_多要素氣象資料");
		metadata.setResourceDescription("氣象局所屬氣象觀測站，月平均(30年左右)各項的氣象因子資料。");
		metadata.setLanguage("zh");
		metadata.setHomepage(attr.summaryHomepage);
		
		XmlSummary.Resources.Resource.Metadata.Sources sources = factory.createCwbdataResourcesResourceMetadataSources();
		XmlSummary.Resources.Resource.Metadata.Sources.Source source1 = 
				factory.createCwbdataResourcesResourceMetadataSourcesSource();
		source1.setTitle("中央氣象局氣象測站代號及站況資料");
		source1.setPath(attr.reportObsPath);
		XmlSummary.Resources.Resource.Metadata.Sources.Source source2 = 
				factory.createCwbdataResourcesResourceMetadataSourcesSource();
		source2.setTitle("Abbreviation for unit of measure - as defined within WMO "
				+ "No. 306 Common code-table C-6 1List of units for TDCFs1. (use wmo abbreviation)");
		source2.setPath(attr.reportWmoPath);
		sources.getSource().add(source1);
		sources.getSource().add(source2);
		metadata.setSources(sources);
		
		XmlSummary.Resources.Resource.Metadata.Temporal temporal = 
				factory.createCwbdataResourcesResourceMetadataTemporal();
		temporal.setDescription("統計期間約30年，依設站日期與觀測項目有所不同");
		metadata.setTemporal(temporal);
		
		XmlSummary.Resources.Resource.Metadata.Spatial spatial = 
				factory.createCwbdataResourcesResourceMetadataSpatial();
		spatial.setDescription("中央氣象局所屬氣象觀測站");
		metadata.setSpatial(spatial);
		
		XmlSummary.Resources.Resource.Metadata.Statistics statistics = 
				factory.createCwbdataResourcesResourceMetadataStatistics();
		XmlSummary.Resources.Resource.Metadata.Statistics.StatisticalPeriods periods = 
				factory.createCwbdataResourcesResourceMetadataStatisticsStatisticalPeriods();
		XmlSummary.Resources.Resource.Metadata.Statistics.StatisticalPeriods.StatisticalPeriod period = 
				factory.createCwbdataResourcesResourceMetadataStatisticsStatisticalPeriodsStatisticalPeriod();
		period.setPeriodTagName("monthly");
		period.setDescription("各個月份統計值之30年平均");
		periods.setStatisticalPeriod(period);
		statistics.setStatisticalPeriods(periods);
		
		statistics.getWeatherElement().add(createWeatherElement("stationPressure", "30年平均之當月份測站氣壓統計值", "hPa"
											, new String[] {"mean"}, new String[] {"stnpres,平均測站氣壓,Mean Pressure at Station"}));
		statistics.getWeatherElement().add(createWeatherElement("temperature", "30年平均之當月份氣溫統計值", "˚C"
											, new String[] {"mean", "maximum", "minimum", "maxGE30Days", "minLE10Days", "meanGE25Days"}
											, new String[] {"tx,平均氣溫,Mean Temperature"
															, "meantxmax,最高氣溫,Mean Maximum Temperature"
															, "meantxmin,最低氣溫,Mean Minimum Temperature"
															, "txmaxge30day,最高氣溫&gt;=30℃日數,Number of Days with Maximun Temperature &gt;= 30℃"
															, "txminle10day,最低氣溫&lt;=10℃日數,Number of Days with Minimum Temperature &lt;= 10℃"
															, "txge25day,氣溫&gt;=25℃日數,Number of Days with Mean Temperature &gt;= 25℃"}));
		statistics.getWeatherElement().add(createWeatherElement("relativeHumidity", "30年平均之當月份相對溼度統計值", "%"
											, new String[] {"mean"}, new String[] {"rh,平均相對濕度,Mean Relative Humidity"}));
		statistics.getWeatherElement().add(createWeatherElement("cloudCover", "30年平均之當月份雲量(十分量)統計值", "tenths"
											, new String[] {"mean"}, new String[] {"CamtMean,平均雲量,Mean Cloudiness"}));
		statistics.getWeatherElement().add(createWeatherElement("sunshineDuration", "30年平均之當月份日照時數統計值", "h"
											, new String[] {"total"}, new String[] {"sunshine,總日照時數,Sunshine Duration"}));
		statistics.getWeatherElement().add(createWeatherElement("precipitation", "30年平均之當月份降水量統計值值", "mm"
											, new String[] {"accumulation", "GE01Days"}
											, new String[] {"precp,降水量,Precipitation"
															, "precpday,降水量&gt;=0.1mm日數,Number of Days with Precipitation &gt;=0.1mm"}));
		statistics.getWeatherElement().add(createWeatherElement("windSpeed", "30年平均之當月份風速統計值", "m s^-1"
											, new String[] {"mean"}, new String[] {"ws,平均風速,Mean Wind Velocity(10 minutes)"}));
		metadata.setStatistics(statistics);
		
		return metadata;
	}
	
	/**
	 * @param tagName
	 * @param description
	 * @param units
	 * @param methodTagName
	 * @param methodDescription
	 * @return
	 */
	private XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement createWeatherElement(
				 String tagName, String description, String units, String[] methodTagName, String[] methodDescription) {
	
		XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement we 
			= factory.createCwbdataResourcesResourceMetadataStatisticsWeatherElement();
		we.setTagName(tagName);
		we.setDescription(description);
		we.setUnits(units);
		XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods methods = 
			factory.createCwbdataResourcesResourceMetadataStatisticsWeatherElementStatisticalMethods();
		for(int i=0; i<methodTagName.length; i++) {
			XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods.StatisticalMethod m 
				= factory.createCwbdataResourcesResourceMetadataStatisticsWeatherElementStatisticalMethodsStatisticalMethod();
			m.setMethodTagName(methodTagName[i]);
			m.setDescription(methodDescription[i]);
			methods.getStatisticalMethod().add(m);
		}
		we.setStatisticalMethods(methods);
		return we;
	}
	
}
