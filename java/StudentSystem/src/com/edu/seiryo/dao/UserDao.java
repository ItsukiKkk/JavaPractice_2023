package com.edu.seiryo.dao;


import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.DataBaseUtil;

import java.sql.*;

public class UserDao {
	/**
	 * �洢ע��user��Ϣ
	 * @param user
	 * @throws SQLException 
	 */
	public void registUser(User user) throws SQLException, ClassNotFoundException {
	    String sql = "INSERT INTO Users (userName, userPwd) VALUES (?, ?)";
	    DataBaseUtil.update(sql, user.getUserName(), user.getUserPwd());
	}

	/**
	 * ������֤�������Ƿ���û���ע��
	 * @return
	 * @throws SQLException 
	 */
	public boolean loginUser(String userName, String userPwd) throws SQLException, ClassNotFoundException {
	    String sql = "SELECT * FROM Users WHERE userName = ? AND userPwd = ?";
	    try (ResultSet rs = DataBaseUtil.query(sql, userName, userPwd)) {
	        return rs.next(); 
	    }
	}

}
