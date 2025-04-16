package com.seiryo.edu;

public class MobileAnalysis1 {
	public static void main(String[] args) {
		System.out.println("美国市场智能手机占有率排行榜");
		System.out.println("=======================");
		double apple = 33.7;
		double samsung = 33.6;
		double lg = 8.6;
		String first,second,third;
		if(apple>samsung){
			if (samsung > lg) {
				first = "苹果手机";
				second = "三星手机";
				third = "LG手机";
			}else{
				if(apple > lg){
					first = "苹果手机";
					second = "LG手机";
					third = "三星手机";
				}else{
					first = "LG手机";
					second = "苹果手机";
					third = "三星手机";
				}
			}
		}else {
			if (apple > lg) {
				first = "三星手机";
				second = "苹果手机";
				third = "LG手机";
			}else{
				if(samsung > lg){
					first = "三星手机";
					second = "LG手机";
					third = "苹果手机";
				}else{
					first = "LG手机";
					second = "三星手机";
					third = "苹果手机";
				}
			}
		}
			System.out.println("苹果手机美国市场"+first+"智能手机占有率1");
			System.out.println("苹果手机美国市场"+second+"智能手机占有率2");
			System.out.println("苹果手机美国市场"+third+"智能手机占有率3");
			
	}
}
