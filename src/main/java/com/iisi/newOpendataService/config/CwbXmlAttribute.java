package com.iisi.newOpendataService.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CwbXmlAttribute{
	
	public final String DATASET_NAME = "過去氣象觀測";
	public final String SENDER = "weather@cwb.gov.tw";
	public final String STATUS_ACTUAL = "Actual";
	public final String SCOPE_PUBLIC = "Public";
	public final String MSG_TYPE_ISSUE = "Issue";
	public final String PUBLISHER_OID = "2.16.886.101.20003.20008.20004";
	
	
	@Value("${xml.xmlSchemaLocation}")
	public String xmlSchemaLocation;
	
	@Value("${xml.reportObsPath}")
	public String reportObsPath;
	
	@Value("${xml.reportWmoPath}")
	public String reportWmoPath;
	
	@Value("${app.transmitToDownstream}")
	public boolean transmitToDownstream;
	
	
	// day30
	@Value ("${xml.day30.homepage}")
	public String day30Homepage;
		
	@Value("${xml.day30.filename}")
	public String day30Filename;
	
	@Value("${xml.day30.copyToFolder}")
	public List<String> day30Folder;
	
	@Value("${xml.day30.stations.include}")
	public String day30StnsInclude;
	
	@Value("${xml.day30.datasetID}")
	public String day30DatasetID;
	
	@Value("${xml.day30.dataItemID}")
	public String day30DataItemID;
	
	@Value("${xml.day30.resourceID}")
	public String day30ResourceID;
	
	
	// dyReport
	@Value("${xml.dyReport.homepage}")
	public String dyHomepage;
	
	@Value("${xml.dyReport.filename}")
	public String dyFilename;
	
	@Value("${xml.dyReport.copyToFolder}")
	public List<String> dyReportFolder;
	
	@Value("${xml.dyReport.manualStations.include}")
	public String dyManualStnsInclude;
	
	@Value("${xml.dyReport.autoStations.include}")
	public String dyAutoStnsInclude;
	
	@Value("${xml.dyReport.datasetID}")
	public String dyReportDatasetID;
	
	@Value("${xml.dyReport.dataItemID}")
	public String dyReportDataItemID;
	
	@Value("${xml.dyReport.resourceID}")
	public String dyReportResourceID;
	
	// mnReport
	@Value("${xml.mnReport.homepage}")
	public String mnHomepage;
	
	@Value("${xml.mnReport.filename}")
	public String mnFilename;
	
	@Value("${xml.mnReport.copyToFolder}")
	public List<String> mnReportFolder;
	
	@Value("${xml.mnReport.stations.include}")
	public String mnStnsInclude;
	
	@Value("${xml.mnReport.datasetID}")
	public String mnReportDatasetID;
	
	@Value("${xml.mnReport.dataItemID}")
	public String mnReportDataItemID;
	
	@Value("${xml.mnReport.resourceID}")
	public String mnReportResourceID;
	
	// summaryReport
	@Value("${xml.summaryReport.homepage}")
	public String summaryHomepage;
	
	@Value("${xml.summaryReport.filename}")
	public String summaryFilename;
	
	@Value("${xml.summaryReport.copyToFolder}")
	public List<String> summaryReportFolder;
	
	@Value("${xml.summaryReport.stations.include}")
	public String summaryStnsInclude;
	
	@Value("${xml.summaryReport.datasetID}")
	public String summaryReportDatasetID;
	
	@Value("${xml.summaryReport.dataItemID}")
	public String summaryReportDataItemID;
	
	@Value("${xml.summaryReport.resourceID}")
	public String summaryReportResourceID;
	
	// manual station
	@Value("${xml.manualStn.homepage}")
	public String manualStnHomepage;
	
	@Value("${xml.manualStn.filename}")
	public String manualStnFilename;
	
	@Value("${xml.manualStn.datasetID}")
	public String manualStnDatasetID;
	
	@Value("${xml.manualStn.dataItemID}")
	public String manualStnDataItemID;
	
	@Value("${xml.manualStn.resourceID}")
	public String manualStnResourceID;
	
	@Value("${xml.manualStn.stations.exclude}")
	public String manualStnStationsExclude;
	
	// auto station
	@Value("${xml.autoStn.homepage}")
	public String autoStnHomepage;
	
	@Value("${xml.autoStn.filename}")
	public String autoStnFilename;
	
	@Value("${xml.autoStn.datasetID}")
	public String autoStnDatasetID;
	
	@Value("${xml.autoStn.dataItemID}")
	public String autoStnDataItemID;
	
	@Value("${xml.autoStn.resourceID}")
	public String autoStnResourceID;
	
	@Value("${xml.autoStn.stations.exclude}")
	public String autoStnStationsExclude;
	
	// station copy folder
	@Value("${xml.stn.copyToFolder}")
	public List<String> stnFolder;
	
	// CODiS
	@Value("${xml.CODiSReport.homepage}")
	public String cODiSHomepage;
	
	@Value("${xml.CODiSReport.filename}")
	public String cODiSFilename;
	
	@Value("${xml.CODiSReport.copyToFolder}")
	public List<String> cODiSFolder;

	@Value("${xml.CODiSReport.datasetID}")
	public String cODiSDatasetID;
	
	@Value("${xml.CODiSReport.dataItemID}")
	public String cODiSDataItemID;
	
	@Value("${xml.CODiSReport.resourceID}")
	public String cODiSResourceID;
	
	// day7HourlyRain
	@Value("${xml.day7HourlyRain.homepage}")
	public String day7HourlyRainHomepage;
	
	@Value("${xml.day7HourlyRain.filename}")
	public String day7HourlyRainFilename;
	
	@Value("${xml.day7HourlyRain.copyToFolder}")
	public List<String> day7HourlyRainFolder;

	@Value("${xml.day7HourlyRain.datasetID}")
	public String day7HourlyRainDatasetID;
	
	@Value("${xml.day7HourlyRain.dataItemID}")
	public String day7HourlyRainDataItemID;
	
	@Value("${xml.day7HourlyRain.resourceID}")
	public String day7HourlyRainResourceID;
	
	
	// manual NOAA CN	
	@Value("${xml.manualNoaaCN.filename}")
	public String manualNoaaCNFilename;
	
	@Value("${xml.manualNoaaCN.datasetID}")
	public String manualNoaaCNDatasetID;
	
	@Value("${xml.manualNoaaCN.dataItemID}")
	public String manualNoaaCNDataItemID;
	
	// auto NOAA CN
	@Value("${xml.autoNoaaCN.filename}")
	public String autoNoaaCNFilename;
	
	@Value("${xml.autoNoaaCN.datasetID}")
	public String autoNoaaCNDatasetID;
	
	@Value("${xml.autoNoaaCN.dataItemID}")
	public String autoNoaaCNDataItemID;
	
	// NOAA CN
	@Value("${xml.noaaCN.copyToFolder}")
	public List<String> noaaCNFolder;
	
	
	// manual NOAA EN	
	@Value("${xml.manualNoaaEN.filename}")
	public String manualNoaaENFilename;
	
	@Value("${xml.manualNoaaEN.datasetID}")
	public String manualNoaaENDatasetID;
	
	@Value("${xml.manualNoaaEN.dataItemID}")
	public String manualNoaaENDataItemID;
	
	// auto NOAA CN
	@Value("${xml.autoNoaaEN.filename}")
	public String autoNoaaENFilename;
	
	@Value("${xml.autoNoaaEN.datasetID}")
	public String autoNoaaENDatasetID;
	
	@Value("${xml.autoNoaaEN.dataItemID}")
	public String autoNoaaENDataItemID;
	
	// NOAA EN
	@Value("${xml.noaaEN.copyToFolder}")
	public List<String> noaaENFolder;

	
	// His_dy_Report
	@Value("${xml.hisDYReport.filename}")
	public String hisDYFilename;
	
	@Value("${xml.hisDYReport.copyToFolder}")
	public List<String> hisDYFolder;
	
	
	
	// His_dy_Report
	@Value("${xml.hisMNReport.filename}")
	public String hisMNFilename;
	
	@Value("${xml.hisMNReport.copyToFolder}")
	public List<String> hisMNFolder;
	
}
