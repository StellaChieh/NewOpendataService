package com.iisi.newOpendataService.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.iisi.newOpendataService.dbEntity.DbDay30;
import com.iisi.newOpendataService.utility.CwbColumns;
import com.iisi.newOpendataService.utility.Utility;

@Service
public class QueryDay30 extends Query<DbDay30> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private DbDao<DbDay30> dyDao;
	@Autowired
	public void setDyDao(DbDao<DbDay30> dyDao) {
		this.dyDao = dyDao;
		this.dyDao.setClazz(DbDay30.class);
		this.dyDao.setJdbcTemplate(jdbcTemplate);
	}

	private DbDao<DbDay30.OneHourData> hrDao;
	@Autowired
	public void setHrDao(DbDao<DbDay30.OneHourData> hrDao) {
		this.hrDao = hrDao;
		this.hrDao.setClazz(DbDay30.OneHourData.class);
		this.hrDao.setJdbcTemplate(jdbcTemplate);
	}


	@Override
	public List<DbDay30> query(LocalDate startDate, LocalDate endDate, QueryOption... option) {
		String dySqlPrefix = "SELECT b.stno, b.StnEName, b.StnCName, a.ObsTime as ObsTimeDate, ";
		String hrSqlPrefix = "SELECT b.stno, b.StnEName, b.StnCName, a.ObsTime , ";
		String dyColumns = new StringJoiner(",").add(CwbColumns.Tx.replaceSpecialNumber())
				.add(CwbColumns.TxMaxAbs.replaceSpecialNumber()).add(CwbColumns.TxMinAbs.replaceSpecialNumber())
				.toString();
		String hrColumns = new StringJoiner(",").add(CwbColumns.StnPres.replaceSpecialNumber())
				.add(CwbColumns.Tx.replaceSpecialNumber()).add(CwbColumns.RH.replaceSpecialNumber())
				.add(CwbColumns.WS.replaceSpecialNumber()).add(CwbColumns.WD.replaceSpecialNumber())
				.add(CwbColumns.Precp.replaceSpecialNumber()).add(CwbColumns.SunShine.replaceSpecialNumber())
				.toString();
		String sqlPostfix = " FROM %s AS a INNER JOIN station AS b ON a.stno = b.stno "
							+ "WHERE a.ObsTime >= '%s' AND a.ObsTime < '%s' " + "AND b.stno IN (%s);";
		String dySqlWhole = dySqlPrefix + dyColumns + sqlPostfix;
		String hrSqlWhole = hrSqlPrefix + hrColumns + sqlPostfix;

		List<DbDay30> dyRecords = new ArrayList<>();
		List<DbDay30.OneHourData> hrRecords = new ArrayList<>();
		
		// query
		getDateList(startDate, endDate).stream().forEach(e -> {
			boolean thisYear = e[0].getYear() == LocalDate.now().getYear();
			String dyTable = thisYear ? "cwbdy" : "his_cwbdy";
			String hrTable = thisYear ? "cwbhr" : "his_cwbhr";
			dyRecords.addAll(dyDao.query(
					String.format(dySqlWhole, dyTable, e[0].toString(), e[1].toString(), Utility.getStns(attr.day30StnsInclude))));
			hrRecords.addAll(hrDao.query(
					String.format(hrSqlWhole, hrTable, e[0].toString(), e[1].toString(), Utility.getStns(attr.day30StnsInclude))));
		});

		// put DbHR.OneHourData into DbHR
		hrRecords.stream().forEach(hourlyData -> {
			dyRecords.stream().forEach(dyData -> {
				if (hourlyData.getObsTime().toLocalDate().equals(dyData.getObsTimeDate())
						&& hourlyData.getStno().equals(dyData.getStno())) {
					dyData.addHourlyData(hourlyData.getObsTime(), hourlyData);
				}
			});
		});
		return dyRecords;
	}

	private List<LocalDate[]> getDateList(LocalDate startDate, LocalDate endDate) {
		if ((startDate.getYear() == LocalDate.now().getYear() && endDate.getYear() == LocalDate.now().getYear())
				|| startDate.getYear() != LocalDate.now().getYear() && endDate.getYear() != LocalDate.now().getYear()) {
			return Collections.singletonList(new LocalDate[] { startDate, endDate.plusDays(1) });
		} else { // we need to query different db table if the start~end date cross 2 years
			LocalDate midTime = LocalDate.of(endDate.getYear(), 1, 1);
			return Arrays.asList(new LocalDate[] { startDate, midTime },
					new LocalDate[] { midTime, endDate.plusDays(1) });
		}
	}

}
