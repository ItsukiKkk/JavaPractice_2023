package com.edu.seiryo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDemo {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
		String day = sdf.format(date);
		System.out.println(day);
		String strDate = "2013-03-22 12:23:23";
		Date date2 = sdf.parse(strDate);
		System.out.println(date2);
	}
}
