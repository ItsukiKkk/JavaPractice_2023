package com.seiryo.edu.service;



import java.util.List;

import com.seiryo.edu.dao.UserDao;
import com.seiryo.edu.entity.Users;
import com.seiryo.edu.service.imp.UserServiceImp;

public class UserService implements UserServiceImp{
    UserDao userDao = new UserDao();
    public boolean executeUser(Users user)  {
    	
    	boolean  bo = userDao.executeUser(user);
    	return bo;
    }
    public boolean insertUser(Users user){
    	boolean  bo = userDao.insertUser(user);
    	return bo;
    }
	@Override
	public List<Users> queryAllUsers() {
		List<Users> list = userDao.queryAllUsers();
		return list;
	}
	@Override
	public boolean updatePwd(String pwd, int id) {
		boolean  bo = userDao.updatePwd(pwd, id);
		return bo;
	}
	@Override
	public boolean deleteUserInfo(int id) {
		boolean  bo = userDao.deleteUserInfo(id);
		return bo;
	}

}