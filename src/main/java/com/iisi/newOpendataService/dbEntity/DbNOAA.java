package com.iisi.newOpendataService.dbEntity;

import java.time.LocalDateTime;

public class DbNOAA {

	private String stno;
	private String stnCName;
	private String stnEName;
	private LocalDateTime obsTime;
	private String precp;
	private String txMaxAbs;
	private String txMinAbs;
	
	
	@Override
	public String toString() {
		return "DbNOAA [stno=" + stno + ", stnCName=" + stnCName + ", stnEName=" + stnEName + ", obsTime=" + obsTime
				+ ", precp=" + precp + ", txMaxAbs=" + txMaxAbs + ", txMinAbs=" + txMinAbs + "]\n";
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


	public LocalDateTime getObsTime() {
		return obsTime;
	}


	public void setObsTime(LocalDateTime obsTime) {
		this.obsTime = obsTime;
	}


	public String getPrecp() {
		return precp;
	}


	public void setPrecp(String precp) {
		this.precp = precp;
	}


	public String getTxMaxAbs() {
		return txMaxAbs;
	}


	public void setTxMaxAbs(String txMaxAbs) {
		this.txMaxAbs = txMaxAbs;
	}


	public String getTxMinAbs() {
		return txMinAbs;
	}


	public void setTxMinAbs(String txMinAbs) {
		this.txMinAbs = txMinAbs;
	}
	
	
	
}
