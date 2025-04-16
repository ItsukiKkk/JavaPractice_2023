package com.seiryo.main;

import java.util.Scanner;

import com.edu.service.UserService;
import com.seiryo.view.OrderView;
import com.seiryo.view.TicketView;

public class MainView {
	public static void main(String[] args) {
		boolean ifLoginSuccess = false;
		Scanner sc = new Scanner(System.in);
		UserService userService = new UserService();
		OrderView orderView = new OrderView();
		TicketView ticketView = new TicketView();
		while(true){
			System.out.println("��������������������������ӭʹ�ù�Ʊϵͳ������������������������");
			System.out.println("1. ע��");
			System.out.println("2. ��¼");
			System.out.println("3. ����Ʊ");
			System.out.println("4. �ҵĶ���");
			System.out.println("5. �˳�");
			System.out.println("��������������������������������������������������������������������������");
			System.out.println("��������ִ�еĲ���");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("---ע�����---");
				userService.register();
			case 2:
				System.out.println("---��¼����---");
				ifLoginSuccess = userService.loginQuery();
				
			case 3:
				if (!ifLoginSuccess) {
					System.out.println("------!!���ȵ�¼!!-------");
					break;
				}
				ticketView.view();
				break;
			case 4:
				if (!ifLoginSuccess) {
					System.out.println("------!!���ȵ�¼!!-------");
					break;
				}
				orderView.view();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}
