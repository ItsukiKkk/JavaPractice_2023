package com.seiryo.edu.entity;

public class OrdersDetail {
	private String order_id;
	private int menu_id;
	private int amount;
	private String name;
	private int unit_price;
	private int total_price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}
	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public int getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public OrdersDetail(String order_id, int menu_id, int amount) {
		super();
		this.order_id = order_id;
		this.menu_id = menu_id;
		this.amount = amount;
	}
	public OrdersDetail() {
		super();
	}
	@Override
	public String toString() {
		return "OrdersDetail [order_id=" + order_id + ", menu_id=" + menu_id
				+ ", amount=" + amount + ", name=" + name + ", unit_price="
				+ unit_price + ", total_price=" + total_price + "]";
	}
}
