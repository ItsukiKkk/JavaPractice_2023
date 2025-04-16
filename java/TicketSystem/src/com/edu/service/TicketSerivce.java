package com.edu.service;

import java.util.List;
import java.util.Scanner;

import com.seiryo.dao.OrderDao;
import com.seiryo.dao.TicketDao;
import com.seiryo.entity.Ticket;

public class TicketSerivce {
	Scanner sc = new Scanner(System.in);
	TicketDao ticketDao = new TicketDao();
	OrderDao orderDao = new OrderDao();
	/*
	 * 显示总车票
	 */
	public void queryTicket(){
		List<Ticket> list = ticketDao.queryTicket();
		System.out.println("车次\t价格\t数量");
		for (int i = 0; i < list.size(); i++) {
			Ticket ticket = list.get(i);
			System.out.println(ticket.getNumber()+"\t"+ticket.getPrice()+"\t"+ticket.getAmount());
		}
	} 
	/*
	 * 按车次查询有无车票
	 */
	public void queryByNumber(){
		System.out.println("请输入购买的车次");
		String number = sc.next();
		boolean ifHasNum = ticketDao.queryByNumber(number);
		if (!ifHasNum) {
			System.out.println("查无此车次，请重新输入");
			queryByNumber();
		}else{
			hasLeft(number);
		}
	}
	/*
	 * 检查该车次剩余车票数量
	 */
	private void hasLeft(String number){
		System.out.println("请输入购买的数量");
		int hasLeft = 0;
		int amount = sc.nextInt();
		hasLeft = ticketDao.hasLeft(number);
		if (hasLeft <= amount) {
			System.out.println("余票不足！请重新输入");
			hasLeft(number);
		}else{
			//购物车内有无重复票
			boolean hasRepeatTicket = orderDao.hasRepeatTicket(number, amount);
			if (!hasRepeatTicket) {
				orderDao.insertTicket(number, amount);
			}else{
				orderDao.updateTicket(number, amount);
			}
			//减少ticket的票amount
			ticketReduction(number, amount);
			System.out.println("购买成功！");
		}
	}
	/*
	 * 将已购买车票信息到储存在list
	 */
	public List<Ticket> addToOrder(String number,int amount){
		List<Ticket> addList = ticketDao.addToOrder(number, amount);
		return addList;
	}
	/*
	 * 购买后ticket数量减少(这里的是剩的amount)
	 */
	public void ticketReduction(String number,int amount){
		ticketDao.ticketReduction(number, amount);
	}
	//测试
//	public static void main(String[] args) {
//		new TicketSerivce().queryByNumber();
//	}
}
