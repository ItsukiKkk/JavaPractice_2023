package com.edu.seiryo.test;

public class StaticBlock {
	static{
		System.out.println("��һ����̬�����");
	}
	static{
		System.out.println("�ڶ�����̬�����");
	}
	static void print(){
		System.out.println("��̬�����ھ�̬�����֮��ִ��");
	}
	public static void main(String[] args) {
		StaticBlock st = new StaticBlock();
		StaticBlock.print();
	}
}
