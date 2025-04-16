package com.game1.seiryo;

public class WeiGuoCharacter extends Character{
	public WeiGuoCharacter(String name, int maxHp, String skill){
		super(name, maxHp, skill);
	}
	public void fight(){
		System.out.println("擅长平原地形进行搏杀");
	}
}
