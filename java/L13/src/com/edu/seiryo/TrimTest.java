package com.edu.seiryo;

public class TrimTest {
	public static void main(String[] args) {
		String string = "      雷军       ";
		System.out.println("去空格前字符串为");
		System.out.println(string);
		System.out.println("去空格后字符串为");
		System.out.println(new TrimDome().getTrim(string));
	}
}
