package com.edu.seiryo.entity;

public class Commodity {
	//��Ʒ���
	private int commodity_Id;
	//��Ʒ����
	private String commodity_name;
	//��Ʒ����
	private String commodity_info;
	//��Ʒ�۸�
	private double commodity_price;
	//��Ʒ���
	private int commodity_number;
	/*
	 * ����id
	 */
	public int getCommodity_Id() {
		return commodity_Id;
	}
	/*
	 * ����id
	 */
	public void setCommodity_Id(int commodity_Id) {
		this.commodity_Id = commodity_Id;
	}
	/*
	 * ��������
	 */
	public String getCommodity_name() {
		return commodity_name;
	}
	/*
	 * ��������
	 */
	public void setCommodity_name(String commodity_name) {
		this.commodity_name = commodity_name;
	}
	/*
	 * ���ؽ���
	 */
	public String getCommodity_info() {
		return commodity_info;
	}
	/*
	 * ���ý���
	 */
	public void setCommodity_info(String commodity_info) {
		this.commodity_info = commodity_info;
	}
	/*
	 * ���ؼ۸�
	 */
	public double getCommodity_price() {
		return commodity_price;
	}
	/*
	 * ���ü۸�
	 */
	public void setCommodity_price(double commodity_price) {
		this.commodity_price = commodity_price;
	}
	/*
	 * ���ؿ��
	 */
	public int getCommodity_number() {
		return commodity_number;
	}
	/*
	 * ���ÿ��
	 */
	public void setCommodity_number(int commodity_number) {
		this.commodity_number = commodity_number;
	}
	/*
	 * �вι��췽��
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
	 * �޲ι��췽��
	 */
	public Commodity() {
		super();
	}
	/*
	 * (non-Javadoc)��дtoString
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Commodity [commodity_Id=" + commodity_Id + ", commodity_name=" + commodity_name + ", commodity_info="
				+ commodity_info + ", commodity_price=" + commodity_price + ", commodity_number=" + commodity_number
				+ "]";
	}
}
