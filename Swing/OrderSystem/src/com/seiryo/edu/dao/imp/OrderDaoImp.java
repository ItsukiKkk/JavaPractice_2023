package com.seiryo.edu.dao.imp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.seiryo.edu.entity.Order;
import com.seiryo.edu.util.DBUtil;

public interface OrderDaoImp {
	//存入数据库
	public boolean insertOrder(Order order);
	//显示所有信息
	public List<Order> queryOrder();
	//按订单号查找数据并显示(user界面)
	public List<Order> queryByIdUser(String order_id);
	//按订单号查找数据并显示（admin点击时）
	public List<Order> queryById(String order_id);
	//按user查找数据并显示（用户界面）
	public List<Order> queryByUser();
	//修改订单状态
	public boolean cancelStatus(String order_id,String status);
	//删除订单
	public boolean deleteOrder(String order_id);
}
