package com.seiryo.edu.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.seiryo.edu.dao.imp.OrderDaoImp;
import com.seiryo.edu.entity.Menu;
import com.seiryo.edu.entity.Order;
import com.seiryo.edu.util.DBUtil;

public class OrderDao implements OrderDaoImp{
	private UserDao uDao = new UserDao();
	/*
	 * 存入数据库
	 * @param Order order
	 * @return boolean
	 */
	@Override
	public boolean insertOrder(Order order) {
		boolean bo = false;
		String sql = "insert Orders(order_id,quantity,total_price,order_status,userId) values(?,?,?,?,?)";
		try {
			bo = DBUtil.executeUpdate(sql, order.getOrder_id(), order.getQuantity(), 
					order.getTotal_price(), order.getOrder_status(), uDao.iUser().getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 * 显示所有信息(admin界面)
	 * @return List<Order>
	 */
	@Override
	public List<Order> queryOrder() {
		ResultSet rs = null;
		List<Order> list = new ArrayList<Order>();
		String sql = "select order_id,quantity,total_price,order_status,userId from orders";
		Order order = null;
		try {
			rs = DBUtil.executeQuery(sql);
			while(rs.next()){
				order =  new Order();
				order.setOrder_id(rs.getString(1));
				order.setQuantity(rs.getInt(2));
				order.setTotal_price(rs.getInt(3));
				order.setOrder_status(rs.getString(4));
				order.setUserId(rs.getInt(5));
				list.add(order);	
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
	};
	/*
	 * 按订单号查找数据并显示(admin界面)
	 * @param String order_id
	 * @return List<Order>
	 */
	public List<Order> queryById(String order_id){
		ResultSet rs = null;
		Order order = null;
		List<Order> list = new ArrayList<Order>();
		String sql = "select order_id,quantity,total_price,order_status from orders where order_id like '%"+order_id+"%'";
		try {
			rs = DBUtil.executeQuery(sql);
			while(rs.next()){
				order =  new Order();
				order.setOrder_id(rs.getString(1));
				order.setQuantity(rs.getInt(2));
				order.setTotal_price(rs.getInt(3));
				order.setOrder_status(rs.getString(4));
				list.add(order);	
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
	 * 按订单号查找数据并显示(user界面)
	 * @param String order_id
	 * @return List<Order>
	 */
	public List<Order> queryByIdUser(String order_id){
		ResultSet rs = null;
		Order order = null;
		List<Order> list = new ArrayList<Order>();
		String sql = "select order_id,quantity,total_price,order_status from orders where order_id like '%"+order_id+"%' and userId = ?";
		try {
			rs = DBUtil.executeQuery(sql,uDao.iUser().getId());
			while(rs.next()){
				order =  new Order();
				order.setOrder_id(rs.getString(1));
				order.setQuantity(rs.getInt(2));
				order.setTotal_price(rs.getInt(3));
				order.setOrder_status(rs.getString(4));
				list.add(order);	
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
	 * 用户取消订单改变订单状态
	 * @param String order_id,String status
	 * @return boolean
	 */
	public boolean cancelStatus(String order_id,String status){
		boolean bo = false;
		String sql = "update Orders set order_status = ? where order_id = ?";
		try {
			bo = DBUtil.executeUpdate(sql,status,order_id);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 * 通过点击的orderid删除订单
	 * @param String order_id
	 * @return boolean
	 */
	public boolean deleteOrder(String order_id) {
		boolean bo = false;
		String sql = "delete from orders where order_id = ?";
		try {
			bo = DBUtil.executeUpdate(sql, order_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 * 按订单号查找数据并显示(user界面)
	 * @return List<Order>
	 */
	@Override
	public List<Order> queryByUser() {
		ResultSet rs = null;
		Order order = null;
		List<Order> list = new ArrayList<Order>();
		String sql = "select order_id,quantity,total_price,order_status from orders where 	userId = ?";
		try {
			rs = DBUtil.executeQuery(sql,uDao.iUser().getId());
			while(rs.next()){
				order =  new Order();
				order.setOrder_id(rs.getString(1));
				order.setQuantity(rs.getInt(2));
				order.setTotal_price(rs.getInt(3));
				order.setOrder_status(rs.getString(4));
				list.add(order);	
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
}
