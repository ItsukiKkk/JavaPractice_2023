package com.seiryo.edu.service;



import java.util.List;

import com.seiryo.edu.dao.UserDao;
import com.seiryo.edu.dao.imp.UserDaoImp;
import com.seiryo.edu.entity.Users;
import com.seiryo.edu.service.imp.UserServiceImp;

public class UserService implements UserServiceImp{
	UserDaoImp userDao = new UserDao();
    public int queryUser(Users user)  {
    	int  bo = userDao.queryUser(user);
    	return bo;
    }
    public boolean insertUser(Users user){
    	boolean  bo = userDao.insertUser(user);
    	return bo;
    }
	@Override
	public boolean hadSavedUserName(String userName) {
		boolean  bo = userDao.hadSavedUserName(userName);
    	return bo;
	}
	//记住现在登录的用户
	 public Users iUser(){
		 Users  bo = userDao.iUser();
	   return bo;
	 }
	 public boolean editUserInfo(String name, String pwd){
		 boolean  bo = userDao.editUserInfo(name, pwd);
    	 return bo;
	 }
	 /*
	  * 按id查找userName
	  */
	 public String queryNameById(int id){
		 String  bo = userDao.queryNameById(id);
		   return bo;
	 };
}