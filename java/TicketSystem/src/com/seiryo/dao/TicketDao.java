package com.seiryo.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.DBUtil;
import com.seiryo.entity.Ticket;
import com.seiryo.entity.User;

public class TicketDao {
	UserDao userDao = new UserDao();
	/*
	 * 显示总车票
	 */
	private List<Ticket> allTicket = new ArrayList<Ticket>();
	public List<Ticket> queryTicket(){
		ResultSet resultSet = null;
		Ticket ticket = null;
		String sql = "select number,price,amount from ticket";
		try {
			resultSet = DBUtil.executeQuery(sql);
			while(resultSet.next()){
				ticket = new Ticket();
				String number = resultSet.getString(1);
				int price = resultSet.getInt(2);
				int amount = resultSet.getInt(3);
				ticket.setNumber(number);
				ticket.setPrice(price);
				ticket.setAmount(amount);
				allTicket.add(ticket);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allTicket;
	} 
	/*
	 * 按车次查询有无车票
	 */
	public boolean queryByNumber(String number){
		ResultSet rSet = null;
		boolean bo = false;
		String sql = "select id from ticket where number = ?";
		try {
			rSet = DBUtil.executeQuery(sql, number);
			bo = rSet.next();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/*
	 * 检查该车次ticket中剩余车票数量
	 */
	public int hasLeft(String number){
		ResultSet rSet = null;
		int amount = 0;
		String sql = "select amount from ticket where number = ?";
		try {
			rSet = DBUtil.executeQuery(sql, number);
			if (rSet.next()) {
				amount = rSet.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return amount;
	}
	/*
	 * 将已购买车票信息到储存在list
	 * list传到order(这里的是买(输入order)的amount)
	 */
	private List<Ticket> list = new ArrayList<Ticket>();
	public List<Ticket> addToOrder(String number,int amount){
		ResultSet rSet = null;
		Ticket ticket = null;
		String sql = "select id,number,price,amount from ticket where number = ?";
		try {
			rSet = DBUtil.executeQuery(sql, number);
			if (rSet.next()) {
				ticket = new Ticket();
				int price = rSet.getInt(3) * amount;
				ticket.setNumber(number);
				ticket.setAmount(amount);
				ticket.setPrice(price);                 
				list.add(ticket);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	/*
	 * 购买后ticket数量减少(这里的是ticket剩的amount)
	 */
	public boolean ticketReduction(String number,int amount){
		int amountNow = hasLeft(number) - amount;
		String sql = "update ticket set amount = ? where number = ?";
		boolean bo = false;
		try {
			bo = DBUtil.executeUpdate(sql, amountNow, number);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
}
