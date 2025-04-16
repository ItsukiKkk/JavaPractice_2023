package com.edu.seiryo.test;

public class Test {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++){
			Monkey houge = new Monkey();
			Monkey.peach = Monkey.peach - 1;
			System.out.println("还有"+ Monkey.peach +"个桃子");
		}
	}
}
