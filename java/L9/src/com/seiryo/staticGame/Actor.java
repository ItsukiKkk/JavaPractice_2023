package com.seiryo.staticGame;

public abstract class Actor {
	private Character character;
	Actor(){
		
	}
	Actor(Character character){
		this.character = character;
	}
	@Override
	public String toString() {
		return "�佫:"+getCharacter().getName()+",����Ѫ����"+getCharacter().getMaxHp()+
				",������"+getCharacter().getSkill();
	}
	public Character getCharacter() {
		return character;
	}
	public void setCharacter(Character character) {
		this.character = character;
	}

}
