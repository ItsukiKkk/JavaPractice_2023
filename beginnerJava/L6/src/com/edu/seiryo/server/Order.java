package com.edu.seiryo.server;

public class Order {
	public static int a;
	static{
		System.out.println("这是静态代码块");
	}
	public static void method(){
		System.out.println("这是静态方法");
	}
	public Order(){
		System.out.println("这是构造方法");
	}
	public void pr(){
		System.out.println("这是非静态方法");
	}
}
