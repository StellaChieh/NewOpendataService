package com.iisi.newOpendataService.dbEntity;

public class DbSummaryRecord {

	private String stno;
	private String stnCName;
	private String stnEName;
	
	private String weatherElement;
	
	private String startYear;
	private String endYear;
	
	
	private String mn1;
	private String mn2;
	private String mn3;
	private String mn4;
	private String mn5;
	private String mn6;
	private String mn7;
	private String mn8;
	private String mn9;
	private String mn10;
	private String mn11;
	private String mn12;
	
	
	public String[] getAllMonthsData() {
		String[] result =  {mn1, mn2, mn3, mn4, mn5, mn6
							, mn7, mn8, mn9, mn10, mn11, mn12};
		return result;
	}

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

	public String getWeatherElement() {
		return weatherElement;
	}

	public void setWeatherElement(String weatherElement) {
		this.weatherElement = weatherElement;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getEndYear() {
		return endYear;
	}

	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}

	public String getMn1() {
		return mn1;
	}

	public void setMn1(String mn1) {
		this.mn1 = mn1;
	}

	public String getMn2() {
		return mn2;
	}

	public void setMn2(String mn2) {
		this.mn2 = mn2;
	}

	public String getMn3() {
		return mn3;
	}

	public void setMn3(String mn3) {
		this.mn3 = mn3;
	}

	public String getMn4() {
		return mn4;
	}

	public void setMn4(String mn4) {
		this.mn4 = mn4;
	}

	public String getMn5() {
		return mn5;
	}

	public void setMn5(String mn5) {
		this.mn5 = mn5;
	}

	public String getMn6() {
		return mn6;
	}

	public void setMn6(String mn6) {
		this.mn6 = mn6;
	}

	public String getMn7() {
		return mn7;
	}

	public void setMn7(String mn7) {
		this.mn7 = mn7;
	}

	public String getMn8() {
		return mn8;
	}

	public void setMn8(String mn8) {
		this.mn8 = mn8;
	}

	public String getMn9() {
		return mn9;
	}

	public void setMn9(String mn9) {
		this.mn9 = mn9;
	}

	public String getMn10() {
		return mn10;
	}

	public void setMn10(String mn10) {
		this.mn10 = mn10;
	}

	public String getMn11() {
		return mn11;
	}

	public void setMn11(String mn11) {
		this.mn11 = mn11;
	}

	public String getMn12() {
		return mn12;
	}

	public void setMn12(String mn12) {
		this.mn12 = mn12;
	}

	@Override
	public String toString() {
		return "DbSummaryRecord [stno=" + stno + ", stnCName=" + stnCName + ", stnEName=" + stnEName
				+ ", weatherElement=" + weatherElement + ", startYear=" + startYear + ", endYear=" + endYear + ", mn1="
				+ mn1 + ", mn2=" + mn2 + ", mn3=" + mn3 + ", mn4=" + mn4 + ", mn5=" + mn5 + ", mn6=" + mn6 + ", mn7="
				+ mn7 + ", mn8=" + mn8 + ", mn9=" + mn9 + ", mn10=" + mn10 + ", mn11=" + mn11 + ", mn12=" + mn12 + "]\n";
	}

	
	
	
}
