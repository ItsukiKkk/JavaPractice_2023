package com.game.seiryo;

public class ShuGuoCharacter extends Character{
	int emotion;
public int getEmotion() {
		return emotion;
	}
	public void setEmotion(int emotion) {
		this.emotion = emotion;
	}
	//	static ShuGuoCharacter shuGuoCharacter = new ShuGuoCharacter("赵云", 4, "龙胆");
	public ShuGuoCharacter(String name, int maxHp, String skill, int emotion){
		this(name, maxHp, skill);
		this.emotion = emotion;
	}
	public ShuGuoCharacter(String name, int maxHp, String skill){
		super(name, maxHp, skill);
	}
	public void fight(){
		System.out.println("擅长山地地形进行搏杀");
	}
}
