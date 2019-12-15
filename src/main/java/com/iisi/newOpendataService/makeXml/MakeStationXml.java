package com.iisi.newOpendataService.makeXml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;

import com.iisi.newOpendataService.dbEntity.DbStation;
import com.iisi.newOpendataService.utility.Utility;
import com.iisi.newOpendataService.xml.XmlStation;
import com.iisi.newOpendataService.xml.XmlStation.Resources.Resource.Data;
import com.iisi.newOpendataService.xml.XmlStation.Resources.Resource.Data.StationsStatus;
import com.iisi.newOpendataService.xml.XmlStation.Resources.Resource.Metadata;
import com.iisi.newOpendataService.xml.XmlStation.Resources.Resource.Metadata.Fields;
import com.iisi.newOpendataService.xml.XmlStation.Resources.Resource.Metadata.Fields.Field;
import com.iisi.newOpendataService.xml.XmlStation.Resources.Resource.Metadata.Spatial;
import com.iisi.newOpendataService.xml.XmlStation.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem;
import com.iisi.newOpendataService.xml.XmlStation.Resources.Resource.Metadata.Temporal;
import com.iisi.newOpendataService.xml.XmlStationObjectFactory;


abstract public class MakeStationXml extends MakeXmlTemplate<DbStation, XmlStation> {

	
	@Autowired
	private XmlStationObjectFactory factory;
			
	private String dataSetId;
	private final static String DATASET_NAME = "過去氣象觀測";
	private String dataItemId;
	private final static String DATAITEM_NAME = "中央氣象局氣候觀測_站況資料";
	private String resourceId;
	private String resourceName; 
	private static final String NOTE = "本局氣象觀測資料申購業務包含中央氣象局所屬有人站、自動氣象站，若需申購其他非屬氣象局租用儀器用地之測站資料，請洽02-23491102。";	
	private String station_homepage;
	private static String stationIdDescription;
	
	protected void isManual(boolean isManual) {
		if(isManual) {
			dataSetId = attr.manualStnDatasetID;
			dataItemId = attr.manualStnDataItemID;
			resourceId = attr.manualStnResourceID;
			resourceName = "中央氣象局氣象測站站況資料_有人氣象站";
			stationIdDescription = "本表所列站號\"46\"開頭為中央氣象局地面氣象站，觀測項目包含人工觀測(淡水站、永康站、七股站、成功站無人工觀測項目)";
			station_homepage = attr.manualStnHomepage;
		} else {
			dataSetId = attr.autoStnDatasetID;
			dataItemId = attr.autoStnDataItemID;
			resourceId = attr.autoStnResourceID;	
			resourceName = "中央氣象局氣象測站站況資料_無人氣象站(自動氣象站/雨量站";
			stationIdDescription = "本表所列站號\"C\"開頭為中央氣象局自動氣象/雨量站，第二碼\"0\"代表氣象站，\"1\"代表雨量站。";
			station_homepage = attr.autoStnHomepage;
		}
	}
	
	@Override
	protected List<String> getDestinationFolders() {
		return attr.stnFolder;
	}
		
	@Override
	protected Class<XmlStation> getXmlClass() {
		return XmlStation.class;
	}
	
