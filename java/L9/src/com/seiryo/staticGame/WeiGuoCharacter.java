package com.seiryo.staticGame;

public class WeiGuoCharacter extends Character{
	public WeiGuoCharacter(String name, int maxHp, String skill){
		super(name, maxHp, skill);
	}
	public void fight(){
		System.out.println(getName()+"�ó�ƽԭ���ν��в�ɱ");
	}
	
}
