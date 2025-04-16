package com.seiryo.edu;

public class ITCompany {
	private String name;
	private int age;
	public ITCompany(){
		System.out.println("无参构造方法");
	}
	public ITCompany(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void info(){
		System.out.println(name+"公司截止2014年已经成立"+age+"年了");
	}
}