	//////
	////// create XML
	//////
	@Override
	protected XmlStation createCwbData(List<DbStation> stns) throws DatatypeConfigurationException {
		XmlStation cwbData = factory.createCwbdata();
		cwbData.setIdentifier(UUID.randomUUID().toString());
		cwbData.setDatasetID(dataSetId);
		cwbData.setDatasetName(DATASET_NAME);
		cwbData.setDataItemID(dataItemId);
		cwbData.setDataItemName(DATAITEM_NAME);
		cwbData.setSender(attr.SENDER);
		cwbData.setSent(Utility.getXmlDateTime(LocalDateTime.now()));
		cwbData.setStatus(attr.STATUS_ACTUAL);
		cwbData.setScope(attr.SCOPE_PUBLIC);
		cwbData.setMsgType(attr.MSG_TYPE_ISSUE);
		cwbData.setPublisherOID(attr.PUBLISHER_OID);
		cwbData.setNote(NOTE);
		
		XmlStation.Resources resources = factory.createCwbdataResources();
		XmlStation.Resources.Resource resource = factory.createCwbdataResourcesResource();
		XmlStation.Resources.Resource.Metadata metadata = factory.createCwbdataResourcesResourceMetadata();
		resource.setMetadata(createMetadata(metadata));
		
		Data data = factory.createCwbdataResourcesResourceData();
		StationsStatus stnStatus = factory.createCwbdataResourcesResourceDataStationsStatus();
		stnStatus.getStation().addAll(createStns(stns));
		data.setStationsStatus(stnStatus);
		resource.setData(data);
		resources.setResource(resource);
		cwbData.setResources(resources);
		return cwbData;
	}

	
	private Metadata createMetadata(Metadata metadata) throws DatatypeConfigurationException {
		metadata.setResourceID(resourceId);
		metadata.setResourceName(resourceName);
		metadata.setResourceDescription("氣象局所屬氣象觀測站、高空氣象觀測站之基本站況資料。(本表所列各站資料存取時間為參考基準，確切詳細資訊依資料庫為主)");
		metadata.setLanguage("zh");
		metadata.setHomepage(station_homepage);
		
		Temporal temporal = 
				factory.createCwbdataResourcesResourceMetadataTemporal();
		temporal.setUpdateDate(Utility.getXmlDate(LocalDate.now()));
		metadata.setTemporal(temporal);
		
		Spatial spatial = factory.createCwbdataResourcesResourceMetadataSpatial();
		spatial.setDescription("中央氣象局所屬氣象觀測站");
		CoordinateReferenceSystem coor = factory.createCwbdataResourcesResourceMetadataSpatialCoordinateReferenceSystem();
		coor.setEPSGCode("EPSG:4326");
		coor.setName("WGS84");
		coor.setDatum("World Geodetic System 1984");
		coor.setCoordinateFormat("decimal degrees");
		spatial.setCoordinateReferenceSystem(coor);
		metadata.setSpatial(spatial);
		
		Fields fields = factory.createCwbdataResourcesResourceMetadataFields();
		fields.getField().add(createField("stationID", stationIdDescription, Optional.empty()));
		fields.getField().add(createField("stationName", "中文站名", Optional.empty()));
		fields.getField().add(createField("stationNameEN", "英文站名", Optional.empty()));
		fields.getField().add(createField("stationAltitude", "海拔高度(公尺)", Optional.of("m")));
		fields.getField().add(createField("longitude", "經度", Optional.empty()));
		fields.getField().add(createField("latitude", "緯度", Optional.empty()));
		fields.getField().add(createField("countyName", "測站所在縣市", Optional.empty()));
		fields.getField().add(createField("stationAddress", "測站所在地址或位置描述", Optional.empty()));
		fields.getField().add(createField("startDate", "資料起始日期", Optional.empty()));
		fields.getField().add(createField("endDate", "撤站日期", Optional.empty()));
		fields.getField().add(createField("status", "測站狀態(現存/已撤銷)", Optional.empty()));
		fields.getField().add(createField("note", "備註", Optional.empty()));
		fields.getField().add(createField("originalStationID", "原站號", Optional.empty()));
		fields.getField().add(createField("newStationID", "新站號", Optional.empty()));
		metadata.setFields(fields);
		
		return metadata;
	}

	
	private List<StationsStatus.Station> createStns(List<DbStation> stns) {
		List<StationsStatus.Station> xmlStns = new ArrayList<>();
		stns.stream().forEach(stn -> {
			StationsStatus.Station xmlStn = factory.createCwbdataResourcesResourceDataStationsStatusStation();
			xmlStn.setStationID(stn.getStno());
			xmlStn.setStationName(stn.getStnCName());
			xmlStn.setStationNameEN(stn.getStnEName());
			xmlStn.setStationAltitude(stn.getAltitude());
			xmlStn.setLongitude(stn.getLongitude());
			xmlStn.setLatitude(stn.getLatitude());
			xmlStn.setCountyName(stn.getCounty());
			xmlStn.setStationAddress(stn.getAddress());
			
			xmlStn.setStartDate(stn.getHistoryBeginTime());
			xmlStn.setEndDate(stn.getStnEndTime());
			String status = stn.getStnEndTime() == null ||
								stn.getStnEndTime().equals("")
								? "現存測站" : "已撤銷";
			xmlStn.setStatus(status);
			
			xmlStn.setNote(stn.getNote());
			xmlStn.setOriginalStationID(stn.getBeforeStno());
			xmlStn.setNewStationID(stn.getAfterStno());
			xmlStns.add(xmlStn);
		});
		return xmlStns;
	}


	private Field createField(String tagName, String description, Optional<String> unit) {
		Field field = factory.createCwbdataResourcesResourceMetadataFieldsField();
		field.setTagName(tagName);
		field.setDescription(description);
		field.setUnits(unit.orElse(null));
		return field;
	}

}