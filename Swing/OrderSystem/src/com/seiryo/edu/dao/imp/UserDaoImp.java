package com.seiryo.edu.dao.imp;


import com.seiryo.edu.entity.Users;

public interface UserDaoImp {
	//����У�鷵��User Id�������ڵ����userId
	 public int queryUser(Users user);
	 //ע���������
	 public boolean insertUser(Users user);
	 //�Ƿ��������û�
	 public boolean hadSavedUserName(String userName);
	//�����û���Ϣ
	 public boolean editUserInfo(String name, String pwd);
	//��ס���ڵ�¼���û�
	 public Users iUser();
	 /*
	  * ��id����userName
	  */
	 public String queryNameById(int id);
}
