package com.seiryo.edu.dao;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.seiryo.edu.dao.imp.UserDaoImp;
import com.seiryo.edu.entity.Users;
import com.seiryo.edu.util.DBUtil;

public class UserDao implements UserDaoImp{
	//�����ڵ�¼���û�
	private static Users iUser;
	//get���ڵ�¼���û�
	public static Users getiUser() {
		return iUser;
	}
	//set���ڵ�¼���û�
	private static void setiUser(Users iUser) {
		UserDao.iUser = iUser;
	}
	@Override
	/*
	 * ����У�鷵��User Id�������ڵ����userId
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
	 * ע��
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
	 * �Ƿ��������û�
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
	 * �������ڵ�¼���û�����Ϣ
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
	 * �����û���Ϣ
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