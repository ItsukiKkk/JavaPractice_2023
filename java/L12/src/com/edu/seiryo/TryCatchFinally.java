package com.edu.seiryo;

public class TryCatchFinally {
	public static void main(String[] args) {
		String[] appName = {"΢��","����"};
		try{
			for (int i = 0; i <= appName.length; i++) {
				System.out.println("Ӧ��"+(i+1)+":"+appName[i]);
			}
		}catch(IndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("�쳣��Ϣ��"+e);
		}finally{
			System.out.println("�����Ƿ��쳣����ִ��finally");
		}
	}
}
