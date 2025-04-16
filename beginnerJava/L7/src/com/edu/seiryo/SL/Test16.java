package com.edu.seiryo.SL;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test16 {
	public static void main(String[] args) {
		Date da = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:MM:SS");
		System.out.println(sdf1.format(da));
		System.out.println(sdf2.format(da));
	}
}
