package com.seiryo.edu;

public class Development {
	public static void main(String[] args) {
		int teamCount = 10;
		int javaNo = 8;
		for(int i = 0; i<=teamCount; i++){
			if(i == javaNo){
				System.out.println("���Ϊ"+i+"��Ա����ͨJava,����Ҫ��");
				break;
			}
			System.out.println("���Ϊ"+i+"��Ա��������Ҫ��");
		}
	}
}
