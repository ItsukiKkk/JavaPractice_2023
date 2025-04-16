package com.seiryo.edu.dao;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.seiryo.edu.dao.imp.OrderDetailDaoImp;
import com.seiryo.edu.entity.Menu;
import com.seiryo.edu.entity.OrdersDetail;
import com.seiryo.edu.util.DBUtil;

public class OrderDetailDao implements OrderDetailDaoImp{
	/*
	 * 结算按钮时添加detail
	 * @param String order_id
	 * @return boolean
	 */
	@Override
	public boolean insertOrderDetail(OrdersDetail orderDetail) {
		boolean bo = false;
		String sql = "insert detail(order_id,menu_id,amount) values(?,?,?)";
		try {
			bo = DBUtil.executeUpdate(sql, orderDetail.getOrder_id(), orderDetail.getMenu_id(), orderDetail.getAmount());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 * 通过点击的orderid查询
	 * @param String order_id
	 * @return List<OrdersDetail>
	 */
	@Override
	public List<OrdersDetail> queryDetail(String order_id) {
		ResultSet rs = null;
		List<OrdersDetail> list = new ArrayList<OrdersDetail>();
		String sql = "select m.menu_id,m.name,d.amount,m.unit_price from detail d,Menu m,orders o where m.menu_id = d.menu_id and d.order_id = o.order_id and o.order_id = ?";
		OrdersDetail dt = null;
		try {
			rs = DBUtil.executeQuery(sql, order_id);
			while(rs.next()){
				dt =  new OrdersDetail();
				dt.setMenu_id(rs.getInt(1));
				dt.setName(rs.getString(2));
				dt.setAmount(rs.getInt(3));
				dt.setUnit_price(rs.getInt(4));
				dt.setTotal_price(rs.getInt(4)*rs.getInt(3));
				list.add(dt);	
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
	 * 通过menu_id删除
	 * @param int menu_id
	 * @return boolean
	 */
	@Override
	public boolean deleteByMenuId(int menu_id) {
		boolean bo = false;
		String sql = "delete from detail where menu_id = ?";
		try {
			bo = DBUtil.executeUpdate(sql, menu_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 * 通过order_id删除
	 * @param String order_id
	 * @return boolean
	 */
	@Override
	public boolean deleteByOrderId(String order_id) {
		boolean bo = false;
		String sql = "delete from detail where order_id = ?";
		try {
			bo = DBUtil.executeUpdate(sql, order_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	
}
