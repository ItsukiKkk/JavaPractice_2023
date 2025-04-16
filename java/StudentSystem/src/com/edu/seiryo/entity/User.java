package com.edu.seiryo.entity;

public class User {
	/**
	 * �û���
	 */
	private String userName;
	/**
	 * �û�����
	 */
	private String userPwd;
	/**
	 * �����û���
	 * @return
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * �����û���
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * �����û�����
	 * @return
	 */
	public String getUserPwd() {
		return userPwd;
	}
	/**
	 * �����û�����
	 * @param userPwd
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	/**
	 * �вι��췽�������û���������
	 * @param userName
	 * @param userPwd
	 */
	public User(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}
	/**
	 * �޲ι��췽��
	 */
	public User() {
		super();
	}
	/**
	 * ��дtoString
	 */
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPwd=" + userPwd + "]";
	}
	
}
