package com.edu.seiryo.SL;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test21 {
	public static void main(String[] args) {
		Calendar right = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("今天是："+sdf.format(right.getTime()));
		System.out.println("星期："+right.get(Calendar.DAY_OF_WEEK));
	}
}
