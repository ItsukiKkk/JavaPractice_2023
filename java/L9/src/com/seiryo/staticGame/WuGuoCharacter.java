package com.seiryo.staticGame;

public class WuGuoCharacter extends Character{
	public WuGuoCharacter (){
		
	}
	public WuGuoCharacter(String name, int maxHp, String skill){
		super(name, maxHp, skill);
	}
	public void fight(){
		System.out.println(getName()+"�ó�ˮ����ν��в�ɱ");
	}
}
