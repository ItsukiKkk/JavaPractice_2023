package com.seiryo.dao;

import java.sql.ResultSet;

import com.edu.seiryo.DBUtil;
import com.seiryo.entity.User;

public class UserDao {
	/*
	 * ��ס��ǰ�����user����
	 */
	private static String iUserName;
	/*
	 * ��ȡ���ڵ����user��
	 */
	public String getiUserName() {
		return iUserName;
	}
	/*
	 * �������ڵ����user��
	 */
	public void setiUserName(String iUserName) {
		this.iUserName = iUserName;
	}
	/**
	 * which��֤������Ϣ�ĸ��Ǵ��
	 */
	private int whichWrong;
	/*
	 * ��ȡwhichWrong
	 */
	public int getWhichWrong() {
		return whichWrong;
	}
	/*
	 * ����whichWrong
	 */
	public void setWhichWrong(int whichWrong) {
		this.whichWrong = whichWrong;
	}
	/*
	 * ע�ᴢ���û���Ϣ
	 */
	public boolean saveRegister(User user){
		String sql = "insert into users(userName,userPwd,email) values(?,?,?)";
		boolean bo = false;
		try {
			bo = DBUtil.executeUpdate(sql, user.getUserName(),user.getUserPwd(),user.getEmail());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 * ��֤ע���û����Ƿ��ظ�
	 */
	public boolean ifNameRepeat(String userName){
		ResultSet rSet = null;
		boolean bo = false;
		String sql = "select id from users where userName = ?";
		try {
			rSet = DBUtil.executeQuery(sql, userName);
			bo = rSet.next();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/*
	 * ������֤
	 */
	public boolean loginQuery(String userName,String userPwd){
		ResultSet rSet = null;
		boolean bo = false;
		String sql = "select id from users where userName = ? and userPwd = ?";
		try {
			rSet = DBUtil.executeQuery(sql, userName, userPwd);
			bo = rSet.next();
			if (!bo) {
				whichWrong(userName, userPwd);	
			}else{
				setiUserName(userName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/*
	 * ����ʧ�ܺ�ֱ���֤���û����������������
	 * �û������󷵻�1
	 * ������󷵻�2
	 * �޸��˻�����3
	 */
	private int whichWrong(String userName, String userPwd){
		ResultSet rSet1 = null;
		ResultSet rSet2 = null;
		whichWrong = -1;
		String sql1 = "select id from users where userName = ?";
		String sql2 = "select id from users where userPwd = ?";
		try {
			rSet1 = DBUtil.executeQuery(sql1, userName);
			rSet2 = DBUtil.executeQuery(sql2, userPwd);
			if (rSet1.next()) {
				whichWrong = 2;
			}
			if (rSet2.next()) {
				whichWrong = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return whichWrong;
	}
	/*
	 * �����������
	 * ��֤�û����������Ƿ�һ��
	 */
	public boolean ifUserExists(String userName, String email){
		ResultSet rSet = null;
		boolean bo = false;
		String sql = "select id from users where userName = ? and email = ?";
		try {
			rSet = DBUtil.executeQuery(sql, userName, email);
			bo = rSet.next();
			if (bo == false) {
				whichWrong = whichWrong(userName, email);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/*
	 * �����������
	 * ��������
	 */
	public boolean resetPwd(String userName, String userPwd){
		String sql = "update users set userPwd = ? where userName = ? ";
		boolean bo = false;
		try {
			bo = DBUtil.executeUpdate(sql, userPwd, userName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
}
