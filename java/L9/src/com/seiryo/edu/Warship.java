package com.seiryo.edu;

public class Warship implements Weapon,Ship {
	String name;
	public Warship(String name){
		this.name = name;
	}
	public void sail(){
		System.out.println(name+"在茫茫大海劈破斩浪");
	}
	public void fire(){
		System.out.println(name+"正发射导弹");
	}
}
