package com.iisi.newOpendataService.dbEntity;

import java.time.LocalDateTime;

public class DbDay7HourlyRain {

	private String stno;
	private String stnCName;
	private String stnEName;
	private LocalDateTime obsTime;
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
	public String getPrecp() {
		return precp;
	}
	public void setPrecp(String precp) {
		this.precp = precp;
	}
	public LocalDateTime getObsTime() {
		return obsTime;
	}
	public void setObsTime(LocalDateTime obsTime) {
		this.obsTime = obsTime;
	}
	
}
