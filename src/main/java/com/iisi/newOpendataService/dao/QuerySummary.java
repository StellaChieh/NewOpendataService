package com.iisi.newOpendataService.dao;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.iisi.newOpendataService.dbEntity.DbSummary;
import com.iisi.newOpendataService.dbEntity.DbSummaryRecord;
import com.iisi.newOpendataService.utility.CwbColumns;
import com.iisi.newOpendataService.utility.Utility;

@Service
public class QuerySummary extends Query<DbSummary> {
		
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private DbDao<DbSummaryRecord> dao;
	@Autowired
	public void setDao(DbDao<DbSummaryRecord> dao) {
		this.dao = dao;
		this.dao.setClazz(DbSummaryRecord.class);
		this.dao.setJdbcTemplate(jdbcTemplate);
	}
	
	private List<CwbColumns> wes = Arrays.asList(
			CwbColumns.StnPres
			, CwbColumns.Tx, CwbColumns.MeanTxMax, CwbColumns.MeanTxMin
			, CwbColumns.TxMaxGE30Day, CwbColumns.TxGE25Day, CwbColumns.TxMinLE10Day
			, CwbColumns.RH, CwbColumns.CAmtMean, CwbColumns.SunShine
			, CwbColumns.Precp, CwbColumns.PrecpDay, CwbColumns.WS);

	private String sql = "SELECT tmp.stno AS stno, station.stnCName, station.stnEName, "
							+ "sy.%1$s AS startYear, ey.%1$s AS endYear, " 
							+ "SUM(CASE mn WHEN 1 THEN tmp.%1$s ELSE NULL END) AS mn1, "
							+ "SUM(CASE mn WHEN 2 THEN tmp.%1$s ELSE NULL END) AS mn2, "
							+ "SUM(CASE mn WHEN 3 THEN tmp.%1$s ELSE NULL END) AS mn3, "
							+ "SUM(CASE mn WHEN 4 THEN tmp.%1$s ELSE NULL END) AS mn4, "
							+ "SUM(CASE mn WHEN 5 THEN tmp.%1$s ELSE NULL END) AS mn5, "
							+ "SUM(CASE mn WHEN 6 THEN tmp.%1$s ELSE NULL END) AS mn6, "
							+ "SUM(CASE mn WHEN 7 THEN tmp.%1$s ELSE NULL END) AS mn7, "
							+ "SUM(CASE mn WHEN 8 THEN tmp.%1$s ELSE NULL END) AS mn8, "
							+ "SUM(CASE mn WHEN 9 THEN tmp.%1$s ELSE NULL END) AS mn9, "
							+ "SUM(CASE mn WHEN 10 THEN tmp.%1$s ELSE NULL END) AS mn10, "
							+ "SUM(CASE mn WHEN 11 THEN tmp.%1$s ELSE NULL END) AS mn11, "
							+ "SUM(CASE mn WHEN 12 THEN tmp.%1$s ELSE NULL END) AS mn12 "
						+ "FROM ("
							+ "SELECT stno, MONTH(obstime) AS mn, ROUND(AVG(%1$s), 1) AS %1$s "
							+ "FROM his_cwbmn "
							+ "WHERE (obstime BETWEEN '%2$s' AND '%3$s') "
								+ "AND (stno IN (%4$s)) "
								+ "AND (%5$s) "
							+ "GROUP BY stno, mn "
							+ ") AS tmp "
						+ "LEFT JOIN station ON tmp.stno = station.stno "
						+ "LEFT JOIN summary_start_year AS sy ON tmp.stno = sy.stno "
						+ "LEFT JOIN summary_end_year AS ey ON tmp.stno = ey.stno "
						+ "GROUP BY stno;";

	private int startYear;
	private int endYear;
	private String startYearS;
	private String endYearS;
	
	@Override
	public List<DbSummary> query(LocalDate startDate, LocalDate endDate, QueryOption... option) {
		this.startYear = startDate.getYear();
		this.endYear = startYear + 29;
		this.startYearS = Integer.toString(startYear) + "-01-01 00:00:00";
		this.endYearS = Integer.toString(endYear) + "-12-31 23:59:59";
	
		Map<String, DbSummary> dbSummaryMap = new HashMap<>();
		
		for (CwbColumns we : wes) {	
			List<DbSummaryRecord> records;
			if (we.equals(CwbColumns.Precp)) {
				records = processPrecp();
			} else {
				String wholeSql = String.format(sql, we.toString(), startYearS, endYearS, Utility.getStns(attr.summaryStnsInclude), we.whereNoSpecialNumberClause());
				records = dao.query(wholeSql);
			}
		
			for (DbSummaryRecord record : records) {
				DbSummary entity = dbSummaryMap.get(record.getStno());
				if(entity == null) {
					entity = new DbSummary();
					entity.setStnId(record.getStno());
					entity.setStnEName(record.getStnEName());
					entity.setStnCName(record.getStnCName());
					dbSummaryMap.put(record.getStno(), entity);
				}
				String[] dataAry = entity.getWeatherElementData(we);
				for (int i=0; i<dataAry.length; i++) {
					if (i == 12) { // start year
						String stnWeStartYear = record.getStartYear().equalsIgnoreCase("null") ? String.valueOf(startYear) : record.getStartYear();
						// if the start year is earlier than the program start year
						// , we use the start year of this program instead
						stnWeStartYear = Integer.parseInt(stnWeStartYear) < startYear ? String.valueOf(startYear) : stnWeStartYear;
						dataAry[12] = String.valueOf(stnWeStartYear);
					} else if (i == 13) { // end year
						String stnWeEndYear = record.getEndYear().equalsIgnoreCase("null")? String.valueOf(endYear) : record.getEndYear();
						// if the end year is later than the program end year
						// , we use the end year of this program instead
						stnWeEndYear = Integer.parseInt(stnWeEndYear) > endYear ? String.valueOf(endYear) : stnWeEndYear; 
						dataAry[13] = String.valueOf(stnWeEndYear);
					} else { // other data
						dataAry[i] = record.getAllMonthsData()[i];
					} 
				}
			}		
		}
		return dbSummaryMap.values().stream().collect(Collectors.toList());
	}
	
