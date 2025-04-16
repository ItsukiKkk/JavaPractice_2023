package com.seiryo.edu;

public class Demo11 {
	public static void main(String[] args) {
		String[][] strArray = new String[2][2];
		strArray = new String[][]{{"比尔盖茨","微软"},{"乔布斯","苹果"}};
		for(int i = 0;i<strArray.length; i++){
				System.out.println("公司："+strArray[i][1]+"\t创始人:"+strArray[i][0]);
		}
	}
}
