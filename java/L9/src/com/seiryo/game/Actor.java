package com.seiryo.game;
//���뱻ѡ���佫����
public class Actor {
	private Character character;
	public Actor(){
		
	}
	public Actor(Character character){
		this.character = character;
	}
	public Character getCharacter() {
		return character;
	}
	public void setCharacter(Character character) {
		this.character = character;
	}
	public String toString(){
		return "�佫"+getCharacter().getName()+",����Ѫ���ǣ�"+getCharacter().getMaxHp()+
				",������"+getCharacter().getSkill();
	}
	
}
