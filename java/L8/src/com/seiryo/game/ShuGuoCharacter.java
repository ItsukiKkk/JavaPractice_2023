package com.seiryo.game;

public class ShuGuoCharacter extends Character{
	String emotion;
	public ShuGuoCharacter(String name, int maxHp, String skill, String emotion){
		this(name, maxHp, skill);
		this.emotion = emotion;
	}
	public ShuGuoCharacter(String name, int maxHp, String skill){
		super(name, maxHp, skill);
	}
	public void fight(){
		System.out.println("擅长山地地形进行搏杀");
	}
}
