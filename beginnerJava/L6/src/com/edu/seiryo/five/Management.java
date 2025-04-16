package com.edu.seiryo.five;

public class Management {
	public String name;
	static int number;
	public int ban = 1;
	public Management(String name){
		this.name = name;
	}
	public static int signal(){
		number++;
		return number;
	}
	public int banji(){
		if(number%10 == 0){
			ban++;
		}
		return ban;
	}
}
