package com.edu.seiryo.SL;

public class Test2 {
	public static void main(String[] args) {
		int a = 100;
		int b = 2;
		String str1 = String.valueOf(a)+String.valueOf(b);
		String str2 = String.valueOf(a).concat(String.valueOf(b));
		System.out.println("��һ�����ӷ�ʽ�Ľ��"+str1);
		System.out.println("�ڶ������ӷ�ʽ�Ľ��"+str2);
	}
}
