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
		System.out.println("---------------��ӭ����ĳ�������---------------");
		System.out.println("1��������תת");
		System.out.println("2��ע�����˺�");
		System.out.println("3���ټ�");
		System.out.println("��ѡ������Ҫ�ķ���");
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
		System.out.println("��������������ѡ��");
		ifLoginSuccess = main();
		return ifLoginSuccess;
	}
	private boolean login (){
		System.out.println("---------------��ӭ����ĳ�������---------------");
		System.out.println("1�������˺�");
		System.out.println("2�������ϼ�");
		System.out.println("ѡ������Ҫ�ķ���");
		boolean ifLoginSuccess = false;
		int choice  = sc.nextInt();
		if(choice == 2){
			ifLoginSuccess = false;
			return ifLoginSuccess;
		}
		if(choice == 1){
			System.out.println("�������û�����");
			String name = sc.next();
			System.out.println("�������û����룺");
			String pwd = sc.next();
			boolean hadUser = service.loginUser(name, pwd);
			if(hadUser){
				System.out.println("����ɹ�");
				ifLoginSuccess = true;
				return ifLoginSuccess;
			}else{
				System.out.println("���û�������");
				ifLoginSuccess = main ();
				return ifLoginSuccess;
			}
		}
		System.out.println("��������������ѡ��");
		ifLoginSuccess = login();
		return ifLoginSuccess;
	}
	private void register (){
		System.out.println("---------------�˺�ע��---------------");
		System.out.println("1����ʼע��");
		System.out.println("2��������һ��");
		System.out.println("��ѡ������Ҫ�ķ���");
		int choice  = sc.nextInt();
		if(choice == 2){
			main ();
			return;
		}
		boolean circle = true;
		boolean ifRegisterSuccess = false;
		if(choice == 1){
			while(circle){
				System.out.println("������ע���û���");
				String name = sc.next(); 
				boolean hadSavedUserName = service.hadSavedUserName(name);
				if (hadSavedUserName) {
					System.out.println("�û����ظ�����������");
					continue;
				}
				System.out.println("������ע������");
				String pw = sc.next();
				System.out.println("������ע���Ա�");
				String sex = sc.next();
				System.out.println("������ע���ֻ���");
				String phone = sc.next();
				boolean ifSameNumber = service.ifSameNumber(phone);
				if (ifSameNumber) {
					System.out.println("���ֻ����ظ�����������");
					continue;
				}
				System.out.println("�������׳���״γ�ֵ ��300-500��20��500������50����");
				double money  = sc.nextDouble();
				Date date = new Date();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String day = simpleDateFormat.format(date);
				User user = new User(name,pw,phone,money,day);
				boolean registUser = service.registUser(user);
				if(registUser){
					System.out.println("ע��ɹ�");
					login ();
					break;
				}
			}
		}
		if(!ifRegisterSuccess){
			System.out.println("��������������ѡ��");
			register ();
			return;
		}
	}
}
