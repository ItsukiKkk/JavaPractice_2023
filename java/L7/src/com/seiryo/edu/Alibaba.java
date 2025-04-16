package com.seiryo.edu;

public class Alibaba {
	private static String ceoName = "陆兆禧";
	private String subName;
	public Alibaba(String subName){
		this.subName = subName;
	}
	public void info(){
		System.out.println("阿里巴巴CEO是："+ceoName);
		System.out.println(subName+"是阿里巴巴公司");
	}
}
