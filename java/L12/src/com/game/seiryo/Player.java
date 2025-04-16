package com.game.seiryo;

public class Player extends Actor{
	private String type = "玩家";
	public Player(){
		
	}
	public Player(Character character){
		super(character);
	}
	public String toString(){
		return "玩家选择了"+super.toString();
	}
}
