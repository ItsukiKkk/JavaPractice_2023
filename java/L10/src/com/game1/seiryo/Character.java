package com.game1.seiryo;
//存入所有武将共同属性数据
public class Character {
	private int id;
	private String name;
	private int maxHp;
	private String skill;
	private int hp;
	static int count;
	public Character(){
		
	}
	public Character(String name, int maxHp, String skill){
		this.name = name;
		this.maxHp  = maxHp;
		this.skill = skill;
		count++;
		id = count;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void fight(){
		System.out.println("擅长于某种进行搏杀");
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
}
