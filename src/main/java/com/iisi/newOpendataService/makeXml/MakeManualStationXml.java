package com.iisi.newOpendataService.makeXml;

import java.util.List;

import org.springframework.stereotype.Component;

import com.iisi.newOpendataService.dao.StationType;
import com.iisi.newOpendataService.dbEntity.DbStation;
import com.iisi.newOpendataService.utility.MakeFileServiceType;

@Component
public class MakeManualStationXml extends MakeStationXml{

	@Override
	protected List<DbStation> query() {
		// do not need to time parameter to query
		return query.query(null, null, StationType.MANUAL);
	}
	
	@Override
	protected String getFilename() {
		return attr.manualStnFilename;
	}

	@Override
	protected void register() {
		super.register(MakeFileServiceType.ManualStation, "makeManualStationXml");
	}
	
	@Override
	public void setParameters(String... org) {
		isManual(true);
	}

}
