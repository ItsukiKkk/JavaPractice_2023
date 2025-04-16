package com.seiryo.edu.entity;

public class Menu {
	private int menu_id;
	private String name;
	private String describe;
	private int unit_price;
	public int getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String descrbe) {
		this.describe = descrbe;
	}
	public int getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}
	public Menu(String name, String descrbe, int unit_price) {
		super();
		this.name = name;
		this.describe = descrbe;
		this.unit_price = unit_price;
	}
	public Menu() {
		super();
	}
	public Menu(int menu_id, String name, String describe, int unit_price) {
		super();
		this.menu_id = menu_id;
		this.name = name;
		this.describe = describe;
		this.unit_price = unit_price;
	}
	@Override
	public String toString() {
		return "Menu [menu_id=" + menu_id + ", name=" + name + ", descrbe="
				+ describe + ", unit_price=" + unit_price + "]";
	}
}
