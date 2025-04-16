package com.seiryo.game;
//存入被选择武将数据
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
		return "武将"+getCharacter().getName()+",他的血量是："+getCharacter().getMaxHp()+
				",技能是"+getCharacter().getSkill();
	}
	
}
