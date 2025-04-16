package com.seiryo.entity;

public class User {
	/*
	 * id
	 */
	private int id;
	/*
	 * 用户名
	 */
	private String userName;
	/*
	 * 用户密码
	 */
	private String userPwd;
	/*
	 * 邮箱
	 */
	private String email;
	/*
	 * 得到id
	 */
	public int getId() {
		return id;
	}
	/*
	 * 设置id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/*
	 * 获取用户名
	 */
	public String getUserName() {
		return userName;
	}
	/*
	 * 设置用户名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/*
	 * 获取用户密码
	 */
	public String getUserPwd() {
		return userPwd;
	}
	/*
	 * 设置用户密码
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	/*
	 * 获取用户邮箱
	 */
	public String getEmail() {
		return email;
	}
	/*
	 * 设置用户邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/*
	 * 参数为id，userName，userPwd，email的构造方法
	 */
	public User(int id, String userName, String userPwd, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPwd = userPwd;
		this.email = email;
	}
	/*
	 * 参数为userName，userPwd，email的构造方法
	 */
	public User(String userName, String userPwd, String email) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.email = email;
	}
	/*
	 * 无参构造方法
	 */
	public User() {
		super();
	}
	/*
	 * 重写toString方法
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userPwd=" + userPwd + ", email=" + email + "]";
	}
	
}
