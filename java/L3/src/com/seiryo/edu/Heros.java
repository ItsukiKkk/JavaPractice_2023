package com.seiryo.edu;

import java.awt.print.Printable;

public class Heros {
	int index;
	String name;
	int hp;
	String skill;
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
		for(int i = 0; i<4; i++){
			System.out.print("[¿¨ÅÆ"+(i+1)+"]\t");
			if(i == 4){
				System.out.println();
			}
		}
	}
}
