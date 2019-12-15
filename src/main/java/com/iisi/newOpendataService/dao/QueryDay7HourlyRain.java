package com.iisi.newOpendataService.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.iisi.newOpendataService.dbEntity.DbDay7HourlyRain;

@Service
public class QueryDay7HourlyRain extends Query<DbDay7HourlyRain> {

	@Autowired
	@Qualifier("mysqlJdbcTemplate")
	private JdbcTemplate mySqlJdbcTemplate;

	private DbDao<DbDay7HourlyRain> mySqlDao;

	@Autowired
	public void setMySqlDao(DbDao<DbDay7HourlyRain> dao) {
		this.mySqlDao = dao;
		this.mySqlDao.setClazz(DbDay7HourlyRain.class);
		this.mySqlDao.setJdbcTemplate(mySqlJdbcTemplate);
	}

	// accessible station is put on sql server
	@Autowired
	@Qualifier("sqlServerJdbcTemplate")
	private JdbcTemplate sqlServerJdbcTemplate;

	private DbDao<String> sqlServerDao;

	@Autowired
	public void setSqlServerDao(DbDao<String> dao) {
		this.sqlServerDao = dao;
		this.sqlServerDao.setClazz(String.class);
		this.sqlServerDao.setJdbcTemplate(sqlServerJdbcTemplate);
	}

	// Display = 0 means not to show up on the CODiS website
	// Display = 2 means this station has be retreated
	private String queryStn = "SELECT stno FROM mapstationArea WHERE Display = 1;";
	
	private String queryPrecp = "SELECT b.stno, b.stnCName, b.stnEName, a.obstime, a.precp "
								+ "FROM %s AS a JOIN station AS b ON a.stno = b.stno " 
								+ "WHERE a.stno IN (%s) AND DATE(a.obstime) >= '%s' AND DATE(a.obstime) < '%s';";
	
	@Override
	public List<DbDay7HourlyRain> query(LocalDate startDate, LocalDate endDate, QueryOption... option) {
		List<String> stnList = sqlServerDao.queryReturnList(queryStn);
		String stns = getQueryStn(stnList);
		List<DbDay7HourlyRain> result = new ArrayList<>();
		
		getDateList(startDate, endDate).stream().forEach(dateAry -> {
			String manualTable = dateAry[0].getYear() == LocalDate.now().getYear() ? "cwbhr" : "his_cwbhr";
			String autoTable = dateAry[0].getYear() == LocalDate.now().getYear() ? "autoprechr" : "his_autoprechr";
			result.addAll(mySqlDao.query(String.format(queryPrecp, manualTable, stns, startDate.toString(), endDate.toString())));
			result.addAll(mySqlDao.query(String.format(queryPrecp, autoTable, stns, startDate.toString(), endDate.toString())));
		});
		
		result.stream().forEach(e -> {
			if (e.getPrecp() != null) {
				String value = String.valueOf(e.getPrecp());
				double dd = Double.parseDouble(value);
				if (dd < -90) {
					String lastdd = value.substring(value.length() - 1);
					if (lastdd.equals("1") || lastdd.equals("5") || lastdd.equals("6")) {
						e.setPrecp("X"); // 表故障
					} else if (lastdd.equals("7")) {
						e.setPrecp("/"); // 表不明
					}
				} else if (e.getPrecp().equals("-9.8")) {
					e.setPrecp("T"); // 表微量
				} else if (e.getPrecp().equals("-9.5")) {
					e.setPrecp("X"); // 表故障
				}
			}
		});
		
		return result;
	}

	private String getQueryStn(List<String> listStns) {
		StringJoiner j = new StringJoiner(", ");
		listStns.stream().forEach(e -> j.add("'" + e + "'"));
		return j.toString();
	}
	
	private List<LocalDate[]> getDateList(LocalDate startDate, LocalDate endDate) {
		// startDate and endDate is the same year, so only need to query one table
		if ((startDate.getYear() == LocalDate.now().getYear() && endDate.getYear() == LocalDate.now().getYear())
				|| startDate.getYear() != LocalDate.now().getYear() && endDate.getYear() != LocalDate.now().getYear()) {
			return Collections.singletonList(new LocalDate[] { startDate, endDate.plusDays(1) });
		} else { // we need to query different db tables if the start~end date cross 2 years
			LocalDate midTime = LocalDate.of(endDate.getYear(), 1, 1);
			return Arrays.asList(new LocalDate[] { startDate, midTime },
					new LocalDate[] { midTime, endDate.plusDays(1) });
		}
	}

}
