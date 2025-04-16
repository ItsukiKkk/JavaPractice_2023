package com.edu.seiryo.server;

public class B {
	static int a,b;
	static{
		a = 1;
		b = 1;	
		System.out.println("静态代码块被执行");
	}
	public static void print(){
		System.out.println("a+b="+(a+b)+" 构造方法被执行");
	}
}
