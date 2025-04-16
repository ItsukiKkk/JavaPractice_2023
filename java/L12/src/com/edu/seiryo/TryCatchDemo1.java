package com.edu.seiryo;

public class TryCatchDemo1 {
	public static void main(String[] args) {
		String[] appName = {"微信","来往"};
		try{
			System.out.println("应用1："+appName[0]);
			System.out.println("应用3："+appName[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("应用三不存在");
			System.out.println("异常信息："+e);
		}
		System.out.println("应用2："+appName[1]);
	}
}
