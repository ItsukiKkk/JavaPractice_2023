package com.seiryo.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.DBUtil;
import com.seiryo.entity.Ticket;

public class OrderDao {
	private TicketDao ticketDao = new TicketDao();
	private UserDao userDao = new UserDao();
	/*
	 * 已经下单的重复车票的数量
	 */
	private static int alraedyHadAmount;
	/*
	 * 查找是否有重复车票
	 * 定义alraedyHadAmount
	 */
	public boolean hasRepeatTicket(String number,int amount){
		String sql = "select id,amount from orders where number = ? and userName = ?";
		ResultSet rs = null;
		boolean bo = false;
		try {
			String iUserName = userDao.getiUserName();
			rs = DBUtil.executeQuery(sql, number, iUserName);
			bo = rs.next();
			if (bo) {
				alraedyHadAmount = rs.getInt(2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 * 不重复时添加车票信息
	 */
	public boolean insertTicket(String number,int amount){
		List<Ticket> list = ticketDao.addToOrder(number,amount);
		String sql = "insert into orders(number, price, amount, userName) values(?,?,?,?)";
		boolean bo = false;
		for (int i = 0; i < list.size(); i++) {
			try {
				Ticket ticket = list.get(i);
				bo = DBUtil.executeUpdate(sql, ticket.getNumber(),ticket.getPrice(),ticket.getAmount(),userDao.getiUserName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/*
	 * 重复时update车票信息
	 */
	public boolean updateTicket(String number,int amount){
		String sql = "update orders set amount = ? where number = ? and userName = ?";
		boolean bo = false;
		alraedyHadAmount += amount;
		try {
			bo = DBUtil.executeUpdate(sql, alraedyHadAmount, number,userDao.getiUserName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 * 查询已购买的车票
	 */
	public List<Ticket> allOrderTicket(){
		List<Ticket> list = new ArrayList<Ticket>();
		ResultSet rs = null;
		Ticket ticket = null;
		String sql = "select number,price,amount from orders where userName = ?";
		try {
			rs = DBUtil.executeQuery(sql, userDao.getiUserName());
			while(rs.next()){
				ticket = new Ticket();
				ticket.setNumber(rs.getString(1));
				ticket.setPrice(rs.getInt(2));
				ticket.setAmount(rs.getInt(3));
				list.add(ticket);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
