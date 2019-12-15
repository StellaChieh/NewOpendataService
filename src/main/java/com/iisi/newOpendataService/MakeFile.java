package com.iisi.newOpendataService;

public interface MakeFile {

	public String timeSplitter = "/";
	
	public void setParameters(String... args) throws Exception;

	public void run() throws Exception;
}
