package com.iisi.newOpendataService.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.iisi.newOpendataService.dbEntity.DbStation;
import com.iisi.newOpendataService.utility.Utility;

@Service
public class QuerySation extends Query<DbStation> {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private DbDao<DbStation> dao;
	@Autowired
	public void setDao(DbDao<DbStation> dao) {
		this.dao = dao;
		this.dao.setClazz(DbStation.class);
		this.dao.setJdbcTemplate(jdbcTemplate);
	}
	
	protected static final String QUERY_STN = "SELECT stno, stnCname, stnEName"
			+ ", CAST(REPLACE(altitude,'M','') AS DECIMAL(5,1)) AS altitude"
			+ ", longitude_WGS84 AS longitude, latitude_WGS84 AS latitude, city AS county, address"
			+ ", IFNULL(DATE(historybegintime), '') AS historybegintime, IFNULL(DATE(stnendtime), '') AS stnendtime"
			+ ", IFNULL(webremark, '') AS note, IFNULL(before_stno, '') AS beforestno, IFNULL(after_stno, '') AS afterstno" 
			+ " FROM station" 
			+ " WHERE %s"
			+ " ORDER BY stno";
	
	protected static final String MANUAL_STN_WHERE_CLAUSE = "classify='cwb' AND stno LIKE '4%' AND stno NOT IN";
	protected static final String AUTO_STN_WHERE_CLAUSE = "classify='autoprec' AND stno LIKE 'c%' AND stno NOT IN";
	
	
	@Override
	public List<DbStation> query(LocalDate startDate, LocalDate endDate, QueryOption... option) {
		String whereClause = null;
		if( ((StationType)(option[0])) == StationType.AUTO) {
			whereClause = AUTO_STN_WHERE_CLAUSE + " (" + Utility.getStns(attr.autoStnStationsExclude) +")";
			return dao.query(String.format(QUERY_STN, whereClause));
		} else {
			whereClause = MANUAL_STN_WHERE_CLAUSE + " (" + Utility.getStns(attr.manualStnStationsExclude) +")";
			return dao.query(String.format(QUERY_STN, whereClause));
		}
	}

}
