package com.seiryo.edu;

public abstract class Employee {
	private String name,id;
	private double pay;
	public Employee(String name, String id, double pay) {
		super();
		this.name = name;
		this.id = id;
		this.pay = pay;
	}
	public abstract void work();
}
