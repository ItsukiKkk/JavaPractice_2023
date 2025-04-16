package com.seiryo.edu.dao.imp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.seiryo.edu.entity.Order;
import com.seiryo.edu.util.DBUtil;

public interface OrderDaoImp {
	//�������ݿ�
	public boolean insertOrder(Order order);
	//��ʾ������Ϣ
	public List<Order> queryOrder();
	//�������Ų������ݲ���ʾ(user����)
	public List<Order> queryByIdUser(String order_id);
	//�������Ų������ݲ���ʾ��admin���ʱ��
	public List<Order> queryById(String order_id);
	//��user�������ݲ���ʾ���û����棩
	public List<Order> queryByUser();
	//�޸Ķ���״̬
	public boolean cancelStatus(String order_id,String status);
	//ɾ������
	public boolean deleteOrder(String order_id);
}
