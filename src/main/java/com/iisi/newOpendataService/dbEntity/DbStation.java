package com.iisi.newOpendataService.dbEntity;

public class DbStation {

	private String stno;
	private String stnCname;
	private String stnEName;
	private String altitude;
	private String longitude;
	private String latitude;
	private String county;
	private String address;
	private String historyBeginTime;
	private String stnEndTime;
	private String note;
	private String beforeStno;
	private String afterStno;
	
	public String getStno() {
		return stno;
	}
	public void setStno(String stno) {
		this.stno = stno;
	}
	public String getStnCName() {
		return stnCname;
	}
	public void setStnCname(String stnCname) {
		this.stnCname = stnCname;
	}
	public String getStnEName() {
		return stnEName;
	}
	public void setStnEName(String stnEName) {
		this.stnEName = stnEName;
	}
	public String getAltitude() {
		return altitude;
	}
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String logitude) {
		this.longitude = logitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHistoryBeginTime() {
		return historyBeginTime;
	}
	public void setHistoryBeginTime(String historyBeginTime) {
		this.historyBeginTime = historyBeginTime;
	}
	public String getStnEndTime() {
		return stnEndTime;
	}
	public void setStnEndTime(String stnEndTime) {
		this.stnEndTime = stnEndTime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getBeforeStno() {
		return beforeStno;
	}
	public void setBeforeStno(String beforeStno) {
		this.beforeStno = beforeStno;
	}
	public String getAfterStno() {
		return afterStno;
	}
	public void setAfterStno(String afterStno) {
		this.afterStno = afterStno;
	}
	
	@Override
	public String toString() {
		return "Station [stno=" + stno + ", stnCname=" + stnCname + ", stnEName=" + stnEName + ", altitude=" + altitude
				+ ", logitude=" + longitude + ", latitude=" + latitude + ", county=" + county + ", address=" + address
				+ ", historyBeginTime=" + historyBeginTime + ", stnEndTime=" + stnEndTime + ", note=" + note + ", beforeStno="
				+ beforeStno + ", afterStno=" + afterStno + "]\n";
	}
	
}
