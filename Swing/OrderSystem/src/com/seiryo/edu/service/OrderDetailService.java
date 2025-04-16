package com.seiryo.edu.service;

import java.util.List;

import com.seiryo.edu.dao.OrderDetailDao;
import com.seiryo.edu.dao.imp.OrderDetailDaoImp;
import com.seiryo.edu.entity.OrdersDetail;
import com.seiryo.edu.service.imp.OrderDetailServiceImp;

public class OrderDetailService implements OrderDetailServiceImp {
	private OrderDetailDaoImp de = new OrderDetailDao();
	public boolean insertOrderDetail(OrdersDetail orderDetail){
		boolean bo = de.insertOrderDetail(orderDetail);
		return bo;
	} 
	public List<OrdersDetail> queryDetail(String order_id){
		List<OrdersDetail> bo = de.queryDetail(order_id);
		return bo;
	}
	@Override
	public List<OrdersDetail> queryDetail() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean deleteByMenuId(int menu_id) {
		boolean bo = de.deleteByMenuId(menu_id);
		return bo;
	}
	@Override
	public boolean deleteByOrderId(String order_id) {
		boolean bo = de.deleteByOrderId(order_id);
		return bo;
	};
}
