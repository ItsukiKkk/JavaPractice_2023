package com.seiryo.edu.service.imp;


import com.seiryo.edu.entity.Users;

public interface UserServiceImp {
    public int queryUser(Users user);
    public boolean insertUser(Users user);
    public boolean hadSavedUserName(String userName);
  //记住现在登录的用户
	 public Users iUser();
	 public boolean editUserInfo(String name, String pwd);
	 /*
	  * 按id查找userName
	  */
	 public String queryNameById(int id);
}
