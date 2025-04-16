package com.seiryo.edu;

import java.awt.print.Printable;
import java.util.Random;

public class Heros {
	int index;
	String name;
	int hp;
	String skill;
	Random random = new Random();
	public Heros() {
	}
	public Heros(int index, String name, int hp, String skill) {
		super();
		this.index = index;
		this.name = name;
		this.hp = hp;
		this.skill = skill;
	}
	public void getCard(){
		String[][] cards = new String[104][3];
		for(int i = 0; i<cards.length; i++){
			cards[i][0] = String.valueOf(i);
			if(i <= 41){
				cards[i][1] = "É±";
				if(i < 21){
					cards[i][2] = "ºÚÌÒ";
				}else{
					cards[i][2] = "Ã·»¨";
				}
	        }else if(i >= 42 && i <= 83){
	        	cards[i][1] = "ÉÁ";
	        	cards[i][2] = "·½¿é";
	        }else{
	        	cards[i][1] = "ÌÒ";
	        	cards[i][2] = "ºìÌÒ";
	        }
		}
		for (int i = 0; i < 4; i++) {
			int randomNumber = random.nextInt(104);
			System.out.println("[¿¨ÅÆ"+(i+1)+"]:("+cards[randomNumber][2]+") "+cards[randomNumber][1]);
			if (i == 3) {
				System.err.println();
			}
		}
	}
}
