package com.seiryo.entity;

public class Order {
	/*
	 * id
	 */
	private int id;
	/*
	 * 车次
	 */
	private String number;
	/*
	 * 票价
	 */
	private int price;
	/*
	 * 数量
	 */
	private int amount;
	/*
	 * 购买的用户名
	 */
	private String userName;
	/*
	 * 获取id
	 */
	public int getId() {
		return id;
	}
	/*
	 * 设置id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/*
	 * 获取车次
	 */
	public String getNumber() {
		return number;
	}
	/*
	 * 设置车次
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/*
	 * 获取价格
	 */
	public int getPrice() {
		return price;
	}
	/*
	 * 设置价格
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/*
	 * 获取数量
	 */
	public int getAmount() {
		return amount;
	}
	/*
	 * 设置数量
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/*
	 * 获取用户名
	 */
	public String getUserName() {
		return userName;
	}
	/*
	 * 设置用户名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/*
	 * 有参构造方法
	 */
	public Order(String number, int price, int amount, String userName) {
		super();
		this.number = number;
		this.price = price;
		this.amount = amount;
		this.userName = userName;
	}
	/*
	 * 无参构造方法
	 */
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", number=" + number + ", price=" + price + ", amount=" + amount + ", userName="
				+ userName + "]";
	}
}
