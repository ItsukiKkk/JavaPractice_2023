package com.seiryo.entity;

public class Ticket {
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
	 * �вι��췽��
	 */
	public Ticket(String number, int price, int amount) {
		super();
		this.number = number;
		this.price = price;
		this.amount = amount;
	}
	/*
	 * �޲ι��췽��
	 */
	public Ticket() {
		super();
	}
	/*
	 * ��дtoString����
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", number=" + number + ", price=" + price + ", amount=" + amount + "]";
	}
}
