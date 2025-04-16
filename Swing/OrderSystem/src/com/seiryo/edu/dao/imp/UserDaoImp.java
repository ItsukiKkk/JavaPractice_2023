package com.seiryo.edu.dao.imp;


import com.seiryo.edu.entity.Users;

public interface UserDaoImp {
	//登入校验返回User Id存入现在登入的userId
	 public int queryUser(Users user);
	 //注册存入数据
	 public boolean insertUser(Users user);
	 //是否有重名用户
	 public boolean hadSavedUserName(String userName);
	//更改用户信息
	 public boolean editUserInfo(String name, String pwd);
	//记住现在登录的用户
	 public Users iUser();
	 /*
	  * 按id查找userName
	  */
	 public String queryNameById(int id);
}
