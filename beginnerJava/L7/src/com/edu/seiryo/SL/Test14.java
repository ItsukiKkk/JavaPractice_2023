package com.edu.seiryo.SL;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Test14 {
	public static void main(String[] args) {
		Date da = new Date();
		String formate = "yyyy年MM月dd日    HH时mm分ss秒";
		SimpleDateFormat sdf = new SimpleDateFormat(formate);
		String nowDate = sdf.format(da);
		System.out.println("当前时间是："+nowDate);
	}
}
