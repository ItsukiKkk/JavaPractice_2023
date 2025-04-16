package com.edu.seiryo;

public class TryCatchFinally {
	public static void main(String[] args) {
		String[] appName = {"微信","来往"};
		try{
			for (int i = 0; i <= appName.length; i++) {
				System.out.println("应用"+(i+1)+":"+appName[i]);
			}
		}catch(IndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("异常信息："+e);
		}finally{
			System.out.println("无论是否异常都会执行finally");
		}
	}
}
