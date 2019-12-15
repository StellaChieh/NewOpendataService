package com.iisi.newOpendataService.makeXml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.DateTimeException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.iisi.newOpendataService.MakeFile;
import com.iisi.newOpendataService.config.CwbXmlAttribute;
import com.iisi.newOpendataService.dao.Query;
import com.iisi.newOpendataService.utility.MakeFileServiceType;
import com.iisi.newOpendataService.utility.TimeInputException;

public abstract class MakeXmlTemplate<K, V> implements MakeFile {

	private static Logger logger= LoggerFactory.getLogger(MakeXmlTemplate.class);
	
	@Autowired
	protected CwbXmlAttribute attr;

	@Autowired
	protected Query<K> query;

	protected String xmlVersion = "1.0";
	protected String tmpOutputFolder = "output";
	private Class<V> xmlClass;
	private String xmlFilename;
	private List<String> destinationFolders;

	public abstract void setParameters(String... arg)
			throws TimeInputException, NumberFormatException, DateTimeException;

	///////
	/////// Spring bean initialization
	///////
	@PostConstruct
	protected void init() {
		xmlClass = getXmlClass();
		xmlFilename = getFilename();
		destinationFolders = getDestinationFolders();
		register();
	}

	protected abstract Class<V> getXmlClass();

	protected abstract String getFilename();

	protected abstract List<String> getDestinationFolders();

	protected abstract void register();

	protected void register(MakeFileServiceType type, String beanName) {
		MakeFileServiceType.getFileServiceBeanMap().put(type, beanName);
	}

	///////
	/////// Making XML template
	///////
	public void run() throws IOException, DatatypeConfigurationException, JAXBException {
		logger.info("Quering data...");
		List<K> dbEntity = query();
		logger.info("Making XML object...");
		Object xmlInstance = createCwbData(dbEntity);
		logger.info("Marshalling XML object...");
		StringWriter xmlSw = marshall(xmlInstance);
		logger.info("Writing to file...");
		writeXml(xmlSw);
		// user could determine if whether transmit to downstream
		if (attr.transmitToDownstream) {
			copyToFolder();
		}
	};

	protected abstract List<K> query();

	protected abstract V createCwbData(List<K> dbEntity) throws DatatypeConfigurationException;

	protected StringWriter marshall(Object xmlInstance) throws JAXBException {
		JAXBContext	jc = JAXBContext.newInstance(xmlClass);
		Marshaller	m = jc.createMarshaller();
		// format xml (indentation)
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// set xml xsi:schemaLocation
		m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, attr.xmlSchemaLocation);
		// make customised '<?xml version=\"" + xmlVersion + "\" encoding=\"UTF-8\"?>\n"
		m.setProperty(Marshaller.JAXB_FRAGMENT, true);
		StringWriter writer = new StringWriter();
		String xmlStartElement = "<?xml version=\"" + xmlVersion + "\" encoding=\"UTF-8\"?>\n";
		writer.write(xmlStartElement);
		m.marshal(xmlInstance, writer);
		return writer;
	}

	protected void writeXml(StringWriter sw) {
		try {
			if(!Paths.get(tmpOutputFolder).toFile().exists()) {
				Files.createDirectory(Paths.get(tmpOutputFolder));
			}
			FileWriter fw = new FileWriter(new File(tmpOutputFolder, xmlFilename));
			fw.write(sw.toString());
			fw.close();
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
	}

	private void copyToFolder() throws IOException {
		File file = new File(tmpOutputFolder, xmlFilename);
		for (String folder : destinationFolders) {
			Files.copy(file.toPath(), Paths.get(folder, xmlFilename), StandardCopyOption.REPLACE_EXISTING);
			logger.info("Copy XML to " + Paths.get(folder, xmlFilename).toString());
		}
		
	}

	public void setTmpOutputFolder(String tmpOutputFolder) {
		this.tmpOutputFolder = tmpOutputFolder;
	}
	
}
