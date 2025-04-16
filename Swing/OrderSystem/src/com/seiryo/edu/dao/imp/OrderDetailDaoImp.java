package com.seiryo.edu.dao.imp;

import java.util.List;

import com.seiryo.edu.entity.OrdersDetail;

public interface OrderDetailDaoImp {
	//结算按钮时添加detail
	public boolean insertOrderDetail(OrdersDetail orderDetail) ;
	//通过点击的orderid查询
	public List<OrdersDetail> queryDetail(String order_id);
	//因为外键删除菜单时需要把detail外键删除
	//通过menu_id删除
	public boolean deleteByMenuId(int menu_id);
	//通过order_id删除
	public boolean deleteByOrderId(String order_id);
}
