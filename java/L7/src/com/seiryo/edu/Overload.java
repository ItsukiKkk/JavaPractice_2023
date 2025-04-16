package com.seiryo.edu;

public class Overload {
	private void test(){
		System.out.println("无参方法");
	}
	private void test(String msg){
		System.out.println("重载方法，参数值为"+msg);
	}
	public static void main(String[] args) {
		Overload demo = new Overload();
		demo.test();
		demo.test("你好");
	}
}
