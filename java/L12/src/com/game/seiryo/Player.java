package com.game.seiryo;

public class Player extends Actor{
	private String type = "���";
	public Player(){
		
	}
	public Player(Character character){
		super(character);
	}
	public String toString(){
		return "���ѡ����"+super.toString();
	}
}
