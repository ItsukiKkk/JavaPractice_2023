package com.edu.seiryo.dao;
import com.edu.seiryo.daoImp.CommodityDaoImp;
import com.edu.seiryo.entity.Commodity;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.edu.seiryo.util.DBUtil;

public class CommodityDao implements CommodityDaoImp {
	private ResultSet rs = null;
	/*
	 * 返回Commodity的list
	 * @return list
	 */
	public List<Commodity> showAll(){
		Commodity commodity = null;
		List<Commodity> list = new ArrayList<Commodity>();
		String sql = "select Commodity_Id,Commodity_name,Commodity_info,Commodity_price,"
				+ "Commodity_number from Commodity_Info";
		try {
			rs = DBUtil.executeQuery(sql);
			while(rs.next()){
				commodity = new Commodity();
				commodity.setCommodity_Id(rs.getInt(1));
				commodity.setCommodity_name(rs.getString(2));
				commodity.setCommodity_info(rs.getString(3));
				commodity.setCommodity_price(rs.getDouble(4));
				commodity.setCommodity_number(rs.getInt(5));
				list.add(commodity);
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
	 * 检查有无该序号
	 */
	public boolean queryById(int id ){
		ResultSet rSet = null;
		boolean bo = false;
		String sql = "select * from Commodity_Info where Commodity_Id = ?";
		try {
			rSet = DBUtil.executeQuery(sql, id);
			bo = rSet.next();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/*
	 * 检查剩余数量
	 */
	public int hasLeft(int id){
		ResultSet rSet = null;
		int amount = 0;
		String sql = "select Commodity_number from Commodity_Info where Commodity_Id = ?";
		try {
			rSet = DBUtil.executeQuery(sql, id);
			if (rSet.next()) {
				amount = rSet.getInt(1);
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
		return amount;
	}
	/*
	 * 购买后数量减少
	 */
	public boolean fruitReduction(int id ,int number){
		int amountNow = hasLeft(id) - number;
		String sql = "update Commodity_Info set Commodity_number = ? where Commodity_Id = ?";
		boolean bo = false;
		try {
			bo = DBUtil.executeUpdate(sql, amountNow, id);
			if(bo){
				addToCar(id, number);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 * 将已购买水果信息到储存在list
	 * 这个是算购物车的还是商品的？
	 */
	private List<Commodity> list = new ArrayList<Commodity>();
	public List<Commodity> addToCar(int id ,int number){
		Commodity commodity = new Commodity();
		commodity.setCommodity_Id(id);
		commodity.setCommodity_number(number);
		list.add(commodity);
		return list;
	}
}
