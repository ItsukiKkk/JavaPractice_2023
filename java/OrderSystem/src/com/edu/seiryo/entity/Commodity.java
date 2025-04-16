package com.edu.seiryo.entity;

public class Commodity {
	//商品编号
	private int commodity_Id;
	//商品名字
	private String commodity_name;
	//商品介绍
	private String commodity_info;
	//商品价格
	private double commodity_price;
	//商品库存
	private int commodity_number;
	/*
	 * 返回id
	 */
	public int getCommodity_Id() {
		return commodity_Id;
	}
	/*
	 * 设置id
	 */
	public void setCommodity_Id(int commodity_Id) {
		this.commodity_Id = commodity_Id;
	}
	/*
	 * 返回名称
	 */
	public String getCommodity_name() {
		return commodity_name;
	}
	/*
	 * 设置名称
	 */
	public void setCommodity_name(String commodity_name) {
		this.commodity_name = commodity_name;
	}
	/*
	 * 返回介绍
	 */
	public String getCommodity_info() {
		return commodity_info;
	}
	/*
	 * 设置介绍
	 */
	public void setCommodity_info(String commodity_info) {
		this.commodity_info = commodity_info;
	}
	/*
	 * 返回价格
	 */
	public double getCommodity_price() {
		return commodity_price;
	}
	/*
	 * 设置价格
	 */
	public void setCommodity_price(double commodity_price) {
		this.commodity_price = commodity_price;
	}
	/*
	 * 返回库存
	 */
	public int getCommodity_number() {
		return commodity_number;
	}
	/*
	 * 设置库存
	 */
	public void setCommodity_number(int commodity_number) {
		this.commodity_number = commodity_number;
	}
	/*
	 * 有参构造方法
	 */
	public Commodity(int commodity_Id, String commodity_name, String commodity_info, double commodity_price,
			int commodity_number) {
		super();
		this.commodity_Id = commodity_Id;
		this.commodity_name = commodity_name;
		this.commodity_info = commodity_info;
		this.commodity_price = commodity_price;
		this.commodity_number = commodity_number;
	}
	/*
	 * 无参构造方法
	 */
	public Commodity() {
		super();
	}
	/*
	 * (non-Javadoc)重写toString
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Commodity [commodity_Id=" + commodity_Id + ", commodity_name=" + commodity_name + ", commodity_info="
				+ commodity_info + ", commodity_price=" + commodity_price + ", commodity_number=" + commodity_number
				+ "]";
	}
}
