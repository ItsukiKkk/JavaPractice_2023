package com.game.seiryo;

public class Test {
	public static void main(String[] args) {
		Initial.cardInit();
		Initial.showCard();
		Character caocao = new Character("�ܲ�",4,"����");
		Actor player = new Player(caocao);
		player.giveCard();
		player.showHandCard();
	}
}
