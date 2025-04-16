package com.seiryo.edu.service.imp;

import java.util.List;

import com.seiryo.edu.entity.Order;
import com.seiryo.edu.entity.Users;

public interface OrderServiceImp {
	public boolean insertOrder(Order order);
	public List<Order> queryOrder();
	//��user�������ݲ���ʾ���û����棩
	public List<Order> queryByUser();
	public List<Order> queryById(String order_id);
	public boolean cancelStatus(String order_id,String status);
	//ɾ������
	public boolean deleteOrder(String order_id);
	//�������Ų������ݲ���ʾ(user����)
	public List<Order> queryByIdUser(String order_id);
}
