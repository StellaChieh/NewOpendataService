package com.iisi.newOpendataService.makeZip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iisi.newOpendataService.MakeFile;
import com.iisi.newOpendataService.makeXml.MakeMNXml;
import com.iisi.newOpendataService.utility.MakeFileServiceType;
import com.iisi.newOpendataService.utility.TimeInputException;

@Component
public class MakeHisMNZip extends MakeZipTemplate {
	
	@Autowired
	private MakeMNXml makeMNXml;
	
	private int year;

	@Override
	public void setParameters(String... arg) throws TimeInputException {
		if(arg.length == 0) {
			year = LocalDate.now().getYear() - 9;
		} else {
			year = Integer.parseInt(arg[0]);
			if(year + 9 > LocalDate.now().getYear()) {
				throw new TimeInputException("His_mn_Report error: user should not input year that is later than 9 years ago");
			}
		}
		// set xml generated at tmpFolder
		makeMNXml.setTmpOutputFolder(tmpWorkingFolder);  
	}
	
	

	@Override
	protected void makeFile() throws TimeInputException, IOException, DatatypeConfigurationException, JAXBException {
		String oriXmlFilename = attr.mnFilename;
		String desXmlFilenameTemplate = oriXmlFilename.substring(0, oriXmlFilename.lastIndexOf("."))+"_%d%02d.xml";
		String desXmlFilename = null;
		for(int i=0; i<=8; i++) {
			int singleYear = year+i;
			for(int j=1; j<=12; j++) {
				makeMNXml.setParameters(Integer.toString(singleYear) + MakeFile.timeSplitter + String.format("%02d", j));
				makeMNXml.run();
				desXmlFilename = String.format(desXmlFilenameTemplate, singleYear, j);
				// rename
				Files.move(Paths.get(tmpWorkingFolder, oriXmlFilename), Paths.get(tmpWorkingFolder, desXmlFilename));
			}
		}
		
		Files.copy(Paths.get(ZIP_RESOURCE_FOLDER, FILE_CSV), Paths.get(tmpWorkingFolder, FILE_CSV));
		Files.copy(Paths.get(ZIP_RESOURCE_FOLDER, MANIFEST_CSV), Paths.get(tmpWorkingFolder, MANIFEST_CSV));
		Files.copy(Paths.get(ZIP_RESOURCE_FOLDER, SCHEMA_FILE_CSV), Paths.get(tmpWorkingFolder, SCHEMA_FILE_CSV));
		writeFileCSV(Paths.get(tmpWorkingFolder, FILE_CSV).toFile());	
	}
	
	private void writeFileCSV(File file) throws IOException {
		String template = "mn_Report_%d%02d.xml,%d年局屬地面測站%02d月氣象資料\n";
		try (FileOutputStream fileStream = new FileOutputStream(file, true);
				OutputStreamWriter writer = new OutputStreamWriter(fileStream, StandardCharsets.UTF_8)){
			writer.write("\ufeff");
			writer.write("name,description\n");
			for(int i=0; i<9; i++) {
				for(int j=1; j<=12; j++) {
					writer.write(String.format(template, year+i, j, year+i, j));
				}
			}
		}
	}

	@Override
	protected void register() {
		super.register(MakeFileServiceType.HisMN, "makeHisMNZip");
	}


	@Override
	protected List<String> getDestinationFolders() {
		return attr.hisMNFolder;
	}

	@Override
	protected String getFilename() {
		return attr.hisMNFilename;
	}

}
