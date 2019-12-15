package com.iisi.newOpendataService.dao;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.iisi.newOpendataService.dbEntity.DbMN;
import com.iisi.newOpendataService.utility.CwbColumns;
import com.iisi.newOpendataService.utility.Utility;

@Service
public class QueryMN extends Query<DbMN> {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private DbDao<DbMN> dao;
	@Autowired
	public void setDao(DbDao<DbMN> dao) {
		this.dao = dao;
		this.dao.setClazz(DbMN.class);
		this.dao.setJdbcTemplate(jdbcTemplate);
	}
	
	private final List<CwbColumns> weColumns = Arrays.asList(CwbColumns.Tx, CwbColumns.TxMaxAbs, CwbColumns.TxMaxAbsTime
			, CwbColumns.TxMinAbs, CwbColumns.TxMinAbsTime
			, CwbColumns.Precp, CwbColumns.WSMax, CwbColumns.WDMax, CwbColumns.WMaxTime
			, CwbColumns.WSGust, CwbColumns.WDGust, CwbColumns.WGustTime
			, CwbColumns.RH, CwbColumns.RHMin, CwbColumns.RHMinTime
			, CwbColumns.StnPres, CwbColumns.PrecpDay, CwbColumns.SunShine);
	
	@Override
	public List<DbMN> query(LocalDate startDate, LocalDate endDate, QueryOption... option) {
		String table = startDate.getYear() == LocalDate.now().getYear() ? "cwbmn":"his_cwbmn";
		String sql_prefix = "SELECT YEAR(a.ObsTime) AS year, MONTH(a.ObsTime) AS month, b.Stno, b.StnEName, b.StnCName, ";
		StringJoiner dbColumnsS = new StringJoiner(",");
		weColumns.stream().forEach(e -> dbColumnsS.add(e.replaceSpecialNumber()));
		String sql_postfix = " FROM %s AS a INNER JOIN station AS b "
							+ " ON a.Stno = b.Stno "
							+ " WHERE YEAR(a.obstime) = %d AND MONTH(a.obstime) = %d "
								+ " AND b.stno IN (%s)";
		String wholeSql = sql_prefix + dbColumnsS.toString() + sql_postfix;
		String querySql = String.format(wholeSql, table, startDate.getYear(), startDate.getMonthValue(), Utility.getStns(attr.mnStnsInclude));
		return dao.query(querySql);
	}

}
