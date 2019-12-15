package com.iisi.newOpendataService.dao;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.iisi.newOpendataService.dbEntity.DbCODiS;

@Service
public class QueryCODiS extends Query<DbCODiS> {

	@Autowired
	@Qualifier("mysqlJdbcTemplate")
	private JdbcTemplate mySqlJdbcTemplate;

	private DbDao<?> mySqlDao;

	@Autowired
	public void setMySqlDao(DbDao<?> dao) {
		this.mySqlDao = dao;
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
	
	private String queryManual = "SELECT b.stno, b.stnCName, b.stnEName "
									+ ", a.obsTime, a.stnPres, a.seaPres, a.tx, a.td, a.rh"
									+ ", a.ws, a.wd, a.wsGust, a.wdGust"
									+ ", a.precp, a.precpHour, a.sunShine, a.globlRad " 
									+ ", a.visb, a.uvi, a.cAmtTotal "
								+ "FROM %s AS a JOIN station AS b ON a.stno = b.stno " 
								+ "WHERE a.stno IN (%s) AND DATE(a.obstime) = '%s';";
	private String queryAuto = "SELECT b.stno, b.stnCName, b.stnEName "
									+ ", a.obsTime, a.stnPres, a.tx, a.rh"
									+ ", a.ws, a.wd , a.precp, a.sunShine "
								+ "FROM %s AS a JOIN station AS b ON a.stno = b.stno " 
								+ "WHERE a.stno IN (%s) AND DATE(a.obstime) = '%s'";

	@Override
	public List<DbCODiS> query(LocalDate startDate, LocalDate endDate, QueryOption... option) {
		String manualTable = startDate.getYear() == LocalDate.now().getYear() ? "cwbhr" : "his_cwbhr";
		String autoTable = startDate.getYear() == LocalDate.now().getYear() ? "autoprechr" : "his_autoprechr";
		List<String> stnList = sqlServerDao.queryReturnList(queryStn);
		String stns = getQueryStn(stnList);
		List<Map<String, Object>> manualCODiS = mySqlDao.queryReturnMap(String.format(queryManual, manualTable, stns, startDate.toString()));
		List<Map<String, Object>> autoCODiS = mySqlDao.queryReturnMap(String.format(queryAuto, autoTable, stns, startDate.toString()));
		manualCODiS.addAll(autoCODiS);
		List<Map<String, Object>> afterHandled = handleDataList(manualCODiS);
		List<DbCODiS> result = new ArrayList<>();
		
		for(Map<String, Object> map : afterHandled) {
			DbCODiS entity = new DbCODiS();
			entity.setStno((String)map.get("stno"));
			entity.setStnCName((String)map.get("stnCName"));
			entity.setStnEName((String)map.get("stnEName"));
			entity.setObsTime(((Timestamp)map.get("obsTime")).toLocalDateTime());
			
			if(!entity.getStno().startsWith("C")) {
				entity.setSeaPres(String.valueOf(map.get("seaPres")));
				entity.setTd(String.valueOf(map.get("td")));
				entity.setWsGust(String.valueOf(map.get("wsGust")));
				entity.setWdGust(String.valueOf(map.get("wdGust")));
				entity.setPrecpHour(String.valueOf(map.get("precpHour")));
				entity.setGloblRad(String.valueOf(map.get("globlRad")));
				entity.setVisb(String.valueOf(map.get("visb")));
				entity.setUvi(String.valueOf(map.get("uvi")));
				entity.setcAmtTotal(String.valueOf(map.get("cAmtTotal")));
			} else { // auto station does not observe these elements
				entity.setSeaPres("");
				entity.setTd("");
				entity.setWsGust("");
				entity.setWdGust("");
				entity.setPrecpHour("");
				entity.setGloblRad("");
				entity.setVisb("");
				entity.setUvi("");
				entity.setcAmtTotal("");
			}
			
			entity.setStnPres(String.valueOf(map.get("stnPres")));
			entity.setTx(String.valueOf(map.get("tx")));
			entity.setRh(String.valueOf(map.get("rh")));
			entity.setWs(String.valueOf(map.get("ws")));
			entity.setWd(String.valueOf(map.get("wd")));
			entity.setPrecp(String.valueOf(map.get("precp")));
			entity.setSunShine(String.valueOf(map.get("sunShine")));
			
			result.add(entity);
		}
		
		return result;
	}

	private String getQueryStn(List<String> listStns) {
		StringJoiner j = new StringJoiner(", ");
		listStns.stream().forEach(e -> j.add("'" + e + "'"));
		return j.toString();
	}

	public List<Map<String, Object>> handleDataList(List<Map<String, Object>> dataList) {
		for (Map<String, Object> data : dataList) {
			for (String key : data.keySet()) {
				if ( key.equalsIgnoreCase("Stno") 
						|| key.equalsIgnoreCase("StnCName") || key.equalsIgnoreCase("StnEName")
						|| key.equalsIgnoreCase("obsTime")) {
					continue;
					
				} else if (data.get(key) == null){
					data.put(key, "");
					
				} else {
					
					String value = String.valueOf(data.get(key));
					double dd = Double.parseDouble(value);
					if (dd < -90) {
						String lastdd = value.substring(value.length() - 1);
						if (lastdd.equals("1") || lastdd.equals("5") || lastdd.equals("6")) {
							data.put(key, "X"); // 表故障
						} else if (lastdd.equals("7")) {
							data.put(key, "/"); // 表不明
						}
						
					} else if ((key.equalsIgnoreCase("Precp") || key.equalsIgnoreCase("PrecpMax10") 
									|| key.equalsIgnoreCase("PrecpHrMax") || key.equalsIgnoreCase("PrecpHour")) 
								&& dd == -9.8) {
						data.put(key, "T"); // 表微量
						
					} else if ((key.equalsIgnoreCase("Precp") || key.equalsIgnoreCase("PrecpMax10") 
									|| key.equalsIgnoreCase("PrecpHrMax") || key.equalsIgnoreCase("PrecpHour")) 
								&& dd == -9.5) {
						data.put(key, "X"); // 表故障
					
					} else if (key.equalsIgnoreCase("WD")) {
						if (dd == 999.9) {
							data.put(key, "V"); // 表風向不定
						} else {
							data.put(key, (int) dd);
						}
						
					} else if (key.equalsIgnoreCase("WDGust")) {
						data.put(key, (int) dd);
		
					} else if (key.equalsIgnoreCase("SunShine")) {
						if (dd == -9.7) {
							data.put(key, "/"); // 表不明
						} else if (dd == -9.5) {
							data.put(key, "X"); // 表故障
						}
						
					} else if (key.equalsIgnoreCase("GloblRad") && dd == -9.95) {
						data.put(key, "X"); // 表故障
					
					} else if (key.equalsIgnoreCase("uvi") || key.equalsIgnoreCase("uviMax")) {
						data.put(key, Math.round(dd)); // 四捨五入到整數
					
					} else if (key.equalsIgnoreCase("CAmtMean") && dd == -9.7) {
						data.put(key, "/"); // 表不明
					
					} else if (key.equalsIgnoreCase("CAmtTotal") && dd == -9.7) {
						data.put(key, "/"); // 表不明
					}
				}
			}
		}
		return dataList;
	}

}
