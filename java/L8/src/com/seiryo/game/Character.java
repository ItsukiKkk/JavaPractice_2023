package com.seiryo.game;

public class Character {
	String name;
	int maxHp;
	String skill;
	public Character(){
		
	}
	public Character(String name, int maxHp, String skill){
		this.name = name;
		this.maxHp  = maxHp;
		this.skill = skill;
	}
	public void fight(){
		System.out.println("擅长于某种进行搏杀");
	}
}
