package com.edu.seiryo.SL;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test21 {
	public static void main(String[] args) {
		Calendar right = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("�����ǣ�"+sdf.format(right.getTime()));
		System.out.println("���ڣ�"+right.get(Calendar.DAY_OF_WEEK));
	}
}
