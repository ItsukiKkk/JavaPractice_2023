package com.edu.seiryo;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateDemo1 {
	public static int getWeekOfYear(String date) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat();
			Calendar calendar = Calendar.getInstance();
			calendar.setFirstDayOfWeek(Calendar.MONDAY);
			calendar.setMinimalDaysInFirstWeek(1);
			calendar.setTime(sdf.parse(date));
			return calendar.get(Calendar.WEEK_OF_YEAR);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] args) throws ParseException {
		System.out.println("2024��4��24����2014��ĵ�"+getWeekOfYear("2024-4-24")+"��");
		String dateString = "2024-04-24";
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2024-04-24");
		calendar.setTime(date);
		
        System.out.println(dateString + " ��һ���еĵ� " + calendar.get(Calendar.DAY_OF_YEAR) + " �졣");
	}
}
