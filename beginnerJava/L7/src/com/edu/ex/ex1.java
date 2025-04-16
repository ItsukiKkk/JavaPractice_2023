package com.edu.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ex1 {
	public static void main(String[] args) throws ParseException {
		String birthday = "1986-04-07";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(birthday);
		System.out.println("转换成Date类型的时间是："+d);
	}
}