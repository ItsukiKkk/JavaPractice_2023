package com.seiryo.edu;

public class ITCompany {
	private String name;
	private int age;
	public ITCompany(){
		System.out.println("�޲ι��췽��");
	}
	public ITCompany(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void info(){
		System.out.println(name+"��˾��ֹ2014���Ѿ�����"+age+"����");
	}
}
