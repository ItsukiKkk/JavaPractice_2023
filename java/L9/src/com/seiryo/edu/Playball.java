package com.seiryo.edu;

public class Playball {
	public static void main(String[] args) {
		Game[] game = new Game[10];
		game[0] = new Football();
		game[1] = new Pingpangball();
		game[2] = new Basketball();
		for (int j = 0; j < game.length; j++) {
			if(game[j] != null){
				game[j].play();
			}
		}
	}
}
