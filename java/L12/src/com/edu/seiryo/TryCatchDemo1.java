package com.edu.seiryo;

public class TryCatchDemo1 {
	public static void main(String[] args) {
		String[] appName = {"΢��","����"};
		try{
			System.out.println("Ӧ��1��"+appName[0]);
			System.out.println("Ӧ��3��"+appName[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("Ӧ����������");
			System.out.println("�쳣��Ϣ��"+e);
		}
		System.out.println("Ӧ��2��"+appName[1]);
	}
}
