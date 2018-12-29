package com.infor.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadLogFile {
	
	
	public  String ReadLogs() {
		String logfilecontent = null;
		Reader reader;
		try {
			reader = new FileReader("D:/Utility/vbsGenerateTool/IDORunTimeLog/scrap.idoreq");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			try {
				
				String line = bufferedReader.readLine();
				StringBuffer buffer = new StringBuffer();
				
				while(line!=null) {
					buffer.append(line + "\r\n");
					line = bufferedReader.readLine();
				}
				
				logfilecontent =buffer.toString();
				bufferedReader.close();
				reader.close();
			} catch (FileNotFoundException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return logfilecontent;
					
	}

}
