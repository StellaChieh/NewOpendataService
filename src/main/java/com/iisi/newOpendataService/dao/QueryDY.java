package com.iisi.newOpendataService.dao;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.iisi.newOpendataService.dbEntity.DbDY;
import com.iisi.newOpendataService.utility.CwbColumns;
import com.iisi.newOpendataService.utility.Utility;

@Service
public class QueryDY extends Query<DbDY> {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private DbDao<DbDY.DbOneRecord> dao;
	@Autowired
	public void setDyDao(DbDao<DbDY.DbOneRecord> dao) {
		this.dao = dao;
		this.dao.setClazz(DbDY.DbOneRecord.class);
		this.dao.setJdbcTemplate(jdbcTemplate);
	}
	
	private static Map<String, String> cityMap;
	
	
	@Override
	public List<DbDY> query(LocalDate startDate, LocalDate endDate, QueryOption... option) {
		String dyTable = startDate.getYear() == LocalDate.now().getYear() ? "cwbdy" : "his_cwbdy";
		String mnTable = startDate.getYear() == LocalDate.now().getYear() ? "cwbmn" : "his_cwbmn";
		String autoDyTable = startDate.getYear() == LocalDate.now().getYear() ? "autoprecdy" : "his_autoprecdy";
		String autoMnTable = startDate.getYear() == LocalDate.now().getYear() ? "autoprecmn" : "his_autoprecmn";
		String manualStnCName = "b.stnCName";
		String autoStnCName = "SUBSTRING(b.city, 1, 2) AS stnCName";
		
		String sql = "SELECT b.stno, %s, b.stnEName, a.obstime, " + CwbColumns.Precp.replaceSpecialNumber() 
					+ " FROM station AS b INNER JOIN %s AS a ON a.stno = b.stno"
					+ " WHERE '" + startDate.toString() + "' <= a.obstime"
						+ " AND a.obstime < '" + endDate.toString() + "'" 
						+ " AND b.stno IN (%s)";
		
		// query auto daily
		List<DbDY.DbOneRecord> dailys = dao.query(String.format(sql, autoStnCName, autoDyTable, Utility.getStns(attr.dyAutoStnsInclude)));
		// change auto English station name to city name
		dailys.forEach(d -> d.setStnEName(cityCEMap().get(d.getStnCName())));  
		// query manual daily
		dailys.addAll(dao.query(String.format(sql, manualStnCName, dyTable, Utility.getStns(attr.dyManualStnsInclude)))); 
		
		// query auto monthly 
		List<DbDY.DbOneRecord> monthlys = dao.query(String.format(sql, autoStnCName, autoMnTable, Utility.getStns(attr.dyAutoStnsInclude)));
		// change auto English station name to city name
		monthlys.forEach(d -> d.setStnEName(cityCEMap().get(d.getStnCName())));
		// query manual monthly
		monthlys.addAll(dao.query(String.format(sql, manualStnCName, mnTable, Utility.getStns(attr.dyManualStnsInclude))));
		
		Map<String, DbDY> stns = new HashMap<>();
		monthlys.stream().forEach(monthly -> {
			DbDY entity = stns.get(monthly.getStno());
			if (entity == null) {
				entity = new DbDY();
				entity.setStno(monthly.getStno());
				entity.setStnCName(monthly.getStnCName());
				entity.setStnEName(monthly.getStnEName());
				entity.setYear(monthly.getObstime().getYear());
				stns.put(entity.getStno(), entity);
			}
			entity.getTotal()[monthly.getObstime().getMonthValue()-1] = monthly.getPrecp();
		});
		dailys.stream().forEach(daily -> {
			DbDY entity = stns.get(daily.getStno());
			entity.getData()
			[daily.getObstime().getDayOfMonth()-1][daily.getObstime().getMonthValue()-1] = daily.getPrecp();
		});
		
		return stns.values().stream().sorted(new Comparator<DbDY>() {
			// sort the order of DbDY. Manual station first, then auto station.
			public int compare(DbDY o1, DbDY o2) {
				String stno1 = o1.getStno();
				String stno2 = o2.getStno();
				if(stno1.startsWith("C") && stno2.startsWith("C") ||
						!stno1.startsWith("C") && !stno2.startsWith("C")) {
					return stno1.compareTo(stno2);
				} else {
					if (stno1.startsWith("C")) {
						return 1;
					} else {
						return -1;
					}
				}
			}
		}).collect(Collectors.toList());
	}
	
	private static Map<String, String> cityCEMap() {
		if (cityMap == null) {
			cityMap = Stream.of(new String[][] {
				{"臺北", "TAIPEI"}
				, {"新北", "NEWTAIPEI"}
				, {"桃園", "TAOYUAN"}
				, {"臺中", "TAICHUNG"}
				, {"臺南", "TAINAN"}
				, {"高雄", "KAOHSIUNG"}
				, {"宜蘭", "YILAN"}
				, {"新竹", "HSINCHU"}
				, {"苗栗", "MIAOLI"}
				, {"彰化", "CHANGHUA"}
				, {"南投", "NAUTOU"}
				, {"雲林", "YUNLIN"}
				, {"嘉義", "CHIAYI"}
				, {"屏東", "PINGTUNG"}
				, {"臺東", "TAITUNG"}
				, {"花蓮", "HUALIEN"}
				, {"澎湖", "PENGHU"}
				, {"基隆", "KEELUNG"}
				, {"連江", "LIENCHIANG"}
				, {"金門", "KINMEN"}
			}).collect(Collectors.toMap(data -> data[0], data->data[1]));
		}
		return cityMap;
	}

}
