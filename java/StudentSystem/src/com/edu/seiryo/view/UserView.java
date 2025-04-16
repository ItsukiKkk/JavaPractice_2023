package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.service.UserService;

public class UserView {
	Scanner scanner = new Scanner(System.in);
	public boolean initialUserSystem(){
		boolean havedLogin = false;
		System.out.println("欢迎使用青凌学生管理系统");
		System.out.println("----------------------");
		System.out.println("1、注册");
		System.out.println("2、登录");
		System.out.println("----------------------");
		System.out.println("请选择[1/2]：");
		int choice = scanner.nextInt();
		switch(choice){
			case 1:
				System.out.println("注册界面");
				new UserService().registUser();
			case 2:
				System.out.println("登录界面");
				new UserService().loginUser();
				havedLogin = true;
				break;
			default:
				System.out.println("选择错误请重新输入");
				initialUserSystem();
		}
		return havedLogin;
	}
	//测试方法
//	public static void main(String[] args) {
//		new UserView().initialUserSystem();
//	}
}
