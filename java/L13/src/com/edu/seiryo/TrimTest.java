package com.edu.seiryo;

public class TrimTest {
	public static void main(String[] args) {
		String string = "      �׾�       ";
		System.out.println("ȥ�ո�ǰ�ַ���Ϊ");
		System.out.println(string);
		System.out.println("ȥ�ո���ַ���Ϊ");
		System.out.println(new TrimDome().getTrim(string));
	}
}
