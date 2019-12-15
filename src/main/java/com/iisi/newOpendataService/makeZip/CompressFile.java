package com.iisi.newOpendataService.makeZip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompressFile {

	private static Logger logger= LoggerFactory.getLogger(CompressFile.class);
	
	public static void makeFile(File sourceFolder, File zipFile) throws IOException {
		logger.info("Start to compress: source:" + sourceFolder.toString() + ", zipFile: " + zipFile.toString());
		InputStream input = null;
		ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));

		if (sourceFolder.isDirectory()) {
			File[] files = sourceFolder.listFiles();
			for (int i = 0; i < files.length; ++i) {
				logger.info("Compress " + files[i].toString());;
				input = new FileInputStream(files[i]);
				zipOut.putNextEntry(new ZipEntry(files[i].getName()));
				int temp = 0;
				while ((temp = input.read()) != -1) {
					zipOut.write(temp);
				}
				input.close();
			}
		}
		zipOut.close();
	}
}