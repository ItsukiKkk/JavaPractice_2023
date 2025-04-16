package com.seiryo.staticGame;

public abstract class Character {
	private String name;
	private int maxHp;
	private String skill;
	public Character(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public Character(String name, int maxHp, String skill){
		this.name = name;
		this.maxHp  = maxHp;
		this.skill = skill;
	}
	public abstract void fight();
	public void showMsg(){
		System.out.print("Îä½«£º"+name+",HP:"+ maxHp +",¼¼ÄÜ£º"+ skill);
	}
}
