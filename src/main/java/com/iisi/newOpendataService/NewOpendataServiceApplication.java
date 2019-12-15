package com.iisi.newOpendataService;

import java.io.IOException;
import java.time.DateTimeException;
import java.util.Arrays;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.iisi.newOpendataService.makeXml.MakeXmlTemplate;
import com.iisi.newOpendataService.makeZip.MakeZipTemplate;
import com.iisi.newOpendataService.utility.MakeFileServiceType;
import com.iisi.newOpendataService.utility.TimeInputException;

@SpringBootApplication
public class NewOpendataServiceApplication {
	
	private static Logger logger= LoggerFactory.getLogger(NewOpendataServiceApplication.class);
	private boolean printBean = false;
	private static boolean isTest = false;
	
	private static final String FAIL = "fail; ";
	
	public static void main(String[] args) {
		if(isTest) {
			testAll();
		} else {
			makeFile(args);
		}
	}
	
	// test only
	public static void makeZIP(String[] args) {
		ApplicationContext context = SpringApplication.run(NewOpendataServiceApplication.class);
		
		MakeZipTemplate makeZip = (MakeZipTemplate)context.getBean("makeHisMNZip");
		
		try {
			makeZip.setParameters("2010");
			makeZip.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("finish");
	}
	
	
	public static void makeFile(String[] args) {
		
		ApplicationContext context = SpringApplication.run(NewOpendataServiceApplication.class);
		
		if(args.length == 0) {
			System.out.println(FAIL + "Expect service type as argument.");
			logger.info(FAIL + "Expect service type as argument.");
			return;
		}
		
		MakeFileServiceType serviceType = getService(args[0]);
		if(serviceType == null) {
			System.out.println(FAIL + "No matching service type argument. User inputs " + args[0]);
			logger.info(FAIL + "No matching service type argument. User inputs " + args[0]);
			return;
		}
		String time = null;
		if(args.length == 2) {
			time = args[1];
		}
		
		String serviceBean = MakeFileServiceType.getFileServiceBeanMap().get(serviceType);
		logger.info(">>>>>>>>>> Start generating [[" + serviceType.name() + "]] at time: " + time + "<<<<<<<<<<") ;
		
		MakeFile makeFile = (MakeFile)context.getBean(serviceBean);
		logger.debug("Bean " + serviceBean + " starts running!");
		boolean succeed = false;
		try {
			if(time == null) {
				makeFile.setParameters();
			} else {
				makeFile.setParameters(time);
			}
			makeFile.run();
			succeed = true;
		} catch (NumberFormatException e) {
			System.out.println(FAIL + "Input time format errror.");
			loggingFail(e);
			return;
		} catch (DateTimeException e) {
			System.out.println(FAIL + "Wrong time.");
			loggingFail(e);
			return;
		} catch (TimeInputException e) {
			System.out.println(FAIL + "Wrong time duration or too time is too new.");
			logger.error(e.getMessage());
			return;
		} catch (IOException e) {
			System.out.println(FAIL + "IO error.");
			loggingFail(e);
			return;
		} catch (DatatypeConfigurationException e) {
			System.out.println(FAIL + "Convert time to XMLTime error.");
			loggingFail(e);
			return;
		} catch (Exception e) {
			System.out.println(FAIL);
			loggingFail(e);
			return;
		}
		if(succeed) {
			System.out.println("succeed");
			logger.info(">>>>>>>>>> Generating [[" + serviceType.name() + "]] at time: " + time + " succeed! <<<<<<<<<<");
		} else {
			logger.error(">>>>>>>>>> Generating [[" + serviceType.name() + "]] at time: " + time + " failed! <<<<<<<<<<");
		}
		
	}

	private static void loggingFail(Exception e) {
		logger.error(e.getMessage());
		Arrays.asList(e.getStackTrace()).forEach(msg -> logger.error(msg.toString()));		
	}


	private static void testAll() {
		
		ApplicationContext context = SpringApplication.run(NewOpendataServiceApplication.class);
		Map<MakeFileServiceType, String> serviceMap = MakeFileServiceType.getFileServiceBeanMap();
		
		for (MakeFileServiceType xmlType : serviceMap.keySet()) {

			MakeXmlTemplate<?, ?> makeXml = (MakeXmlTemplate<?, ?>) context.getBean(serviceMap.get(xmlType));
			try {
				makeXml.setParameters();
				makeXml.run();

			} catch (NumberFormatException e) {
				e.printStackTrace();
				return;
			} catch (DateTimeException e) {
				e.printStackTrace();
				return;
			} catch (TimeInputException e) {
				e.printStackTrace();
				return;
			} catch (IOException e) {
				e.printStackTrace();
				return;
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}

		}
	}

	private static MakeFileServiceType getService(String arg) {
		switch (arg) {
		case "autoStn":
			return MakeFileServiceType.AutoStation;
		case "manualStn":
			return MakeFileServiceType.ManualStation;
		case "day30":
			return MakeFileServiceType.Day30Report;
		case "dy":
			return MakeFileServiceType.DYReport;
		case "mn":
			return MakeFileServiceType.MNReport;
		case "summary":
			return MakeFileServiceType.SummaryReport;
		case "day7Rain":
			return MakeFileServiceType.Day7HourlyRain;
		case "CODiS":
			return MakeFileServiceType.CODiS;
		case "autoNOAA":
			return MakeFileServiceType.AutoNOAACN;
		case "manualNOAA":
			return MakeFileServiceType.ManualNOAACN;
		case "autoNOAA_en":
			return MakeFileServiceType.AutoNOAAEN;
		case "manualNOAA_en":
			return MakeFileServiceType.ManualNOAAEN;
		case "dy9Year":
			return MakeFileServiceType.HisDY;
		case "mn9Year":
			return MakeFileServiceType.HisMN;
		default:
			return null;
		}
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			if (printBean) {
				System.out.println("====Let's inspect the beans provided by Spring Boot===");

				String[] beanNames = ctx.getBeanDefinitionNames();
				Arrays.sort(beanNames);
				for (String beanName : beanNames) {
					System.out.println(beanName);
				}
			}
		};
	}

}
