package com.edu.seiryo.SL;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Test14 {
	public static void main(String[] args) {
		Date da = new Date();
		String formate = "yyyy��MM��dd��    HHʱmm��ss��";
		SimpleDateFormat sdf = new SimpleDateFormat(formate);
		String nowDate = sdf.format(da);
		System.out.println("��ǰʱ���ǣ�"+nowDate);
	}
}
