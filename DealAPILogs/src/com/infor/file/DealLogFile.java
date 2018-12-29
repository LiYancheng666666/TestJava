package com.infor.file;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class DealLogFile {
	

	
	
	public String getLogs(ReadLogFile obj) {
		String logsContent =obj.ReadLogs();
		System.out.println(logsContent);	
		return logsContent;
		
	}
	
	public String getTimeStamp(ArrayList<String> list) {
		String listValue = null;
		String getTimeStampContent = list.get(0);
		String[] TimeStamp= getTimeStampContent.split("<TimeStamp>");
		String[] TimeStampvalue = new String[2];
		for (int i =0;i< TimeStamp.length;i++) {
			if(TimeStamp[i].contains("</TimeStamp>")) {
				TimeStampvalue = TimeStamp[i].split("</TimeStamp>");
			}
		}
		
		for (String string : TimeStampvalue) {
			if(string.contains("</TimeStamp>")) {
				listValue = string.replace("</TimeStamp>", "");
			}
			
		}
		return listValue;
	}
	
	
	public ArrayList<String> getIDORequestInfo(String str) {
		ArrayList<String> list =new ArrayList<String>();
		String[]  IDORequestInfoContent =str.split("<IDORequestInfo>");
		String[] MidContent1 = new String[10000];
		for (int i =0 ;i <IDORequestInfoContent.length; i++) {
			MidContent1[i] = IDORequestInfoContent[i].replace("</IDORequestInfo>","");
			System.out.println("    MidContent1[i]"+MidContent1[i]);
			list.add(MidContent1[i]);
		}
		return list;
	}

	public static void main(String[] args) {
		ReadLogFile read1 = new ReadLogFile();
		
		DealLogFile dealfile1 = new DealLogFile();
		ArrayList<String> list1 = dealfile1.getIDORequestInfo(read1.ReadLogs());
		
		String listValue = dealfile1.getTimeStamp(list1);
		System.out.println("		listValue1111"+listValue);
//		dealfile1.getLogs(read1);
	}
	

}
