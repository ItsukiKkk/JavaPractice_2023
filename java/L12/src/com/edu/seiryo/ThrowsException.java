package com.edu.seiryo;

public class ThrowsException {
	public static void main(String[] args) throws Exception{
		try{
			showException();
		}catch(Exception e){
			System.out.println("这是值再ShowException中声明\n并在main方法中不活的异常\n"+e);
		}
	}
	public static void showException() throws Exception {
		Object x = new Integer(0);
		System.out.println((String)x);
	}
}
