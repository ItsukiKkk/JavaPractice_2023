package com.seiryo.edu;

public class Football extends Game{
	protected void play(){
		System.out.println("play football");
		super.play();
	}
	void action(){
		play();
	}
}
