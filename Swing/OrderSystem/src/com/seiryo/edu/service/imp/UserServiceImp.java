package com.seiryo.edu.service.imp;


import com.seiryo.edu.entity.Users;

public interface UserServiceImp {
    public int queryUser(Users user);
    public boolean insertUser(Users user);
    public boolean hadSavedUserName(String userName);
  //��ס���ڵ�¼���û�
	 public Users iUser();
	 public boolean editUserInfo(String name, String pwd);
	 /*
	  * ��id����userName
	  */
	 public String queryNameById(int id);
}
