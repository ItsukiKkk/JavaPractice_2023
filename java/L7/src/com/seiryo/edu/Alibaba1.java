package com.seiryo.edu;

public class Alibaba1 {
	private static String ceoName = "½����";
	private String subName;
	public Alibaba1(String subName){
		this.subName = subName;
	}
	public static void ceo(){
		System.out.println("����Ͱ͵�CEO��"+ceoName);
	}
	public void info(){
		System.out.println("����Ͱ�CEO�ǣ�"+ceoName);
		System.out.println(subName+"�ǰ���Ͱ͹�˾");
	}
}
