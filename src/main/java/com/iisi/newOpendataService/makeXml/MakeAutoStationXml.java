package com.iisi.newOpendataService.makeXml;

import java.util.List;

import org.springframework.stereotype.Component;

import com.iisi.newOpendataService.dao.StationType;
import com.iisi.newOpendataService.dbEntity.DbStation;
import com.iisi.newOpendataService.utility.MakeFileServiceType;

@Component
public class MakeAutoStationXml extends MakeStationXml{

	@Override
	protected List<DbStation> query() {
		// do not need to time parameter to query
		return query.query(null, null, StationType.AUTO);
	}
	
	@Override
	protected String getFilename() {
		return attr.autoStnFilename;
	}

	@Override
	protected void register() {
		super.register(MakeFileServiceType.AutoStation, "makeAutoStationXml");
	}
	
	@Override
	public void setParameters(String... org) {
		isManual(false);
	}



}
