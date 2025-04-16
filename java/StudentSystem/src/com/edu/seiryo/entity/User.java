package com.edu.seiryo.entity;

public class User {
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 用户密码
	 */
	private String userPwd;
	/**
	 * 返回用户名
	 * @return
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置用户名
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 返回用户密码
	 * @return
	 */
	public String getUserPwd() {
		return userPwd;
	}
	/**
	 * 设置用户密码
	 * @param userPwd
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	/**
	 * 有参构造方法设置用户名和密码
	 * @param userName
	 * @param userPwd
	 */
	public User(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}
	/**
	 * 无参构造方法
	 */
	public User() {
		super();
	}
	/**
	 * 重写toString
	 */
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPwd=" + userPwd + "]";
	}
	
}
