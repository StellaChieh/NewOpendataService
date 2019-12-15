package com.iisi.newOpendataService.dbEntity;

import java.sql.Timestamp;

public class DbMN {

	private Integer year;
	private Integer month;
	private String stno;
	private String stnEName;
	private String stnCName;
	
	private String tx;
	private String txMaxAbs;
	private Timestamp txMaxAbsDate;
	private String txMinAbs;
	private Timestamp txMinAbsDate;
	
	private String precp;
	private String precpGE01Day;
	
	
	private String windSpeedMax;
	private String windSpeedMaxDir;
	private Timestamp windSpeedMaxDate;
	
	private String gustSpeedMax;
	private String gustSpeedMaxDir;
	private Timestamp gustSpeedMaxDate;
	
	private String rh;
	private String rhMin;
	private Timestamp rhMinTime;
	
	private String stnPres;
	
	private String sunShine;

	public Integer getYear() {
		return year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public String getStno() {
		return stno;
	}

	public void setStno(String stno) {
		this.stno = stno;
	}

	public String getStnEName() {
		return stnEName;
	}

	public void setStnEName(String stnEName) {
		this.stnEName = stnEName;
	}

	public String getStnCName() {
		return stnCName;
	}

	public void setStnCName(String stnCName) {
		this.stnCName = stnCName;
	}

	public String getTx() {
		return tx;
	}

	public void setTx(String tx) {
		this.tx = tx;
	}

	public String getTxMaxAbs() {
		return txMaxAbs;
	}

	public void setTxMaxAbs(String txMaxAbs) {
		this.txMaxAbs = txMaxAbs;
	}

	public Timestamp getTxMaxAbsDate() {
		return txMaxAbsDate;
	}

	public void setTxMaxAbsDate(Timestamp txMaxAbsDate) {
		this.txMaxAbsDate = txMaxAbsDate;
	}

	public String getTxMinAbs() {
		return txMinAbs;
	}

	public void setTxMinAbs(String txMinAbs) {
		this.txMinAbs = txMinAbs;
	}

	public Timestamp getTxMinAbsDate() {
		return txMinAbsDate;
	}

	public void setTxMinAbsDate(Timestamp txMinAbsDate) {
		this.txMinAbsDate = txMinAbsDate;
	}

	public String getPrecp() {
		return precp;
	}

	public void setPrecp(String precpAccum) {
		this.precp = precpAccum;
	}

	public String getPrecpGE01Day() {
		return precpGE01Day;
	}

	public void setPrecpGE01Day(String precpGE01Day) {
		this.precpGE01Day = precpGE01Day;
	}

	public String getWindSpeedMax() {
		return windSpeedMax;
	}

	public void setWindSpeedMax(String windSpeedMax) {
		this.windSpeedMax = windSpeedMax;
	}

	public String getWindSpeedMaxDir() {
		return windSpeedMaxDir;
	}

	public void setWindSpeedMaxDir(String windSpeedMaxDir) {
		this.windSpeedMaxDir = windSpeedMaxDir;
	}

	public Timestamp getWindSpeedMaxDate() {
		return windSpeedMaxDate;
	}

	public void setWindSpeedMaxDate(Timestamp windSpeedMaxDate) {
		this.windSpeedMaxDate = windSpeedMaxDate;
	}

	public String getGustSpeedMax() {
		return gustSpeedMax;
	}

	public void setGustSpeedMax(String gustSpeedMax) {
		this.gustSpeedMax = gustSpeedMax;
	}

	public String getGustSpeedMaxDir() {
		return gustSpeedMaxDir;
	}

	public void setGustSpeedMaxDir(String gustSpeedMaxDir) {
		this.gustSpeedMaxDir = gustSpeedMaxDir;
	}

	public Timestamp getGustSpeedMaxDate() {
		return gustSpeedMaxDate;
	}

	public void setGustSpeedMaxDate(Timestamp gustSpeedMaxDate) {
		this.gustSpeedMaxDate = gustSpeedMaxDate;
	}

	public String getRh() {
		return rh;
	}

	public void setRh(String rh) {
		this.rh = rh;
	}

	public String getRhMin() {
		return rhMin;
	}

	public void setRhMin(String rhMin) {
		this.rhMin = rhMin;
	}

	public Timestamp getRhMinTime() {
		return rhMinTime;
	}

	public void setRhMinTime(Timestamp rhMinTime) {
		this.rhMinTime = rhMinTime;
	}

	public String getStnPres() {
		return stnPres;
	}

	public void setStnPres(String stnPres) {
		this.stnPres = stnPres;
	}

	public String getSunShine() {
		return sunShine;
	}

	public void setSunShine(String sunShine) {
		this.sunShine = sunShine;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	
}
