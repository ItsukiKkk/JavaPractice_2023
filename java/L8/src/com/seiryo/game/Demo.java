package com.seiryo.game;

public class Demo {
	public static void main(String[] args) {
		WeiGuoCharacter weiGuoCharacter = new WeiGuoCharacter("�ܲ�", 4, "����");
		ShuGuoCharacter shuGuoCharacter = new ShuGuoCharacter("����", 4, "����");
		WuGuoCharacter wuGuoCharacter = new WuGuoCharacter("���", 3, "����");
		System.out.println(wuGuoCharacter.name);
	}
}
