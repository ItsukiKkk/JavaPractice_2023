package com.edu.seiryo.SL;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test19 {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(rightNow.getTime());
		System.out.println("今天是："+today);
		rightNow.add(Calendar.DATE, -1);
		String yesterday = sdf.format(rightNow.getTime());
		System.out.println("昨天是："+yesterday);
	}
}
