package com.chapter6.entity;

public class ITcompany1 {
	private String name;
	private int age;
	public void info(){
		System.out.println(name+"已经成立"+age+"年了");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
