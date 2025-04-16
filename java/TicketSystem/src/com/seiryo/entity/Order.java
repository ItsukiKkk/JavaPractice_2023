package com.seiryo.entity;

public class Order {
	/*
	 * id
	 */
	private int id;
	/*
	 * ����
	 */
	private String number;
	/*
	 * Ʊ��
	 */
	private int price;
	/*
	 * ����
	 */
	private int amount;
	/*
	 * ������û���
	 */
	private String userName;
	/*
	 * ��ȡid
	 */
	public int getId() {
		return id;
	}
	/*
	 * ����id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/*
	 * ��ȡ����
	 */
	public String getNumber() {
		return number;
	}
	/*
	 * ���ó���
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/*
	 * ��ȡ�۸�
	 */
	public int getPrice() {
		return price;
	}
	/*
	 * ���ü۸�
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/*
	 * ��ȡ����
	 */
	public int getAmount() {
		return amount;
	}
	/*
	 * ��������
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/*
	 * ��ȡ�û���
	 */
	public String getUserName() {
		return userName;
	}
	/*
	 * �����û���
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/*
	 * �вι��췽��
	 */
	public Order(String number, int price, int amount, String userName) {
		super();
		this.number = number;
		this.price = price;
		this.amount = amount;
		this.userName = userName;
	}
	/*
	 * �޲ι��췽��
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
