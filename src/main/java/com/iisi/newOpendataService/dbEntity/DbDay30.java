package com.iisi.newOpendataService.dbEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class DbDay30 {

	private String stno;
	private String stnEName;
	private String stnCName;
	private LocalDate obsTimeDate;

	/**
	 * 當日最高氣溫
	 */
	private String txMaxAbs;

	/**
	 * 當日最低氣溫
	 */
	private String txMinAbs;

	/**
	 * 當日平均氣溫
	 */
	private String tx;

	private Map<LocalDateTime, OneHourData> hourlyDatas = new TreeMap<>();

	static public class OneHourData {

		private String stno;

		/**
		 * 觀測時間
		 */
		private LocalDateTime obsTime;

		/**
		 * 測站氣壓
		 */
		private String stnPres;

		/**
		 * 溫度
		 */
		private String tx;

		/**
		 * 相對溼度
		 */
		private String rh;

		/**
		 * 風速
		 */
		private String ws;

		/**
		 * 風向
		 */
		private String wd;

		/**
		 * 風向中文
		 */
		private String wdC;

		/**
		 * 風向英文
		 */
		private String wdE;

		/**
		 * 降水量
		 */
		private String precp;

		/**
		 * 日照時數
		 */
		private String sunshine;

		/////////////
		public LocalDateTime getObsTime() {
			return obsTime;
		}

		public void setObsTime(LocalDateTime time) {
			this.obsTime = time;
		}

		public String getStnPres() {
			return stnPres;
		}

		public void setStnPres(String stnPres) {
			this.stnPres = stnPres;
		}

		public String getTx() {
			return tx;
		}

		public void setTx(String tx) {
			this.tx = tx;
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

		public String getWdC() {
			setWdCAndWdE();
			return wdC;
		}

		public String getWdE() {
			setWdCAndWdE();
			return wdE;
		}

		boolean isNumeric(String number) {
			try {
				Double.parseDouble(number);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}

		private void setWdCAndWdE() {
			if (this.wd == null ||
					// check if number
					!isNumeric(wd)) {
				wdC = "X";
				wdE = "X";
			} else {
				if (this.wdC != null && this.wdE != null) {
					return;
				} else {
					switch (wd) {
					case "0.0":
						wdC = "靜風";
						wdE = "Calm";
						break;
					case "20.0":
					case "30.0":
						wdC = "北北東";
						wdE = "NNE";
						break;
					case "40.0":
					case "50.0":
						wdC = "東北";
						wdE = "NE";
						break;
					case "60.0":
					case "70.0":
						wdC = "東北東";
						wdE = "ENE";
						break;
					case "80.0":
					case "90.0":
					case "100.0":
						wdC = "東";
						wdE = "E";
						break;
					case "110.0":
					case "120.0":
						wdC = "東南東";
						wdE = "ESE";
						break;
					case "130.0":
					case "140.0":
						wdC = "東南";
						wdE = "SE";
						break;
					case "150.0":
					case "160.0":
						wdC = "南南東";
						wdE = "SSE";
						break;
					case "170.0":
					case "180.0":
					case "190.0":
						wdC = "東";
						wdE = "SE";
						break;
					case "200.0":
					case "210.0":
						wdC = "南南西";
						wdE = "SSW";
						break;
					case "220.0":
					case "230.0":
						wdC = "西南";
						wdE = "SW";
						break;
					case "240.0":
					case "250.0":
						wdC = "西南西";
						wdE = "WSW";
						break;
					case "260.0":
					case "270.0":
					case "280.0":
						wdC = "西";
						wdE = "W";
						break;
					case "290.0":
					case "300.0":
						wdC = "西北西";
						wdE = "WNW";
						break;
					case "310.0":
					case "320.0":
						wdC = "西北";
						wdE = "NW";
						break;
					case "330.0":
					case "340.0":
						wdC = "北北西";
						wdE = "NNW";
						break;
					case "350.0":
					case "360.0":
					case "10.0":
						wdC = "北";
						wdE = "N";
						break;
					case "999.9":
						wdC = "風向不定";
						wdE = "Variable";
						break;
					default:
						wdC = "X";
						wdE = "X";
					}
				}
			}
		}

		public String getPrecp() {
			return precp;
		}

		public void setPrecp(String precp) {
			this.precp = precp;
		}

		public String getSunshine() {
			if (sunshine == null) {
				return "";
			} 
			return sunshine;
		}

		public void setSunshine(String sunshine) {
			this.sunshine = sunshine;
		}

		public String getWd() {
			return wd;
		}

		public void setWd(String wd) {
			this.wd = wd;
		}

		public String getStno() {
			return stno;
		}

		public void setStno(String stno) {
			this.stno = stno;
		}

		@Override
		public String toString() {
			return "OneHourData [stno=" + stno + ", obsTime=" + obsTime + ", stnPres=" + stnPres + ", tx=" + tx
					+ ", rh=" + rh + ", ws=" + ws + ", wd=" + wd + ", precp=" + precp + ", sunDuration=" + sunshine
					+ "]\n";
		}

	}

	@Override
	public String toString() {

		List<OneHourData> datas = hourlyDatas.values().stream().collect(Collectors.toList());

		StringBuilder builder = new StringBuilder();
		builder.append(stno).append(", ").append(stnEName).append(", ").append(stnCName).append(", ")
				.append(obsTimeDate).append(", 當日最高溫度 ").append(txMaxAbs).append(", 當日最低溫度 ").append(txMinAbs)
				.append(", 當日平均溫度 ").append(tx).append("\n").append(datas).append("\n\n");

		return builder.toString();

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

	public LocalDate getObsTimeDate() {
		return obsTimeDate;
	}

	public void setObsTimeDate(LocalDate date) {
		this.obsTimeDate = date;
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

	public String getTx() {
		return tx;
	}

	public void setTx(String tx) {
		this.tx = tx;
	}

	public void addHourlyData(LocalDateTime time, OneHourData data) {
		this.hourlyDatas.put(time, data);
	}

	public Map<LocalDateTime, OneHourData> getHourlyDatas() {
		return hourlyDatas;
	}

	public void setHourlyDatas(Map<LocalDateTime, OneHourData> hourlyDatas) {
		this.hourlyDatas = hourlyDatas;
	}
}
