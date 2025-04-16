package com.seiryo.staticGame;

public class ShuGuoCharacter extends Character{
	private int emotion;
	
	public int getEmotion() {
		return emotion;
	}
	public void setEmotion(int emotion) {
		this.emotion = emotion;
	}
	public static ShuGuoCharacter getShuGuoCharacter() {
		return shuGuoCharacter;
	}
	public static void setShuGuoCharacter(ShuGuoCharacter shuGuoCharacter) {
		ShuGuoCharacter.shuGuoCharacter = shuGuoCharacter;
	}
	static ShuGuoCharacter shuGuoCharacter = new ShuGuoCharacter("����", 4, "����");
	public ShuGuoCharacter(String name, int maxHp, String skill, int emotion){
		super(name, maxHp, skill);
		this.emotion = emotion;
	}
	public ShuGuoCharacter(String name, int maxHp, String skill){
		super(name, maxHp, skill);
	}
	public void fight(){
		System.out.println(getName()+"�ó�ɽ�ص��ν��в�ɱ");
	}
	public void showMsg(){
		 super.showMsg();
		 System.out.println(",���꣺"+getEmotion());
	}
}
