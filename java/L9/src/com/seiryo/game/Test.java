package com.seiryo.game;

public class Test {
	public static void main(String[] args) {
		Actor actor = null;
		Character character = null;
		character = new ShuGuoCharacter("����", 4, "����");
		actor = new Player(character);
		System.out.println(actor);
		character.fight();
		character = new WeiGuoCharacter("�ܲ�", 4, "����");
		actor = new PlayerAI(character);
		System.out.println(actor);
		character.fight();
	}
}
