package com.seiryo.edu.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
	private String order_id;
	private int quantity;
	private int total_price;
	private String order_status;
	private int userId;
	/*
	 * �õ�id
	 */
	public int getUserId() {
		return userId;
	}
	/*���õõ�id
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/*
	 * �õ�orderid
	 */
	public String getOrder_id() {
		return order_id;
	}
	/*
	 * �õ�order_id
	 */
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	/*
	 * �õ�����
	 */
	public int getQuantity() {
		return quantity;
	}
	/*
	 * ��������
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/*
	 * ���ü۸�
	 */
	public int getTotal_price() {
		return total_price;
	}
	/*
	 * ���ü۸�
	 */
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	/*
	 * �õ�״̬
	 */
	public String getOrder_status() {
		return order_status;
	}
	/*
	 * ����״̬
	 */
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	/*
	 * ������ɶ�����
	 */
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	/*
	 * �вι��췽��
	 */
	public Order( int quantity, int total_price, String order_status,int userId) {
		super();
		String day = sdf.format(date);
		int random = (int) (Math.random()*10000+1000);
		day += String.valueOf(random);
		this.order_id = day;
		this.quantity = quantity;
		this.total_price = total_price;
		this.order_status = order_status;
		this.userId = userId;
	}
	/*
	 * �޲ι��췽��
	 */
	public Order() {
		super();
	}
	/*
	 * �вι��췽��
	 */
	public Order( int quantity, int total_price,
			String order_status) {
		super();
		String day = sdf.format(date);
		int random = (int) (Math.random()*10000+1000);
		day += String.valueOf(random);
		this.order_id = day;
		this.quantity = quantity;
		this.total_price = total_price;
		this.order_status = order_status;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", quantity=" + quantity
				+ ", total_price=" + total_price + ", order_status="
				+ order_status + "]";
	}
}
