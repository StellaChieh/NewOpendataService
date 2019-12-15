package com.iisi.newOpendataService.utility;

import java.util.HashMap;
import java.util.Map;

public enum MakeFileServiceType {
	ManualStation, 
	AutoStation, 
	MNReport, 
	Day30Report, 
	DYReport, 
	SummaryReport,
	CODiS,
	Day7HourlyRain,
	ManualNOAACN,
	AutoNOAACN,
	ManualNOAAEN,
	AutoNOAAEN,
	HisDY,
	HisMN;

	private static Map<MakeFileServiceType, String> fileServiceBeanMap = new HashMap<>();

	public static Map<MakeFileServiceType, String> getFileServiceBeanMap() {
		return fileServiceBeanMap;
	}

}
