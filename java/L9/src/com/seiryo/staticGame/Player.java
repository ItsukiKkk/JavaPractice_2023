package com.seiryo.staticGame;

public class Player extends Actor {
	private String type = "���";
	public Player(){
		
	}
	public Player(Character character){
		super(character);
	}
	@Override
	public String toString() {
		return "���ѡ��"+super.toString();
	}

	@Override
	public Character getCharacter() {
		// TODO Auto-generated method stub
		return super.getCharacter();
	}

	@Override
	public void setCharacter(Character character) {
		// TODO Auto-generated method stub
		super.setCharacter(character);
	}
	
}
