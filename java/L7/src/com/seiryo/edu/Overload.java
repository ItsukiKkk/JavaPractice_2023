package com.seiryo.edu;

public class Overload {
	private void test(){
		System.out.println("�޲η���");
	}
	private void test(String msg){
		System.out.println("���ط���������ֵΪ"+msg);
	}
	public static void main(String[] args) {
		Overload demo = new Overload();
		demo.test();
		demo.test("���");
	}
}
