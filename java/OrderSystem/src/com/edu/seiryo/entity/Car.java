package com.edu.seiryo.entity;

public class Car {
	//���ﳵ���
	private int car_Id;
	//���ﳵ��Ʒ���
	private int car_Commodity_Id;
	//���ﳵ��Ʒ����
	private int car_Commodity_number;
	//���ﳵ�û����
	private int car_user_Id;
	//���ﳵÿ����Ʒ�ܼ۸�
	private double totalPrice;
	//��Ʒ����
	private String car_Commodity_Name;
	//���ﳵÿ����Ʒ���۸�
	private double unitPrice;
	/*
	 * ����id
	 */
	public int getCar_Id() {
		return car_Id;
	}
	/*
	 * ����id
	 */
	public void setCar_Id(int car_Id) {
		this.car_Id = car_Id;
	}
	/*
	 * ����Commodityid
	 */
	public int getCar_Commodity_Id() {
		return car_Commodity_Id;
	}
	/*
	 * ����Commodityid
	 */
	public void setCar_Commodity_Id(int car_Commodity_Id) {
		this.car_Commodity_Id = car_Commodity_Id;
	}
	/*
	 * ����Commoditynumber
	 */
	public int getCar_Commodity_number() {
		return car_Commodity_number;
	}
	/*
	 * ����Commoditynumber
	 */
	public void setCar_Commodity_number(int car_Commodity_number) {
		this.car_Commodity_number = car_Commodity_number;
	}
	/*
	 * ����user_Id
	 */
	public int getCar_user_Id() {
		return car_user_Id;
	}
	/*
	 * ����user_Id
	 */
	public void setCar_user_Id(int car_user_Id) {
		this.car_user_Id = car_user_Id;
	}
	/*
	 * �޲εĹ��췽��
	 */
	public Car() {
		super();
	}
	/*
	 * �����ܼ۸�
	 */
	public double getTotalPrice() {
		return totalPrice;
	}
	/*
	 * �����ܼ۸�
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	/*
	 * ������Ʒ����
	 */
	public String getCar_Commodity_Name() {
		return car_Commodity_Name;
	}
	/*
	 * ������Ʒ����
	 */
	public void setCar_Commodity_Name(String car_Commodity_Name) {
		this.car_Commodity_Name = car_Commodity_Name;
	}
	/*
	 * ������Ʒ����
	 */
	public double getUnitPrice() {
		return unitPrice;
	}
	/*
	 * ������Ʒ����
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	/*
	 * �вεĹ��췽��
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
