package com.game1.seiryo;

public class ShuGuoCharacter extends Character{
	String emotion;
//	static ShuGuoCharacter shuGuoCharacter = new ShuGuoCharacter("����", 4, "����");
	public ShuGuoCharacter(String name, int maxHp, String skill, String emotion){
		this(name, maxHp, skill);
		this.emotion = emotion;
	}
	public ShuGuoCharacter(String name, int maxHp, String skill){
		super(name, maxHp, skill);
	}
	public void fight(){
		System.out.println("�ó�ɽ�ص��ν��в�ɱ");
	}
}
