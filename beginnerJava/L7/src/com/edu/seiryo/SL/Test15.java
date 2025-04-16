package com.edu.seiryo.SL;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test15 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("当前时间是："+sdf1.format(date));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("当前时间是："+sdf2.format(date));
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
		System.out.println("当前时间是："+sdf3.format(date));
	}
}
