package com.seiryo.edu.service.imp;

import java.util.List;

import com.seiryo.edu.entity.Order;
import com.seiryo.edu.entity.Users;

public interface OrderServiceImp {
	public boolean insertOrder(Order order);
	public List<Order> queryOrder();
	//按user查找数据并显示（用户界面）
	public List<Order> queryByUser();
	public List<Order> queryById(String order_id);
	public boolean cancelStatus(String order_id,String status);
	//删除订单
	public boolean deleteOrder(String order_id);
	//按订单号查找数据并显示(user界面)
	public List<Order> queryByIdUser(String order_id);
}
