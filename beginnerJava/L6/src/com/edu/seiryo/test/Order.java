package com.edu.seiryo.test;

public class Order {
	int a = 1;
	static int b = 1;
	{
		System.out.println("ʵ������a="+a);
		System.out.println("�����ִ��");
	}
	static{
		System.out.println("��̬����b="+b);
		System.out.println("��̬�����ִ��");
	}
	Order(){
		System.out.println("���췽��ִ��");
	}
}
