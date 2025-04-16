package com.seiryo.edu.service.imp;

import java.util.List;

import com.seiryo.edu.entity.OrdersDetail;

public interface OrderDetailServiceImp {
	public boolean insertOrderDetail(OrdersDetail orderDetail) ;
	public List<OrdersDetail> queryDetail();
	//因为外键删除菜单时需要把这个外键删除
	public boolean deleteByMenuId(int menu_id);
	public boolean deleteByOrderId(String order_id);
}
