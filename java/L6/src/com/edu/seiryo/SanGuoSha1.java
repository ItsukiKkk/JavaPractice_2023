package com.edu.seiryo;

public class SanGuoSha1 {
	public static void main(String[] args) {
		String[][] wujiangArray = new String[6][3];
		wujiangArray[0][0] = "����";
		wujiangArray[0][1] = "4";
		wujiangArray[0][2] = "�ʵ�";
		wujiangArray[1][0] = "����";
		wujiangArray[1][1] = "4";
		wujiangArray[1][2] = "����";
		wujiangArray[2][0] = "�ܲ�";
		wujiangArray[2][1] = "4";
		wujiangArray[2][2] = "����";
		wujiangArray[3][0] = "�ĺ";
		wujiangArray[3][1] = "4";
		wujiangArray[3][2] = "����";
		wujiangArray[4][0] = "��Ȩ";
		wujiangArray[4][1] = "4";
		wujiangArray[4][2] = "�ƺ�";
		wujiangArray[5][0] = "���";
		wujiangArray[5][1] = "3";
		wujiangArray[5][2] = "����";
		Character[] character = new Character[6];
		for(int i = 0; i<wujiangArray.length; i++){
			character[i] = new Character();
			character[i].setName(wujiangArray[i][0]);
			character[i].setSkill(wujiangArray[i][2]);
			character[i].setName(wujiangArray[i][1]);
		}
	}
}
