package com.iisi.newOpendataService.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.iisi.newOpendataService.dbEntity.DbNOAA;

@Service
public class QueryNOAA extends Query<DbNOAA> {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private DbDao<DbNOAA> dao;
	@Autowired
	public void setDao(DbDao<DbNOAA> dao) {
		this.dao = dao;
		this.dao.setClazz(DbNOAA.class);
		this.dao.setJdbcTemplate(jdbcTemplate);
	}
	
	
	private String sql = "SELECT b.stno, b.stnCName, b.stnEName"
						+ ", a.obstime, a.precp, a.%s AS txMaxAbs, a.%s AS txMinAbs "
						+ "FROM %s AS a JOIN station AS b ON a.stno = b.stno " 
						+ "WHERE DATE(a.obstime) = '%s';";
	
	
	private boolean isManual;
	
	@Override
	public List<DbNOAA> query(LocalDate startDate, LocalDate endDate, QueryOption... option) {
		isManual =  ((StationType)(option[0])) == StationType.MANUAL ? true:false;
		String txMax = isManual ? "txMaxAbs" : "txMax";
		String txMin = isManual ? "txMinAbs" : "txMin";
		return dao.query(String.format(sql, txMax, txMin, getTable(startDate), startDate));
	}
	
	
	private String getTable(LocalDate startDate) {
		String table;
		if(isManual) {
			table = startDate.getYear() == LocalDate.now().getYear() ? "cwbdy" : "his_cwbdy";
		} else {
			table = startDate.getYear() == LocalDate.now().getYear() ? "autoprecdy" : "his_autoprecdy";
		}
		return table;
	}

}
