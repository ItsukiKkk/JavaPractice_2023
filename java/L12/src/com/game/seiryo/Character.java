package com.game.seiryo;
//���������佫��ͬ��������
public class Character {
	private String name;
	private int maxHp;
	private String skill;
	public Character(){
		
	}
	public Character(String name, int maxHp, String skill){
		this.name = name;
		this.maxHp  = maxHp;
		this.skill = skill;
	}
	public void fight(){
		System.out.println("�ó���ĳ�ֽ��в�ɱ");
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
