package com.seiryo.edu;

public class MobileAnalysis1 {
	public static void main(String[] args) {
		System.out.println("�����г������ֻ�ռ�������а�");
		System.out.println("=======================");
		double apple = 33.7;
		double samsung = 33.6;
		double lg = 8.6;
		String first,second,third;
		if(apple>samsung){
			if (samsung > lg) {
				first = "ƻ���ֻ�";
				second = "�����ֻ�";
				third = "LG�ֻ�";
			}else{
				if(apple > lg){
					first = "ƻ���ֻ�";
					second = "LG�ֻ�";
					third = "�����ֻ�";
				}else{
					first = "LG�ֻ�";
					second = "ƻ���ֻ�";
					third = "�����ֻ�";
				}
			}
		}else {
			if (apple > lg) {
				first = "�����ֻ�";
				second = "ƻ���ֻ�";
				third = "LG�ֻ�";
			}else{
				if(samsung > lg){
					first = "�����ֻ�";
					second = "LG�ֻ�";
					third = "ƻ���ֻ�";
				}else{
					first = "LG�ֻ�";
					second = "�����ֻ�";
					third = "ƻ���ֻ�";
				}
			}
		}
			System.out.println("ƻ���ֻ������г�"+first+"�����ֻ�ռ����1");
			System.out.println("ƻ���ֻ������г�"+second+"�����ֻ�ռ����2");
			System.out.println("ƻ���ֻ������г�"+third+"�����ֻ�ռ����3");
			
	}
}
