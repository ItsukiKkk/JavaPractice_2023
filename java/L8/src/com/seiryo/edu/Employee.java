package com.seiryo.edu;

public class Employee {
	private String name;
	private int age;
	private String company;
	public Employee(){
		this.company = "�ٶ�";
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
		System.out.println(this.age+"���"+this.name+"��"+this.company+"��˾��ְCEO");
	}
	public Employee(String name, int age, String company){
		System.out.println("ִ�и���Ĺ��췽��");
		this.name = name;
		this.age = age;
		this.company = company;
		
	}
	public void showEmployeeInfo(){
		System.out.println(age+"���"+name+"��"+company+
				"��ְ");
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
