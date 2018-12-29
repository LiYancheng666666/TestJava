package com.infor.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteLogsFile {
	
	public void testWriteFile(String text) {
		
		try {
			Writer writerlogs = new FileWriter("D:/Utility/vbsGenerateTool/src/data/testlogs/1.txt", true);
			writerlogs.write(text);
			
			writerlogs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ÎÄ¼þÐ´Èë´íÎó£º"+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		ReadLogFile read1 = new ReadLogFile();
		String text =read1.ReadLogs();
		WriteLogsFile writeLogsFile = new WriteLogsFile();
		writeLogsFile.testWriteFile(text);
	}
}
