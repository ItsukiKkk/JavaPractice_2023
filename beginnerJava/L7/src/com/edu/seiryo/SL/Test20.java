package com.edu.seiryo.SL;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test20 {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.set(2001, 11, 01);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("设置的日期为："+sdf.format(rightNow.getTime()));
	}
}
