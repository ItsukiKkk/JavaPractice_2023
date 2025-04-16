package com.seiryo.edu;

public class Employ {
	public static void main(String[] args) {
		System.out.println("淘宝公司计划招聘10名软件工程师");
		System.out.println("=============================");
		int count = 0;
		while(count < 10){
			count++;
			System.out.println("招聘"+count+"名软件工程师");
		}
		System.out.println("----------------------");
		System.out.println("已完成"+count+"名软件工程师招聘");
	}
}
