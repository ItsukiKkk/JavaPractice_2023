package com.edu.seiryo.SL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test17 {
	public static void main(String[] args) {
		String birthday = "1986-04-07";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = sdf.parse(birthday);
			System.out.println("转换成Date类型的时间是："+d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
