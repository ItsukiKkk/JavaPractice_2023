package com.seiryo.game;

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
