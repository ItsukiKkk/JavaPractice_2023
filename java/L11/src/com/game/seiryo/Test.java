package com.game.seiryo;

public class Test {
	public static void main(String[] args) {
		Initial.showWujiang();
		Actor[] actors = Initial.selectWujiang();
		Initial.cardInit();
		for (int i = 0; i < actors.length; i++) {
			actors[i].giveCard();
			actors[i].showHandCard();
		}
		actors[0].fetchCard(2);
		actors[0].showHandCard();
		
	}
}
