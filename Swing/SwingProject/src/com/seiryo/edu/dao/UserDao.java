package com.seiryo.edu.dao;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.seiryo.edu.dao.imp.UserDaoImp;
import com.seiryo.edu.entity.Users;
import com.seiryo.edu.util.DBUtil;

public class UserDao implements UserDaoImp{
	@Override
	public boolean executeUser(Users user) {
		    String sql = "select userName,userPwd from users where userName = ? and userPwd = ?";
	        ResultSet rs = null;
	        boolean bo = false;
	        try {
	            rs = DBUtil.executeQuery(sql,user.getName(),user.getPassword());
	            bo = rs.next();
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }finally {
	            try {
	                DBUtil.close();
	            } catch (Exception e) {
	                throw new RuntimeException(e);
	            }
	        }
	        return bo;
	}
	@Override
	public boolean insertUser(Users user) {
	  boolean bo = false;
        String sql = "insert into users(userName,userPwd) values(?,?)";
        try {
            bo = DBUtil.executeUpdate(sql,user.getName(),user.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bo;
	}
	@Override
	public List<Users> queryAllUsers() {
		String sql = "select id,userName,userPwd from users";
        List<Users> list = new ArrayList<Users>();
        ResultSet rs = null;
        Users user = null;
        try {
        	rs = DBUtil.executeQuery(sql);
        	while(rs.next()){
        		user = new Users();
        		user.setId(rs.getInt(1));
        		user.setName(rs.getString(2));
        		user.setPassword(rs.getString(3));
        		list.add(user);
        	}
        }catch(Exception e){
        	e.printStackTrace();
        }finally{
        	try {
				DBUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
        return list;
	}
	@Override
	public boolean updatePwd(String pwd,int id) {
		boolean bo = false;
        String sql = "update users set userPwd = ? where id = ?";
        try {
            bo = DBUtil.executeUpdate(sql,pwd,id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bo;
	}
	@Override
	public boolean deleteUserInfo(int id) {
		boolean bo = false;
        String sql = "delete from users where id = ?";
        try {
            bo = DBUtil.executeUpdate(sql,id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bo;
	}
}