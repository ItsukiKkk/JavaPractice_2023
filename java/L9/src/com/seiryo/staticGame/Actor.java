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
		return "武将:"+getCharacter().getName()+",他的血量是"+getCharacter().getMaxHp()+
				",技能是"+getCharacter().getSkill();
	}
	public Character getCharacter() {
		return character;
	}
	public void setCharacter(Character character) {
		this.character = character;
	}

}
