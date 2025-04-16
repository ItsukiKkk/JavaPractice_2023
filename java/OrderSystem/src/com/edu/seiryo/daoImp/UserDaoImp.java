package com.edu.seiryo.daoImp;

import com.edu.seiryo.entity.User;

public interface UserDaoImp {
	public boolean registUser(User user);
	public boolean loginUser(String userName, String userPwd);
	public boolean hadSavedUserName(String userName);
	public boolean ifSameNumber(String phoneNumber);
	public User iUser();
	public boolean changeBalance(int id,double balance);
	public boolean changeVip(int id,int vip);
	public boolean changIuserVip(double user_Money,int vip);
}
