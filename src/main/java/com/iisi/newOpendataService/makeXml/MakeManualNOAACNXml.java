package com.iisi.newOpendataService.makeXml;

import java.time.DateTimeException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.iisi.newOpendataService.dao.StationType;
import com.iisi.newOpendataService.dbEntity.DbNOAA;
import com.iisi.newOpendataService.utility.TimeInputException;
import com.iisi.newOpendataService.utility.MakeFileServiceType;

@Service
public class MakeManualNOAACNXml extends MakeNOAAXml {

	@Override
	public void setParameters(String... arg) throws TimeInputException, NumberFormatException, DateTimeException {
		super.setParameters(arg);
		setType(true, true);		
	}

	@Override
	protected String getFilename() {
		return attr.manualNoaaCNFilename;
	}
	
	@Override
	protected List<String> getDestinationFolders() {
		return attr.noaaCNFolder;
	}

	@Override
	protected void register() {
		super.register(MakeFileServiceType.ManualNOAACN, "makeManualNOAACNXml");
	}

	@Override
	protected List<DbNOAA> query() {
		return query.query(startDate, null, StationType.MANUAL);
	}

}
