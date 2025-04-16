package com.edu.seiryo.five;

public class Managementtest {
	public static void main(String[] args) {
		Management ma = new Management("马冬梅");
		String name = ma.name;
		int number = Management.signal();
		int ban = ma.banji();
		System.out.println(name+" 学号:"+number+" 班级"+ban);
		Management ma1 = new Management("xxx");
		String name1 = ma1.name;
		int number1 = Management.signal();
		int ban1 = ma.banji();
		System.out.println(name1+" 学号:"+number1+" 班级"+ban1);
	}
}
