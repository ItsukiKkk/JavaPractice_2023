package com.edu.seiryo.entity;

public class User {
	//用户编号
	private int user_Id;
	//用户账号
	private String user_Name;
	//用户密码
	private String user_pwd;
	//手机号码
	private String user_phone;
	//用户金额
	private double user_Money;
	//注册日期
	private String user_Date;
	//会员状态
	private int user_vip;
	
	/**
	 * 返回用户id
	 * @return user_Id
	 */
	public int getUser_Id() {
		return user_Id;
	}
	/**
	 * 设置用户id
	 * @param userName
	 */
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	/**
	 * 返回用户名
	 * @return user_Name
	 */
	public String getUser_Name() {
		return user_Name;
	}
	/**
	 * 设置用户名
	 * @param user_Name
	 */
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	/**
	 * 返回用户密码
	 * @return user_pwd
	 */
	public String getUser_pwd() {
		return user_pwd;
	}
	/**
	 * 设置用户密码
	 * @param user_pwd
	 */
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	/*
	 * 返回用户手机号
	 * @return user_pwd
	 */
	public String getUser_phone() {
		return user_phone;
	}
	/**
	 * 设置用户手机号
	 * @param user_phone
	 */
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	/*
	 * 返回用户帐号剩余金额
	 * @return user_Money
	 */
	public double getUser_Money() {
		return user_Money;
	}
	/**
	 * 设置用户帐号剩余金额
	 * @param user_Money
	 */
	public void setUser_Money(double user_Money) {
		this.user_Money = user_Money;
	}
	/**
	 * 返回用户帐号注册日期
	 * @return user_Date
	 */
	public String getUser_Date() {
		return user_Date;
	}
	/*
	 * 设置用户帐号注册日期
	 * @param user_Date
	 */
	public void setUser_Date(String user_Date) {
		this.user_Date = user_Date;
	}
	/**
	 * 返回用户帐号注册日期
	 * @return user_vip
	 */
	public int getUser_vip() {
		return user_vip;
	}
	/*
	 * 设置用户帐号会员状态
	 * @param user_vip
	 */
	public void setUser_vip(int user_vip) {
		this.user_vip = user_vip;
	}
	/*
	 * 有参构造方法
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
	 * 无参构造方法
	 */
	public User() {
		super();
	}
	/*
	 * (non-Javadoc)重写toString
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Users [user_Id=" + user_Id + ", user_Name=" + user_Name + ", user_pwd=" + user_pwd + ", user_phone="
				+ user_phone + ", user_Money=" + user_Money + ", user_Date=" + user_Date + ", user_vip=" + user_vip
				+ "]";
	}
	
}
