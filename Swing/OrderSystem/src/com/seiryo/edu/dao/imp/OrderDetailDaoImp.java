package com.seiryo.edu.dao.imp;

import java.util.List;

import com.seiryo.edu.entity.OrdersDetail;

public interface OrderDetailDaoImp {
	//���㰴ťʱ���detail
	public boolean insertOrderDetail(OrdersDetail orderDetail) ;
	//ͨ�������orderid��ѯ
	public List<OrdersDetail> queryDetail(String order_id);
	//��Ϊ���ɾ���˵�ʱ��Ҫ��detail���ɾ��
	//ͨ��menu_idɾ��
	public boolean deleteByMenuId(int menu_id);
	//ͨ��order_idɾ��
	public boolean deleteByOrderId(String order_id);
}
