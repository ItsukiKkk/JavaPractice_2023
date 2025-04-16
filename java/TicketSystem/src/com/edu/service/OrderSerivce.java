package com.edu.service;

import java.util.List;
import com.seiryo.dao.OrderDao;
import com.seiryo.entity.Ticket;

public class OrderSerivce {
	/*
	 * 打印已购买的车票
	 */
	OrderDao orderDao = new OrderDao();
	public void allOrderTicket(){
		List<Ticket> list = orderDao.allOrderTicket();
		System.out.println("车次\t总价格\t已购买数量");
		for (int i = 0; i < list.size(); i++) {
			Ticket ticket = list.get(i);
			System.out.println(ticket.getNumber()+"\t"+ticket.getPrice()+"\t"+ticket.getAmount());
		}
	}
	public static void main(String[] args) {
		new OrderSerivce().allOrderTicket();
	}
}
