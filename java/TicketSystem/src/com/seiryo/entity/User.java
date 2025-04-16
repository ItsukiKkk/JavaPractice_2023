package com.seiryo.entity;

public class User {
	/*
	 * id
	 */
	private int id;
	/*
	 * �û���
	 */
	private String userName;
	/*
	 * �û�����
	 */
	private String userPwd;
	/*
	 * ����
	 */
	private String email;
	/*
	 * �õ�id
	 */
	public int getId() {
		return id;
	}
	/*
	 * ����id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/*
	 * ��ȡ�û���
	 */
	public String getUserName() {
		return userName;
	}
	/*
	 * �����û���
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/*
	 * ��ȡ�û�����
	 */
	public String getUserPwd() {
		return userPwd;
	}
	/*
	 * �����û�����
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	/*
	 * ��ȡ�û�����
	 */
	public String getEmail() {
		return email;
	}
	/*
	 * �����û�����
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/*
	 * ����Ϊid��userName��userPwd��email�Ĺ��췽��
	 */
	public User(int id, String userName, String userPwd, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPwd = userPwd;
		this.email = email;
	}
	/*
	 * ����ΪuserName��userPwd��email�Ĺ��췽��
	 */
	public User(String userName, String userPwd, String email) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.email = email;
	}
	/*
	 * �޲ι��췽��
	 */
	public User() {
		super();
	}
	/*
	 * ��дtoString����
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userPwd=" + userPwd + ", email=" + email + "]";
	}
	
}
