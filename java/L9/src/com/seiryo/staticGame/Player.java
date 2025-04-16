package com.seiryo.staticGame;

public class Player extends Actor {
	private String type = "Íæ¼Ò";
	public Player(){
		
	}
	public Player(Character character){
		super(character);
	}
	@Override
	public String toString() {
		return "Íæ¼ÒÑ¡Ôñ"+super.toString();
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
