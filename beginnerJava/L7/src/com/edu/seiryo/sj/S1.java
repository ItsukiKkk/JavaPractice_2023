package com.edu.seiryo.sj;

public class S1 {
	int dice1,dice2;
	public S1(){
		dice1 = (int) (Math.random() * 6) + 1;
		dice2 = (int) (Math.random() * 6) + 1;
	}
	public void play(){
		System.out.println("��һ����"+dice1);
		System.out.println("�ڶ�����"+dice2);
		if(dice1 + dice2 ==7){
			System.out.println("Ӯ");
		}else{
			System.out.println("��");
		}
	}
}
