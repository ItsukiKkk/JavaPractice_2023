package com.edu.seiryo.SL;

public class Test5 {
	public static void main(String[] args) {
		String str1 = new String("seiryo");
		String str2 = new String("seiryo");
		if(str1 == str2){
			System.out.println("引用相等");
		}else{
			System.out.println("引用不相等");
		}
		if(str1.equals(str2)){
			System.out.println("值相等");
		}
	}
}
