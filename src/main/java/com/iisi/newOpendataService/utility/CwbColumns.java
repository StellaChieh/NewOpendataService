package com.iisi.newOpendataService.utility;

public enum CwbColumns {

	// 溫度
	Tx ("IF(a.Tx IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1), 'X', a.Tx) AS tx"
			, "tx NOT IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1)"),
	// 最高氣溫
	TxMaxAbs ("IF(a.TxMaxAbs IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1), 'X', a.TxMaxAbs) AS txMaxAbs"
			, "txMaxAbs NOT IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1)"),
	TxMaxAbsTime ("a.TxMaxAbsTime AS TxMaxAbsDate"),
	MeanTxMax ("IF(a.MeanTxMax IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1), 'X', MeanTxMax) AS meanTxMax"
			, "meanTxMax NOT IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1)"),
	
	// 最低氣溫
	TxMinAbs ("IF(a.TxMinAbs IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1), 'X', a.TxMinAbs) AS txMinAbs"
			, "txMinAbs NOT IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1)"),
	TxMinAbsTime ("a.TxMinAbsTime AS TxMinAbsDate"),
	MeanTxMin ("IF(a.MeanTxMin IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1), 'X', a.MeanTxMin) AS meanTxMin"
			, "meanTxMin NOT IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1)"),
	
	// 最高氣溫>=30℃日數
	TxMaxGE30Day ("", "TxMaxGE30Day NOT IN (-9995, -9997)"),
	
	// 氣溫>=25℃日數
	TxGE25Day ("", "TxGE25Day NOT IN (-9995, -9997)"),
	
	// 最低氣溫<=10℃日數
	TxMinLE10Day ("", "TxMinLE10Day NOT IN (-9995, -9997)"),

	// 降水量
	Precp ("IF(IF(a.precp IN (-9.1, -9.5, -9.6, -9.7, -9999.1, -9999.6, -9999.5, -9999.7), 'X', a.precp)=-9.8, 'T', IF(a.precp IN (-9.1, -9.5, -9.6, -9.7, -9999.1, -9999.6, -9999.5, -9999.7), 'X', a.precp)) AS precp"
			, "Precp NOT IN (-9999.5, -9999.7)"),
	
	// 降水量>=0.1mm日數
	PrecpDay ("IF(a.PrecpDay IN (-9995, -9997), 'X', a.PrecpDay) AS precpGE01Day"
			, "PrecpDay NOT IN (-9995, -9997)"),
	
	// 風速
	WS ("IF(a.WS IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1), 'X', a.WS) AS ws"
			, "WS NOT IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1)"),
	// 風向
	WD ("IF(a.WD IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1), 'X', a.WD) AS wd"),
	WSMax ("IF(a.WSMax IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1), 'X', a.WSMax) AS windSpeedMax"),
	WDMax ("IF(a.WDMax IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1), 'X', a.WDMax) AS windSpeedMaxDir"),
	WMaxTime ("WMaxTime AS windSpeedMaxDate"),
	
	// 陣風風速
	WSGust ("IF(a.WSGust IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1), 'X', a.WSGust) AS gustSpeedMax"),
	// 陣風風向
	WDGust ("IF(a.WDGust IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1), 'X', a.WDGust) AS gustSpeedMaxDir"),
	WGustTime ("WGustTime AS gustSpeedMaxDate"),
	
	// 測站氣壓
	StnPres ("IF(a.StnPres IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1), 'X', a.StnPres) AS stnPres"
			, "StnPres NOT IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1)"),
	
	// 相對溼度
	RH ("IF(a.RH IN (-9995, -9997, -9996), 'X', a.RH) AS rh"
			, " RH NOT IN (-9995, -9997, -9996)"),
	RHMin ("IF(a.RHMin IN (-9995, -9997, -9996), 'X', a.RHMin) AS rhMin"),
	RHMinTime ("RHMinTime AS RHMinTime"),

	// 日照時數
	SunShine ("IF (a.SunShine IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1), 'X', a.SunShine) AS sunshine"
			, " SunShine NOT IN(-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1)"),
	
	// 雲量
	CAmtMean ("", "CAmtMean NOT IN (-99.5, -999.5, -9999.5, -99.7, -999.7, -9999.7, -99.6, -999.6, -9999.6, -9999.1)");
	
	private String replaceSpecialNumberString;
	
	// used for summary report
	private String whereNoSpecialNumberString;
	
	CwbColumns(String s){
		this.replaceSpecialNumberString = s;
	}
	
	public String replaceSpecialNumber() {
		return this.replaceSpecialNumberString;
	}
	
	CwbColumns(String s1, String s2){
		this.replaceSpecialNumberString = s1;
		this.whereNoSpecialNumberString = s2;
	}
	
	public String whereNoSpecialNumberClause() {
		return this.whereNoSpecialNumberString;
	}
	
}
