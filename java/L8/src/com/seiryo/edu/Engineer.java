package com.seiryo.edu;

public class Engineer extends Employee{
	private String position;
	private int salary;
	public Engineer(String name, int age, String company){
		super(name, age, company);
		System.out.println("����һ�����๹�췽��1");
	}
	public Engineer(String name, int age, String company,String position,int salary){
		super(name, age, company);
		System.out.println("����һ�����๹�췽��2");
		this.position = position;
		this.salary = salary;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
