package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.service.UserService;

public class UserView {
	Scanner scanner = new Scanner(System.in);
	public boolean initialUserSystem(){
		boolean havedLogin = false;
		System.out.println("��ӭʹ������ѧ������ϵͳ");
		System.out.println("----------------------");
		System.out.println("1��ע��");
		System.out.println("2����¼");
		System.out.println("----------------------");
		System.out.println("��ѡ��[1/2]��");
		int choice = scanner.nextInt();
		switch(choice){
			case 1:
				System.out.println("ע�����");
				new UserService().registUser();
			case 2:
				System.out.println("��¼����");
				new UserService().loginUser();
				havedLogin = true;
				break;
			default:
				System.out.println("ѡ���������������");
				initialUserSystem();
		}
		return havedLogin;
	}
	//���Է���
//	public static void main(String[] args) {
//		new UserView().initialUserSystem();
//	}
}
