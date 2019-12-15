package com.iisi.newOpendataService.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iisi.newOpendataService.config.CwbXmlAttribute;

public  abstract class  Query <T> {

	@Autowired
	protected CwbXmlAttribute attr;
	
	/**
	 * 
	 * @param startDate startDate query from startDate, and startDate is inclusive
	 * @param endDate query to endDate, and endDate is inclusive
	 * @param option other query option other than time parameter
	 * @return
	 */
	abstract public List<T> query(LocalDate startDate, LocalDate endDate, QueryOption... option);
	
}