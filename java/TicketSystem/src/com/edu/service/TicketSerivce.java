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
	 * ��ʾ�ܳ�Ʊ
	 */
	public void queryTicket(){
		List<Ticket> list = ticketDao.queryTicket();
		System.out.println("����\t�۸�\t����");
		for (int i = 0; i < list.size(); i++) {
			Ticket ticket = list.get(i);
			System.out.println(ticket.getNumber()+"\t"+ticket.getPrice()+"\t"+ticket.getAmount());
		}
	} 
	/*
	 * �����β�ѯ���޳�Ʊ
	 */
	public void queryByNumber(){
		System.out.println("�����빺��ĳ���");
		String number = sc.next();
		boolean ifHasNum = ticketDao.queryByNumber(number);
		if (!ifHasNum) {
			System.out.println("���޴˳��Σ�����������");
			queryByNumber();
		}else{
			hasLeft(number);
		}
	}
	/*
	 * ���ó���ʣ�೵Ʊ����
	 */
	private void hasLeft(String number){
		System.out.println("�����빺�������");
		int hasLeft = 0;
		int amount = sc.nextInt();
		hasLeft = ticketDao.hasLeft(number);
		if (hasLeft <= amount) {
			System.out.println("��Ʊ���㣡����������");
			hasLeft(number);
		}else{
			//���ﳵ�������ظ�Ʊ
			boolean hasRepeatTicket = orderDao.hasRepeatTicket(number, amount);
			if (!hasRepeatTicket) {
				orderDao.insertTicket(number, amount);
			}else{
				orderDao.updateTicket(number, amount);
			}
			//����ticket��Ʊamount
			ticketReduction(number, amount);
			System.out.println("����ɹ���");
		}
	}
	/*
	 * ���ѹ���Ʊ��Ϣ��������list
	 */
	public List<Ticket> addToOrder(String number,int amount){
		List<Ticket> addList = ticketDao.addToOrder(number, amount);
		return addList;
	}
	/*
	 * �����ticket��������(�������ʣ��amount)
	 */
	public void ticketReduction(String number,int amount){
		ticketDao.ticketReduction(number, amount);
	}
	//����
//	public static void main(String[] args) {
//		new TicketSerivce().queryByNumber();
//	}
}
