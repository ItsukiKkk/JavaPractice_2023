package com.edu.seiryo.entity;

public class Car {
	//购物车编号
	private int car_Id;
	//购物车商品编号
	private int car_Commodity_Id;
	//购物车商品数量
	private int car_Commodity_number;
	//购物车用户编号
	private int car_user_Id;
	//购物车每种商品总价格
	private double totalPrice;
	//商品名称
	private String car_Commodity_Name;
	//购物车每种商品单价格
	private double unitPrice;
	/*
	 * 返回id
	 */
	public int getCar_Id() {
		return car_Id;
	}
	/*
	 * 设置id
	 */
	public void setCar_Id(int car_Id) {
		this.car_Id = car_Id;
	}
	/*
	 * 返回Commodityid
	 */
	public int getCar_Commodity_Id() {
		return car_Commodity_Id;
	}
	/*
	 * 设置Commodityid
	 */
	public void setCar_Commodity_Id(int car_Commodity_Id) {
		this.car_Commodity_Id = car_Commodity_Id;
	}
	/*
	 * 返回Commoditynumber
	 */
	public int getCar_Commodity_number() {
		return car_Commodity_number;
	}
	/*
	 * 设置Commoditynumber
	 */
	public void setCar_Commodity_number(int car_Commodity_number) {
		this.car_Commodity_number = car_Commodity_number;
	}
	/*
	 * 返回user_Id
	 */
	public int getCar_user_Id() {
		return car_user_Id;
	}
	/*
	 * 设置user_Id
	 */
	public void setCar_user_Id(int car_user_Id) {
		this.car_user_Id = car_user_Id;
	}
	/*
	 * 无参的构造方法
	 */
	public Car() {
		super();
	}
	/*
	 * 返回总价格
	 */
	public double getTotalPrice() {
		return totalPrice;
	}
	/*
	 * 设置总价格
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	/*
	 * 返回商品名称
	 */
	public String getCar_Commodity_Name() {
		return car_Commodity_Name;
	}
	/*
	 * 设置商品名称
	 */
	public void setCar_Commodity_Name(String car_Commodity_Name) {
		this.car_Commodity_Name = car_Commodity_Name;
	}
	/*
	 * 返回商品单价
	 */
	public double getUnitPrice() {
		return unitPrice;
	}
	/*
	 * 设置商品单价
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	/*
	 * 有参的构造方法
	 */
	public Car(int car_Id, int car_Commodity_Id, int car_Commodity_number, int car_user_Id, double totalPrice,
			String car_Commodity_Name) {
		super();
		this.car_Id = car_Id;
		this.car_Commodity_Id = car_Commodity_Id;
		this.car_Commodity_number = car_Commodity_number;
		this.car_user_Id = car_user_Id;
		this.totalPrice = totalPrice;
		this.car_Commodity_Name = car_Commodity_Name;
	}
	@Override
	public String toString() {
		return "Car [car_Id=" + car_Id + ", car_Commodity_Id=" + car_Commodity_Id + ", car_Commodity_number="
				+ car_Commodity_number + ", car_user_Id=" + car_user_Id + ", totalPrice=" + totalPrice
				+ ", car_Commodity_Name=" + car_Commodity_Name + "]";
	}
	
}
