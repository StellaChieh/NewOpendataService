package com.iisi.newOpendataService.dbEntity;

import java.time.LocalDate;

public class DbDY {

	private String stno;
	private String stnCName;
	private String stnEName;
	private int year;
	
	private String[] total = new String[12]; // 12 months
	
	private String[][] data = new String[31][12]; // 31 days, 12 months
		
	public static class DbOneRecord {
		private String stno;
		private String stnCName;
		private String stnEName;
		private LocalDate obstime;
		private String precp;
		public String getStno() {
			return stno;
		}
		public void setStno(String stno) {
			this.stno = stno;
		}
		public String getStnCName() {
			return stnCName;
		}
		public void setStnCName(String stnCName) {
			this.stnCName = stnCName;
		}
		public String getStnEName() {
			return stnEName;
		}
		public void setStnEName(String stnEName) {
			this.stnEName = stnEName;
		}

		public LocalDate getObstime() {
			return obstime;
		}
		public void setObstime(LocalDate obstime) {
			this.obstime = obstime;
		}
		public String getPrecp() {
			return precp;
		}
		public void setPrecp(String precp) {
			this.precp = precp;
		}
		
	};
	
	
	
	public String getStno() {
		return stno;
	}
	public void setStno(String stno) {
		this.stno = stno;
	}
	public String getStnCName() {
		return stnCName;
	}
	public void setStnCName(String stnCName) {
		this.stnCName = stnCName;
	}
	public String getStnEName() {
		return stnEName;
	}
	public void setStnEName(String stnEName) {
		this.stnEName = stnEName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String[] getTotal() {
		return total;
	}
	public void setTotal(String[] total) {
		this.total = total;
	}
	public String[][] getData() {
		return data;
	}
	public void setData(String[][] data) {
		this.data = data;
	}
	
}
