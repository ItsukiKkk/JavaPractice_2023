package com.edu.seiryo.server;

public class A {
	static int a;
	static {
		a = 10;
		System.out.println("静态变量a="+a);
	}
	public static void printStatic(int b){
		a = b;
		System.out.println("静态变量a="+a);
	}
}
