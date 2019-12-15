package com.iisi.newOpendataService.utility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class Utility {
	
	
	public static String getStns(String stnInProperites) {
		String[] arys = stnInProperites.split(",");
		StringJoiner sj = new StringJoiner(",");
		for (String a : arys) {
			sj.add("'" + a.trim() + "'");
		}
		return sj.toString();
	}

	// turn to xml datetime
	public final static XMLGregorianCalendar getXmlDateTime(LocalDateTime localDateTime) throws DatatypeConfigurationException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		String formattedDateTime = localDateTime.format(formatter);
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(formattedDateTime + "+08:00");
		
	}

	// turn to xml date
	public final static XMLGregorianCalendar getXmlDate(LocalDate date) throws DatatypeConfigurationException {
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(date.toString());
	}
	
	// tell manual or auto station
	public final static String getStationAttribution(String stno) {
		if(stno.startsWith("C")) {
			return "局屬自動氣象站";
		} else {
			return "局屬有人氣象站";
		}
	}
	
	public final static String transTo24HourTimeType(LocalDateTime localDateTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		String src = localDateTime.format(formatter);
		if(src.contains("23:59:00")) {
			return src.split("T")[0] + "T24:00:00+08:00";
		} else {
			return src + "+08:00";
		}
	}
}
