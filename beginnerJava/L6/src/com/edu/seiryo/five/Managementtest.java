package com.edu.seiryo.five;

public class Managementtest {
	public static void main(String[] args) {
		Management ma = new Management("��÷");
		String name = ma.name;
		int number = Management.signal();
		int ban = ma.banji();
		System.out.println(name+" ѧ��:"+number+" �༶"+ban);
		Management ma1 = new Management("xxx");
		String name1 = ma1.name;
		int number1 = Management.signal();
		int ban1 = ma.banji();
		System.out.println(name1+" ѧ��:"+number1+" �༶"+ban1);
	}
}
