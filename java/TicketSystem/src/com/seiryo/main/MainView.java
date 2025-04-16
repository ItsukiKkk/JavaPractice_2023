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
			System.out.println("————————————欢迎使用购票系统————————————");
			System.out.println("1. 注册");
			System.out.println("2. 登录");
			System.out.println("3. 购买车票");
			System.out.println("4. 我的订单");
			System.out.println("5. 退出");
			System.out.println("—————————————————————————————————————");
			System.out.println("请输入需执行的操作");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("---注册界面---");
				userService.register();
			case 2:
				System.out.println("---登录界面---");
				ifLoginSuccess = userService.loginQuery();
				
			case 3:
				if (!ifLoginSuccess) {
					System.out.println("------!!请先登录!!-------");
					break;
				}
				ticketView.view();
				break;
			case 4:
				if (!ifLoginSuccess) {
					System.out.println("------!!请先登录!!-------");
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
