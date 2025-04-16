package com.edu.seiryo;

public class Employee {
	private String name;
	private int age;
	public Employee(String name,int age){
		try{
			if(age<18 || age>60){
				throw new Exception("Ա��������18�굽60��֮��");
			}
			this.name = name;
			this.age = age;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void showEmpInfo(){
		System.out.println("Ա��"+name+"������Ϊ��"+age);
	}
}
