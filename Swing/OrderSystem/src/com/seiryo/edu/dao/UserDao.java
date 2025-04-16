package com.seiryo.edu.dao;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.seiryo.edu.dao.imp.UserDaoImp;
import com.seiryo.edu.entity.Users;
import com.seiryo.edu.util.DBUtil;

public class UserDao implements UserDaoImp{
	//存现在登录的用户
	private static Users iUser;
	//get现在登录的用户
	public static Users getiUser() {
		return iUser;
	}
	//set现在登录的用户
	private static void setiUser(Users iUser) {
		UserDao.iUser = iUser;
	}
	@Override
	/*
	 * 登入校验返回User Id存入现在登入的userId
	 * @param Users user
	 * @return int
	 */
	public int queryUser(Users user) {
	    String sql = "select id from users where userName = ? and userPwd = ?";
        ResultSet rs = null;
        int id = -1;
        try {
            rs = DBUtil.executeQuery(sql,user.getName(),user.getPassword());
            if(rs.next()){
            	id = rs.getInt(1);
            	setiUser(user);
            	iUser.setId(id);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                DBUtil.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return id;
	}
	@Override
	/*
	 * 注册
	 * @param Users user
	 * @return boolean
	 */
	public boolean insertUser(Users user) {
	  boolean bo = false;
        String sql = "insert into users(userName,userPwd,email) values(?,?,?)";
        try {
            bo = DBUtil.executeUpdate(sql,user.getName(),user.getPassword(),user.getEmail());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bo;
	}
	@Override
	/*
	 * 是否有重名用户
	 * @param String userName
	 * @return boolean
	 */
	public boolean hadSavedUserName(String userName) {
		String sql = "select id from users where userName = ?";
        ResultSet rs = null;
        boolean bo = false;
        try {
            rs = DBUtil.executeQuery(sql,userName);
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
	/*
	 * 返回现在登录的用户的信息
	 * @return Users
	 */
	public Users iUser(){
		String sql = "select id,userName,userPwd,email from users where id = ?";
        ResultSet rs = null;
        boolean bo = false;
        try {
            rs = DBUtil.executeQuery(sql,iUser.getId());
            if(rs.next()){
            	iUser = new Users();
            	iUser.setId(rs.getInt(1));
            	iUser.setName(rs.getString(2));
            	iUser.setPassword(rs.getString(3));
            	iUser.setEmail(rs.getString(4));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                DBUtil.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return iUser;
	}
	/*
	 * 更改用户信息
	 * @param String name, String pwd
	 * @return boolean
	 */
	public boolean editUserInfo(String name, String pwd){
		boolean bo = false;
        String sql = "update users set userPwd = ? where userName = ? ";
        try {
            bo = DBUtil.executeUpdate(sql,pwd, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bo;
	}
	@Override
	public String queryNameById(int id) {
		String bo = null;
		ResultSet rs = null;
        String sql = "select userName from users where id = ? ";
        try {
            rs = DBUtil.executeQuery(sql, id);
            if(rs.next()){
            	bo = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bo;
	}
}