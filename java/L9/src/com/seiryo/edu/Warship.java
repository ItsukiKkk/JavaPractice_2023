package com.seiryo.edu;

public class Warship implements Weapon,Ship {
	String name;
	public Warship(String name){
		this.name = name;
	}
	public void sail(){
		System.out.println(name+"��ãã������ն��");
	}
	public void fire(){
		System.out.println(name+"�����䵼��");
	}
}
