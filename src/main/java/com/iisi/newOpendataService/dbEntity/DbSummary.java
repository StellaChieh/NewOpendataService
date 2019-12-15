package com.iisi.newOpendataService.dbEntity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.iisi.newOpendataService.utility.CwbColumns;

public class DbSummary {
	
	private String stnId;
	private String stnEName;
	private String stnCName;
	
	private String[] stnPreAry = new String[14];
	private String[] tmpMeanAry = new String[14];
	private String[] tmpMaxAry = new String[14];
	private String[] tmpMinAry = new String[14];
	private String[] tmpMaxGE30Ary = new String[14];
	private String[] tmpMeanGE25Ary = new String[14];
	private String[] tmpMinLE10Ary = new String[14];
	private String[] reHuAry = new String[14];
	private String[] cloudAry = new String[14];
	private String[] sunDurAry = new String[14];
	private String[] precpAccumAry = new String[14];
	private String[] precpGE10Ary = new String[14];
	private String[] windSpAry = new String[14];
	
	private Map<CwbColumns, String[]> dataMap = new HashMap<>();
	
	
	public DbSummary() {
		dataMap.put(CwbColumns.StnPres, this.stnPreAry);
		dataMap.put(CwbColumns.Tx, this.tmpMeanAry);
		dataMap.put(CwbColumns.MeanTxMax, this.tmpMaxAry);
		dataMap.put(CwbColumns.MeanTxMin, this.tmpMinAry);
		dataMap.put(CwbColumns.TxMaxGE30Day, this.tmpMaxGE30Ary);
		dataMap.put(CwbColumns.TxGE25Day, this.tmpMeanGE25Ary);
		dataMap.put(CwbColumns.TxMinLE10Day, this.tmpMinLE10Ary);
		dataMap.put(CwbColumns.RH, this.reHuAry);
		dataMap.put(CwbColumns.CAmtMean, this.cloudAry);
		dataMap.put(CwbColumns.SunShine, this.sunDurAry);
		dataMap.put(CwbColumns.Precp, this.precpAccumAry);
		dataMap.put(CwbColumns.PrecpDay, this.precpGE10Ary);
		dataMap.put(CwbColumns.WS, this.windSpAry);
	}

	public String[] getWeatherElementData(CwbColumns type) {
		return dataMap.get(type);
	}
	
	
	public String getStnId() {
		return stnId;
	}

	public void setStnId(String stnId) {
		this.stnId = stnId;
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

	@Override
	public String toString() {
		return "DbSummary [stnId=" + stnId + ", stnEName=" + stnEName + ", stnCName=" + stnCName + ", stnPreAry="
				+ Arrays.toString(stnPreAry) + ", tmpMeanAry=" + Arrays.toString(tmpMeanAry) + ", tmpMaxAry="
				+ Arrays.toString(tmpMaxAry) + ", tmpMinAry=" + Arrays.toString(tmpMinAry) + ", tmpMaxGE30Ary="
				+ Arrays.toString(tmpMaxGE30Ary) + ", tmpMeanGE25Ary=" + Arrays.toString(tmpMeanGE25Ary)
				+ ", tmpMinLE10Ary=" + Arrays.toString(tmpMinLE10Ary) + ", reHuAry=" + Arrays.toString(reHuAry)
				+ ", cloudAry=" + Arrays.toString(cloudAry) + ", sunDurAry=" + Arrays.toString(sunDurAry)
				+ ", precpAccumAry=" + Arrays.toString(precpAccumAry) + ", precpGE10Ary="
				+ Arrays.toString(precpGE10Ary) + ", windSpAry=" + Arrays.toString(windSpAry)
				+ "]\n";
	}	
	
	
}