	// special process of Precp because we have to generate "T" when precp=9.8
	private List<DbSummaryRecord> processPrecp() {
		
		String precpSql = "SELECT tmp.stno AS stno, station.stnCName, station.stnEName, "
							+ "sy.precp AS startYear, ey.precp AS endYear, " 
							+ "IF(SUM(CASE mn WHEN 1 THEN tmp.precp ELSE NULL END)=0.0, 'T', SUM(CASE mn WHEN 1 THEN tmp.precp ELSE NULL END)) AS mn1, "
							+ "IF(SUM(CASE mn WHEN 2 THEN tmp.precp ELSE NULL END)=0.0, 'T', SUM(CASE mn WHEN 2 THEN tmp.precp ELSE NULL END)) AS mn2, "
							+ "IF(SUM(CASE mn WHEN 3 THEN tmp.precp ELSE NULL END)=0.0, 'T', SUM(CASE mn WHEN 3 THEN tmp.precp ELSE NULL END)) AS mn3, "
							+ "IF(SUM(CASE mn WHEN 4 THEN tmp.precp ELSE NULL END)=0.0, 'T', SUM(CASE mn WHEN 4 THEN tmp.precp ELSE NULL END)) AS mn4, "
							+ "IF(SUM(CASE mn WHEN 5 THEN tmp.precp ELSE NULL END)=0.0, 'T', SUM(CASE mn WHEN 5 THEN tmp.precp ELSE NULL END)) AS mn5, "
							+ "IF(SUM(CASE mn WHEN 6 THEN tmp.precp ELSE NULL END)=0.0, 'T', SUM(CASE mn WHEN 6 THEN tmp.precp ELSE NULL END)) AS mn6, "
							+ "IF(SUM(CASE mn WHEN 7 THEN tmp.precp ELSE NULL END)=0.0, 'T', SUM(CASE mn WHEN 7 THEN tmp.precp ELSE NULL END)) AS mn7, "
							+ "IF(SUM(CASE mn WHEN 8 THEN tmp.precp ELSE NULL END)=0.0, 'T', SUM(CASE mn WHEN 8 THEN tmp.precp ELSE NULL END)) AS mn8, "
							+ "IF(SUM(CASE mn WHEN 9 THEN tmp.precp ELSE NULL END)=0.0, 'T', SUM(CASE mn WHEN 9 THEN tmp.precp ELSE NULL END)) AS mn9, "
							+ "IF(SUM(CASE mn WHEN 10 THEN tmp.precp ELSE NULL END)=0.0, 'T', SUM(CASE mn WHEN 10 THEN tmp.precp ELSE NULL END)) AS mn10, "
							+ "IF(SUM(CASE mn WHEN 11 THEN tmp.precp ELSE NULL END)=0.0, 'T', SUM(CASE mn WHEN 11 THEN tmp.precp ELSE NULL END)) AS mn11, "
							+ "IF(SUM(CASE mn WHEN 12 THEN tmp.precp ELSE NULL END)=0.0, 'T', SUM(CASE mn WHEN 12 THEN tmp.precp ELSE NULL END)) AS mn12 "
						+ "FROM ("
								+ "SELECT sub.stno, MONTH(sub.obstime) AS mn, ROUND(AVG(sub.precp), 1) AS precp "
								+ "FROM ("
									+ "SELECT stno, obstime, REPLACE(precp, -9.8, 0) AS precp "
									+ "FROM his_cwbmn "
									+ "WHERE (obstime BETWEEN '%1$s' AND '%2$s') "
										+ "AND (stno IN (%3$s)) "
										+ "AND (%4$s) "
									+ ") AS sub "
								+ "GROUP BY stno, mn "
								+ ") AS tmp "
						  + "LEFT JOIN station ON tmp.stno = station.stno "
						  + "LEFT JOIN summary_start_year AS sy ON tmp.stno = sy.stno "
						  + "LEFT JOIN summary_end_year AS ey ON tmp.stno = ey.stno "
						+ "GROUP BY stno;";
		
		String wholeSql = String.format(precpSql, this.startYearS, this.endYearS, Utility.getStns(attr.summaryStnsInclude), CwbColumns.Precp.whereNoSpecialNumberClause());
		return dao.query(wholeSql);
		
	}
	
	
}
