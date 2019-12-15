package com.iisi.newOpendataService.makeXml;

import java.time.DateTimeException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.iisi.newOpendataService.dao.StationType;
import com.iisi.newOpendataService.dbEntity.DbNOAA;
import com.iisi.newOpendataService.utility.TimeInputException;
import com.iisi.newOpendataService.utility.MakeFileServiceType;

@Service
public class MakeAutoNOAAENXml extends MakeNOAAXml {

	@Override
	public void setParameters(String... arg) throws TimeInputException, NumberFormatException, DateTimeException {
		super.setParameters(arg);
		setType(false, false);		
	}

	@Override
	protected String getFilename() {
		return attr.autoNoaaENFilename;
	}
	
	@Override
	protected List<String> getDestinationFolders() {
		return attr.noaaENFolder;
	}

	@Override
	protected void register() {
		super.register(MakeFileServiceType.AutoNOAAEN, "makeAutoNOAAENXml");
	}

	@Override
	protected List<DbNOAA> query() {
		return query.query(startDate, null, StationType.AUTO);
	}

}
