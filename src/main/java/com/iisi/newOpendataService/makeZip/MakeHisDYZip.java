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
import com.iisi.newOpendataService.makeXml.MakeDYXml;
import com.iisi.newOpendataService.utility.MakeFileServiceType;
import com.iisi.newOpendataService.utility.TimeInputException;

@Component
public class MakeHisDYZip extends MakeZipTemplate {
	
	@Autowired
	private MakeDYXml makeDYXml;
	
	private int year;

	@Override
	public void setParameters(String... arg) throws TimeInputException {
		if(arg.length == 0) {
			year = LocalDate.now().getYear() - 9;
		} else {
			year = Integer.parseInt(arg[0]);
			if(year + 9 > LocalDate.now().getYear()) {
				throw new TimeInputException("His_dy_Report error: user should not input year that is later than 9 years ago");
			}
		}

		// set xml generated at tmpFolder
		makeDYXml.setTmpOutputFolder(tmpWorkingFolder);
	}

	@Override
	protected void makeFile() throws TimeInputException, IOException, DatatypeConfigurationException, JAXBException {
		String yearS = null;
		String oriXmlFilename = attr.dyFilename;
		String desXmlFilenameTemplate = oriXmlFilename.substring(0, oriXmlFilename.lastIndexOf("."))+"_%s.xml";
		String desXmlFilename = null;
		for(int i=0; i<=8; i++) {
			yearS = Integer.toString(year+i);
			makeDYXml.setParameters(yearS + MakeFile.timeSplitter + "12" + MakeFile.timeSplitter + "31");
			makeDYXml.run();
			desXmlFilename = String.format(desXmlFilenameTemplate, yearS);
			// rename
			Files.move(Paths.get(tmpWorkingFolder, oriXmlFilename), Paths.get(tmpWorkingFolder, desXmlFilename));
		}
		
		Files.copy(Paths.get(ZIP_RESOURCE_FOLDER, FILE_CSV), Paths.get(tmpWorkingFolder, FILE_CSV));
		Files.copy(Paths.get(ZIP_RESOURCE_FOLDER, MANIFEST_CSV), Paths.get(tmpWorkingFolder, MANIFEST_CSV));
		Files.copy(Paths.get(ZIP_RESOURCE_FOLDER, SCHEMA_FILE_CSV), Paths.get(tmpWorkingFolder, SCHEMA_FILE_CSV));
		writeFileCSV(Paths.get(tmpWorkingFolder, FILE_CSV).toFile());
	}
	
	private void writeFileCSV(File file) throws IOException {
		String template = "dy_Report_%d.xml,%d年局屬地面測站每日雨量資料\n";
		try (FileOutputStream fileStream = new FileOutputStream(file, true);
				OutputStreamWriter writer = new OutputStreamWriter(fileStream, StandardCharsets.UTF_8)){
			writer.write("\ufeff");
			writer.write("name,description\n");
			for(int i=0; i<9; i++) {
				writer.write(String.format(template, year+i, year+i));
			}
		}
	}

	@Override
	protected void register() {
		super.register(MakeFileServiceType.HisDY, "makeHisDYZip");
	}

	@Override
	protected List<String> getDestinationFolders() {
		return attr.hisDYFolder;
	}

	@Override
	protected String getFilename() {
		return attr.hisDYFilename;
	}
	
	
}
