package com.iisi.newOpendataService.dbEntity;

import java.time.LocalDateTime;

public class DbCODiS {

	private String stno;
	private String stnCName;
	private String stnEName;
	private LocalDateTime obsTime;
	private String stnPres;
	private String seaPres;
	private String tx;
	private String td;
	private String rh;
	private String ws;
	private String wd;
	private String wsGust;
	private String wdGust;
	private String precp;
	private String precpHour;
	private String sunShine;
	private String globlRad;
	private String visb;
	private String uvi;
	private String cAmtTotal;
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
	public String getStnPres() {
		return stnPres;
	}
	public void setStnPres(String stnPres) {
		this.stnPres = stnPres;
	}
	public String getSeaPres() {
		return seaPres;
	}
	public void setSeaPres(String seaPres) {
		this.seaPres = seaPres;
	}
	public String getTx() {
		return tx;
	}
	public void setTx(String tx) {
		this.tx = tx;
	}
	public String getTd() {
		return td;
	}
	public void setTd(String td) {
		this.td = td;
	}
	public String getRh() {
		return rh;
	}
	public void setRh(String rh) {
		this.rh = rh;
	}
	public String getWs() {
		return ws;
	}
	public void setWs(String ws) {
		this.ws = ws;
	}
	public String getWd() {
		return wd;
	}
	public void setWd(String wd) {
		this.wd = wd;
	}
	public String getWsGust() {
		return wsGust;
	}
	public void setWsGust(String wsGust) {
		this.wsGust = wsGust;
	}
	public String getWdGust() {
		return wdGust;
	}
	public void setWdGust(String wdGust) {
		this.wdGust = wdGust;
	}
	public String getPrecp() {
		return precp;
	}
	public void setPrecp(String precp) {
		this.precp = precp;
	}
	public String getPrecpHour() {
		return precpHour;
	}
	public void setPrecpHour(String precpHour) {
		this.precpHour = precpHour;
	}
	public String getSunShine() {
		return sunShine;
	}
	public void setSunShine(String sunShine) {
		this.sunShine = sunShine;
	}
	public String getGloblRad() {
		return globlRad;
	}
	public void setGloblRad(String globlRad) {
		this.globlRad = globlRad;
	}
	public String getVisb() {
		return visb;
	}
	public void setVisb(String visb) {
		this.visb = visb;
	}
	public String getUvi() {
		return uvi;
	}
	public void setUvi(String uvi) {
		this.uvi = uvi;
	}
	public String getcAmtTotal() {
		return cAmtTotal;
	}
	public void setcAmtTotal(String cAmtTotal) {
		this.cAmtTotal = cAmtTotal;
	}
	@Override
	public String toString() {
		return "DbCODiS [stno=" + stno + ", stnCName=" + stnCName + ", stnEName=" + stnEName + ", obsTime=" + obsTime
				+ ", stnPres=" + stnPres + ", seaPres=" + seaPres + ", tx=" + tx + ", td=" + td + ", rh=" + rh + ", ws="
				+ ws + ", wd=" + wd + ", wsGust=" + wsGust + ", wdGust=" + wdGust + ", precp=" + precp + ", precpHour="
				+ precpHour + ", sunShine=" + sunShine + ", globlRad=" + globlRad + ", visb=" + visb + ", uvi=" + uvi
				+ ", cAmtTotal=" + cAmtTotal + "]\n";
	}
	
	
		
}
