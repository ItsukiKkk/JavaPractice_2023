package com.edu.seiryo.service;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;

public class UserService {
	//计算输入错误次数
	int countWrong = 0;
	Scanner scanner = new Scanner(System.in);
	/**
	 * 注册表单验证
	 */
	public void registUser(){
		boolean ifStandard = false;
		String userName = null,userPwd = null;
		while(!ifStandard){
			System.out.println("请输入注册用户名");
			userName = scanner.next();
			Pattern pattern = Pattern.compile("^[A-Z].*\\W$");
			Matcher matcher = pattern.matcher(userName);
			if(!matcher.matches()){
				System.out.println("账号必须符合首字母大写，最后一个字符为特殊符号");
				continue;
			}
			ifStandard = true;
		}
		ifStandard = false;
		while(!ifStandard){
			System.out.println("请输入注册用户密码");
			userPwd = scanner.next();
			Pattern pattern = Pattern.compile("^[A-Z].*\\W$");
			Matcher matcher = pattern.matcher(userPwd);
			if(!matcher.matches()){
				System.out.println("密码必须符合首字母大写，最后一个字符为特殊符号");
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
	 * 登入验证
	 */
	public void loginUser(){
		String userName = null,userPwd = null;
		UserDao userDao = new UserDao();
		System.out.println("请输入登录用户名");
		userName = scanner.next();
		System.out.println("请输入登录用户密码");
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
			System.out.println("用户名或密码错误");
			countWrong++;
			if(countWrong == 3){
				System.out.println("输入错误三次，系统退出");
				System.exit(0);
			}
			loginUser();
			return;
		}
		System.out.println("登入成功");
	}
	//main方法测试
//	public static void main(String[] args) {
//		new UserService().registUser();
//		new UserService().loginUser();
//	}
}
