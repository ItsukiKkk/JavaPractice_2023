package com.edu.seiryo.sj;

public class S1 {
	int dice1,dice2;
	public S1(){
		dice1 = (int) (Math.random() * 6) + 1;
		dice2 = (int) (Math.random() * 6) + 1;
	}
	public void play(){
		System.out.println("第一次扔"+dice1);
		System.out.println("第二次扔"+dice2);
		if(dice1 + dice2 ==7){
			System.out.println("赢");
		}else{
			System.out.println("输");
		}
	}
}
