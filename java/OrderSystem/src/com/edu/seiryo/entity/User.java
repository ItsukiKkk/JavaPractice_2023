package com.edu.seiryo.entity;

public class User {
	//�û����
	private int user_Id;
	//�û��˺�
	private String user_Name;
	//�û�����
	private String user_pwd;
	//�ֻ�����
	private String user_phone;
	//�û����
	private double user_Money;
	//ע������
	private String user_Date;
	//��Ա״̬
	private int user_vip;
	
	/**
	 * �����û�id
	 * @return user_Id
	 */
	public int getUser_Id() {
		return user_Id;
	}
	/**
	 * �����û�id
	 * @param userName
	 */
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	/**
	 * �����û���
	 * @return user_Name
	 */
	public String getUser_Name() {
		return user_Name;
	}
	/**
	 * �����û���
	 * @param user_Name
	 */
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	/**
	 * �����û�����
	 * @return user_pwd
	 */
	public String getUser_pwd() {
		return user_pwd;
	}
	/**
	 * �����û�����
	 * @param user_pwd
	 */
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	/*
	 * �����û��ֻ���
	 * @return user_pwd
	 */
	public String getUser_phone() {
		return user_phone;
	}
	/**
	 * �����û��ֻ���
	 * @param user_phone
	 */
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	/*
	 * �����û��ʺ�ʣ����
	 * @return user_Money
	 */
	public double getUser_Money() {
		return user_Money;
	}
	/**
	 * �����û��ʺ�ʣ����
	 * @param user_Money
	 */
	public void setUser_Money(double user_Money) {
		this.user_Money = user_Money;
	}
	/**
	 * �����û��ʺ�ע������
	 * @return user_Date
	 */
	public String getUser_Date() {
		return user_Date;
	}
	/*
	 * �����û��ʺ�ע������
	 * @param user_Date
	 */
	public void setUser_Date(String user_Date) {
		this.user_Date = user_Date;
	}
	/**
	 * �����û��ʺ�ע������
	 * @return user_vip
	 */
	public int getUser_vip() {
		return user_vip;
	}
	/*
	 * �����û��ʺŻ�Ա״̬
	 * @param user_vip
	 */
	public void setUser_vip(int user_vip) {
		this.user_vip = user_vip;
	}
	/*
	 * �вι��췽��
	 */
	public User(String user_Name, String user_pwd, String user_phone, double user_Money, String user_Date) {
		super();
		this.user_Name = user_Name;
		this.user_pwd = user_pwd;
		this.user_phone = user_phone;
		this.user_Date = user_Date;
		this.user_Money = user_Money;
		this.user_vip = 0;
	}
	/*
	 * �޲ι��췽��
	 */
	public User() {
		super();
	}
	/*
	 * (non-Javadoc)��дtoString
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Users [user_Id=" + user_Id + ", user_Name=" + user_Name + ", user_pwd=" + user_pwd + ", user_phone="
				+ user_phone + ", user_Money=" + user_Money + ", user_Date=" + user_Date + ", user_vip=" + user_vip
				+ "]";
	}
	
}
