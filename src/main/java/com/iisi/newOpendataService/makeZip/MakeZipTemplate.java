package com.iisi.newOpendataService.makeZip;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iisi.newOpendataService.MakeFile;
import com.iisi.newOpendataService.config.CwbXmlAttribute;
import com.iisi.newOpendataService.utility.MakeFileServiceType;
import com.iisi.newOpendataService.utility.TimeInputException;

@Component
public abstract class MakeZipTemplate implements MakeFile {
	
	@Autowired
	protected CwbXmlAttribute attr;
	protected String tmpWorkingFolder = "tmp";
	protected String tmpOutputFolder = "output";
	private String zipFilename;
	private List<String> destinationFolders;
	
	protected static final String ZIP_RESOURCE_FOLDER = "config/zipResource";
	protected static final String FILE_CSV = "file.csv";
	protected static final String MANIFEST_CSV = "manifest.csv";
	protected static final String SCHEMA_FILE_CSV = "schema-file.csv";
	
	private static Logger logger= LoggerFactory.getLogger(MakeZipTemplate.class);
	
	@PostConstruct
	protected void init() {
		zipFilename = getFilename();
		destinationFolders = getDestinationFolders();
		register();
	}
	
	
	protected abstract void register();
	
	protected abstract List<String> getDestinationFolders();


	protected abstract String getFilename();


	protected void register(MakeFileServiceType type, String beanName) {
		MakeFileServiceType.getFileServiceBeanMap().put(type, beanName);
	}
	
	
	abstract public void setParameters(String... arg) throws TimeInputException;
	
	public void run() throws IOException, TimeInputException, DatatypeConfigurationException, JAXBException {
		clean();
		logger.info("Make XML file...");
		makeFile();
		logger.info("Compress files...");
		compress();
		logger.info("Copy to target folders...");
		if(attr.transmitToDownstream) {
			copyToTargetFolder();
		}
		deleteTmpFolder();
	};
	
	abstract protected void makeFile() throws TimeInputException, IOException, DatatypeConfigurationException, JAXBException;
	
	private void compress() throws IOException {
		if(!Paths.get(tmpOutputFolder).toFile().exists()) {
			Files.createDirectory(Paths.get(tmpOutputFolder));
		}
		CompressFile.makeFile(Paths.get(tmpWorkingFolder).toFile(), Paths.get(tmpOutputFolder, zipFilename).toFile());
	}; 
	
	private void clean() throws IOException {
		Files.deleteIfExists(Paths.get(tmpOutputFolder, zipFilename));
		deleteTmpFolder();
		Files.createDirectory(Paths.get(tmpWorkingFolder));
	}
	
	private void deleteTmpFolder() throws IOException {
		if(Files.exists(Paths.get(tmpWorkingFolder))) {
			Files.walk(Paths.get(tmpWorkingFolder).toAbsolutePath())
											.map(Path::toFile)
											.sorted((o1, o2) -> -o1.compareTo(o2))
											.forEach(File::delete);
		}
	}
	
	private void copyToTargetFolder() throws IOException {
		File file = new File(tmpOutputFolder, zipFilename);
		for (String folder : destinationFolders) {
			Files.copy(file.toPath(), Paths.get(folder, zipFilename), StandardCopyOption.REPLACE_EXISTING);
		}
	}
			
}
