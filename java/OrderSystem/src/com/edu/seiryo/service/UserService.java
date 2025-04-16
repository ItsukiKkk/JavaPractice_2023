package com.edu.seiryo.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.daoImp.UserDaoImp;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.serviceImp.UserServiceImp;

public class UserService implements UserServiceImp{
	Scanner sc = new Scanner(System.in);
	UserDaoImp service = new UserDao();
	public boolean main (){
		boolean ifLoginSuccess = false;
		System.out.println("---------------欢迎来到某宝购物店---------------");
		System.out.println("1、到店里转转");
		System.out.println("2、注册新账号");
		System.out.println("3、再见");
		System.out.println("请选择您需要的服务");
		int choice  = sc.nextInt();
		if(choice == 1){
			ifLoginSuccess = login();
			return ifLoginSuccess;
		}
		if(choice == 2){
			register();
			return false;
		}
		if(choice == 3){
			System.exit(0);
		}
		System.out.println("输入有误请重新选择");
		ifLoginSuccess = main();
		return ifLoginSuccess;
	}
	private boolean login (){
		System.out.println("---------------欢迎来到某宝购物店---------------");
		System.out.println("1、登入账号");
		System.out.println("2、返回上级");
		System.out.println("选择您需要的服务");
		boolean ifLoginSuccess = false;
		int choice  = sc.nextInt();
		if(choice == 2){
			ifLoginSuccess = false;
			return ifLoginSuccess;
		}
		if(choice == 1){
			System.out.println("请输入用户名：");
			String name = sc.next();
			System.out.println("请输入用户密码：");
			String pwd = sc.next();
			boolean hadUser = service.loginUser(name, pwd);
			if(hadUser){
				System.out.println("登入成功");
				ifLoginSuccess = true;
				return ifLoginSuccess;
			}else{
				System.out.println("该用户不存在");
				ifLoginSuccess = main ();
				return ifLoginSuccess;
			}
		}
		System.out.println("输入有误请重新选择");
		ifLoginSuccess = login();
		return ifLoginSuccess;
	}
	private void register (){
		System.out.println("---------------账号注册---------------");
		System.out.println("1、开始注册");
		System.out.println("2、返回上一级");
		System.out.println("请选择您需要的服务");
		int choice  = sc.nextInt();
		if(choice == 2){
			main ();
			return;
		}
		boolean circle = true;
		boolean ifRegisterSuccess = false;
		if(choice == 1){
			while(circle){
				System.out.println("请输入注册用户名");
				String name = sc.next(); 
				boolean hadSavedUserName = service.hadSavedUserName(name);
				if (hadSavedUserName) {
					System.out.println("用户名重复请重新输入");
					continue;
				}
				System.out.println("请输入注册密码");
				String pw = sc.next();
				System.out.println("请输入注册性别");
				String sex = sc.next();
				System.out.println("请输入注册手机号");
				String phone = sc.next();
				boolean ifSameNumber = service.ifSameNumber(phone);
				if (ifSameNumber) {
					System.out.println("用手机号重复请重新输入");
					continue;
				}
				System.out.println("请输入首充金额（首次充值 充300-500赠20，500以上赠50）：");
				double money  = sc.nextDouble();
				Date date = new Date();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String day = simpleDateFormat.format(date);
				User user = new User(name,pw,phone,money,day);
				boolean registUser = service.registUser(user);
				if(registUser){
					System.out.println("注册成功");
					login ();
					break;
				}
			}
		}
		if(!ifRegisterSuccess){
			System.out.println("输入有误请重新选择");
			register ();
			return;
		}
	}
}
