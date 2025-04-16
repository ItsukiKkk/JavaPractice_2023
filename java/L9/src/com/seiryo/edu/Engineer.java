package com.seiryo.edu;

public class Engineer extends Employee {
	public Engineer(String name, String id, double pay) {
		super(name, id, pay);
	}
	public void work(){
		System.out.println("工程师的工作");
	}
}
