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
	 * 得到id
	 */
	public int getUserId() {
		return userId;
	}
	/*设置得到id
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/*
	 * 得到orderid
	 */
	public String getOrder_id() {
		return order_id;
	}
	/*
	 * 得到order_id
	 */
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	/*
	 * 得到数量
	 */
	public int getQuantity() {
		return quantity;
	}
	/*
	 * 设置数量
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/*
	 * 设置价格
	 */
	public int getTotal_price() {
		return total_price;
	}
	/*
	 * 设置价格
	 */
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	/*
	 * 得到状态
	 */
	public String getOrder_status() {
		return order_status;
	}
	/*
	 * 设置状态
	 */
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	/*
	 * 随机生成订单号
	 */
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	/*
	 * 有参构造方法
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
	 * 无参构造方法
	 */
	public Order() {
		super();
	}
	/*
	 * 有参构造方法
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
