package com.edu.seiryo.SL;

public class Test2 {
	public static void main(String[] args) {
		int a = 100;
		int b = 2;
		String str1 = String.valueOf(a)+String.valueOf(b);
		String str2 = String.valueOf(a).concat(String.valueOf(b));
		System.out.println("第一种连接方式的结果"+str1);
		System.out.println("第二种连接方式的结果"+str2);
	}
}
