package com.seiryo.edu;

public class MyPet {
	private String name;
	private String food;
	public MyPet(String name){
		this.name = name;
	}
	public void eat(String food){
		System.out.println(name+"ϲ����"+food);
	}
	public void eat(int i){
		System.out.println(name+"ÿ���"+i+"�ͷ�");
	}
	public MyPet(String name, String food){
		this.name = name;
		this.food = food;
	}
	public void eat(){
		System.out.println(name+"ϲ����"+food);
	}
}
