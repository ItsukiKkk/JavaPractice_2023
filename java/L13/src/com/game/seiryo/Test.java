package com.game.seiryo;

public class Test {
	public static void main(String[] args) {
		String string = "����-4-�ʵ�-98,����-4-����-85,�ܲ�-4-����,�ĺ-4-����";
		new Initial().convertToGeneral(string);
		String str = "����,����,�ܲ�,�ĺ";
		new Initial().splitAll(str, ",");
	}
}
