package com.edu.seiryo;

public class ThrowsException {
	public static void main(String[] args) throws Exception{
		try{
			showException();
		}catch(Exception e){
			System.out.println("����ֵ��ShowException������\n����main�����в�����쳣\n"+e);
		}
	}
	public static void showException() throws Exception {
		Object x = new Integer(0);
		System.out.println((String)x);
	}
}
