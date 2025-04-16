package com.seiryo.edu.service;

import java.util.List;

import com.seiryo.edu.dao.OrderDao;
import com.seiryo.edu.dao.imp.OrderDaoImp;
import com.seiryo.edu.entity.Order;
import com.seiryo.edu.entity.Users;
import com.seiryo.edu.service.imp.OrderServiceImp;

public class OrderService implements OrderServiceImp{
	OrderDaoImp dao = new OrderDao();
	public boolean insertOrder(Order order){
		boolean bo = dao.insertOrder(order);
		return bo;
	}
	@Override
	public List<Order> queryOrder() {
		List<Order> list = dao.queryOrder();
		return list;
	};
	public List<Order> queryById(String order_id){
		List<Order> bo = dao.queryById(order_id);
		return bo;
	};
	public boolean cancelStatus(String order_id,String status){
		boolean bo = dao.cancelStatus(order_id,status);
		return bo;
	}
	@Override
	public boolean deleteOrder(String order_id) {
		boolean bo = dao.deleteOrder(order_id);
		return bo;
	}
	@Override
	public List<Order> queryByUser() {
		List<Order> list = dao.queryByUser();
		return list;
	}
	@Override
	public List<Order> queryByIdUser(String order_id) {
		List<Order> list = dao.queryByIdUser(order_id);
		return list;
	};
}
