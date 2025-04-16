package com.edu.seiryo;

public class SanGuoSha1 {
	public static void main(String[] args) {
		String[][] wujiangArray = new String[6][3];
		wujiangArray[0][0] = "¡ı±∏";
		wujiangArray[0][1] = "4";
		wujiangArray[0][2] = "» µ¬";
		wujiangArray[1][0] = "’‘‘∆";
		wujiangArray[1][1] = "4";
		wujiangArray[1][2] = "¡˙µ®";
		wujiangArray[2][0] = "≤‹≤Ÿ";
		wujiangArray[2][1] = "4";
		wujiangArray[2][2] = "ºÈ–€";
		wujiangArray[3][0] = "œƒ∫Óê™";
		wujiangArray[3][1] = "4";
		wujiangArray[3][2] = "∏’¡“";
		wujiangArray[4][0] = "ÀÔ»®";
		wujiangArray[4][1] = "4";
		wujiangArray[4][2] = "÷∆∫‚";
		wujiangArray[5][0] = "÷‹Ë§";
		wujiangArray[5][1] = "3";
		wujiangArray[5][2] = "∑¥º‰";
		Character[] character = new Character[6];
		for(int i = 0; i<wujiangArray.length; i++){
			character[i] = new Character();
			character[i].setName(wujiangArray[i][0]);
			character[i].setSkill(wujiangArray[i][2]);
			character[i].setName(wujiangArray[i][1]);
		}
	}
}
