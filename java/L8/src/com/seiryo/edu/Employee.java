package com.seiryo.edu;

public class Employee {
	private String name;
	private int age;
	private String company;
	public Employee(){
		this.company = "百度";
	}
	public Employee(String name){
		this();
		this.name = name;
	}
	public Employee(String name, int age){
		this(name);
		this.age = age;
	}
	public void info(){
		System.out.println(this.age+"岁的"+this.name+"在"+this.company+"公司任职CEO");
	}
	public Employee(String name, int age, String company){
		System.out.println("执行父类的构造方法");
		this.name = name;
		this.age = age;
		this.company = company;
		
	}
	public void showEmployeeInfo(){
		System.out.println(age+"岁的"+name+"在"+company+
				"任职");
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}
