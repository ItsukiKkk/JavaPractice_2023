package com.edu.seiryo.service;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;

public class UserService {
	//��������������
	int countWrong = 0;
	Scanner scanner = new Scanner(System.in);
	/**
	 * ע�����֤
	 */
	public void registUser(){
		boolean ifStandard = false;
		String userName = null,userPwd = null;
		while(!ifStandard){
			System.out.println("������ע���û���");
			userName = scanner.next();
			Pattern pattern = Pattern.compile("^[A-Z].*\\W$");
			Matcher matcher = pattern.matcher(userName);
			if(!matcher.matches()){
				System.out.println("�˺ű����������ĸ��д�����һ���ַ�Ϊ�������");
				continue;
			}
			ifStandard = true;
		}
		ifStandard = false;
		while(!ifStandard){
			System.out.println("������ע���û�����");
			userPwd = scanner.next();
			Pattern pattern = Pattern.compile("^[A-Z].*\\W$");
			Matcher matcher = pattern.matcher(userPwd);
			if(!matcher.matches()){
				System.out.println("��������������ĸ��д�����һ���ַ�Ϊ�������");
				continue;
			}
			ifStandard = true;
		}
		try {
			new UserDao().registUser(new User(userName,userPwd));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * ������֤
	 */
	public void loginUser(){
		String userName = null,userPwd = null;
		UserDao userDao = new UserDao();
		System.out.println("�������¼�û���");
		userName = scanner.next();
		System.out.println("�������¼�û�����");
		userPwd = scanner.next();
		boolean hasUser = false;
		try {
			hasUser = userDao.loginUser(userName,userPwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!hasUser){
			System.out.println("�û������������");
			countWrong++;
			if(countWrong == 3){
				System.out.println("����������Σ�ϵͳ�˳�");
				System.exit(0);
			}
			loginUser();
			return;
		}
		System.out.println("����ɹ�");
	}
	//main��������
//	public static void main(String[] args) {
//		new UserService().registUser();
//		new UserService().loginUser();
//	}
}
