package com.edu.seiryo.test;

public class Order {
	int a = 1;
	static int b = 1;
	{
		System.out.println("实例变量a="+a);
		System.out.println("代码块执行");
	}
	static{
		System.out.println("静态变量b="+b);
		System.out.println("静态代码块执行");
	}
	Order(){
		System.out.println("构造方法执行");
	}
}
