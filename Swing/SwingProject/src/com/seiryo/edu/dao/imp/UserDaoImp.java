package com.seiryo.edu.dao.imp;

import java.util.List;

import com.seiryo.edu.entity.Users;


public interface UserDaoImp {
	 public boolean executeUser(Users user); 
	 public boolean insertUser(Users user);
	 public List<Users> queryAllUsers();
	 public boolean updatePwd(String pwd,int id);
	 public boolean deleteUserInfo(int id);
}
