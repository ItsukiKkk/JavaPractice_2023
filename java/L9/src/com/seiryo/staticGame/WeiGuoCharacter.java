package com.seiryo.staticGame;

public class WeiGuoCharacter extends Character{
	public WeiGuoCharacter(String name, int maxHp, String skill){
		super(name, maxHp, skill);
	}
	public void fight(){
		System.out.println(getName()+"擅长平原地形进行搏杀");
	}
	
}
