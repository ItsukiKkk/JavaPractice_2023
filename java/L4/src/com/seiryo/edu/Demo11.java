package com.seiryo.edu;

public class Demo11 {
	public static void main(String[] args) {
		String[][] strArray = new String[2][2];
		strArray = new String[][]{{"�ȶ��Ǵ�","΢��"},{"�ǲ�˹","ƻ��"}};
		for(int i = 0;i<strArray.length; i++){
				System.out.println("��˾��"+strArray[i][1]+"\t��ʼ��:"+strArray[i][0]);
		}
	}
}
