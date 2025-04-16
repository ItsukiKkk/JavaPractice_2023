package com.seiryo.edu;

public class Alibaba1 {
	private static String ceoName = "陆兆禧";
	private String subName;
	public Alibaba1(String subName){
		this.subName = subName;
	}
	public static void ceo(){
		System.out.println("阿里巴巴的CEO是"+ceoName);
	}
	public void info(){
		System.out.println("阿里巴巴CEO是："+ceoName);
		System.out.println(subName+"是阿里巴巴公司");
	}
}
