package com.game.seiryo;

public class Test {
	public static void main(String[] args) {
		Initial.cardInit();
		Initial.showCard();
		Character caocao = new Character("≤‹≤Ÿ",4,"ºÈ–€");
		Actor player = new Player(caocao);
		player.giveCard();
		player.showHandCard();
	}
}
