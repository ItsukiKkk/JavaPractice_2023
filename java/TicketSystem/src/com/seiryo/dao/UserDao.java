package com.seiryo.dao;

import java.sql.ResultSet;

import com.edu.seiryo.DBUtil;
import com.seiryo.entity.User;

public class UserDao {
	/*
	 * 记住当前登入的user名字
	 */
	private static String iUserName;
	/*
	 * 获取现在登入的user名
	 */
	public String getiUserName() {
		return iUserName;
	}
	/*
	 * 设置现在登入的user名
	 */
	public void setiUserName(String iUserName) {
		this.iUserName = iUserName;
	}
	/**
	 * which验证登入信息哪个是错的
	 */
	private int whichWrong;
	/*
	 * 获取whichWrong
	 */
	public int getWhichWrong() {
		return whichWrong;
	}
	/*
	 * 设置whichWrong
	 */
	public void setWhichWrong(int whichWrong) {
		this.whichWrong = whichWrong;
	}
	/*
	 * 注册储存用户信息
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
	 * 验证注册用户名是否重复
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
	 * 登入验证
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
	 * 登入失败后分别验证是用户名错误还是密码错误
	 * 用户名错误返回1
	 * 密码错误返回2
	 * 无该账户返回3
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
	 * 重设密码界面
	 * 验证用户名和邮箱是否一致
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
	 * 重设密码界面
	 * 更改密码
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
