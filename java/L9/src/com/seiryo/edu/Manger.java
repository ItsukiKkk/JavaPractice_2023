package com.seiryo.edu;

public class Manger extends Employee {
	private double bonus;
	public Manger(String name, String id, double pay,double bonus) {
		super(name, id, pay);
		this.bonus = bonus;
	}
	public void work(){
		System.out.println("经理的工作");
	}
}
