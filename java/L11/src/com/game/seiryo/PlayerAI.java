package com.game.seiryo;

public class PlayerAI extends Actor{
	private String type = "对手";
	public PlayerAI(Character character){
		super(character);
	}
	public String toString(){
		return "对手选择了"+super.toString();
	}
}
