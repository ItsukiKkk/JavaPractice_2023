package com.edu.seiryo.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.daoImp.CarDaoImp;
import com.edu.seiryo.entity.Car;
import com.edu.seiryo.entity.Commodity;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.DBUtil;

public class CarDao implements CarDaoImp{
	private ResultSet rs = null;
	private CommodityDao commodityDao = new CommodityDao();
	private UserDao userDao = new UserDao();
	/*
	 * addToCar添加到数据库
	 */
	public boolean addToCar(int id ,int number){
		boolean bo = false;
		List<Commodity> list = commodityDao.addToCar(id, number);
		User iUser = userDao.iUser();
		int user_Id = iUser.getUser_Id();
		String sql = "insert into Car_Info(Car_Commodity_Id,Car_Commodity_number,Car_user_Id)"
				+ "values(?,?,?)";
		try {
			for(Commodity cmd: list){
				bo = DBUtil.executeUpdate(sql, cmd.getCommodity_Id(), cmd.getCommodity_number(), user_Id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 * 返回购物车有商品信息
	 */
	public List<Car> returnCarInfo(){
		User iUser = userDao.iUser();
		Car car = null;
		List<Car> list  = new ArrayList<Car>();
		String sql = "select c.Car_Id,m.Commodity_name,c.Car_Commodity_number,m.Commodity_price,m.Commodity_price*c.Car_Commodity_number from Car_Info c, Commodity_Info m, User_Info u where u.User_Id = c.Car_user_Id and c.Car_Commodity_Id = m.Commodity_Id and User_Id = ?";
		try {
			rs = DBUtil.executeQuery(sql, iUser.getUser_Id());
			while(rs.next()){
				car = new Car();
				car.setCar_Id(rs.getInt(1));
				car.setCar_Commodity_Name(rs.getString(2));
				car.setCar_Commodity_number(rs.getInt(3));
				car.setUnitPrice(rs.getDouble(4));
				car.setTotalPrice(rs.getDouble(5));
				list.add(car);
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
	 * 有相同的商品指更新数量
	 */
	@Override
	public boolean updateCar(int hadId, int number) {
		boolean bo = false;
		String sql = "update Car_Info set Car_Commodity_number = ? where Car_Commodity_Id = ?";
		try {
			bo = DBUtil.executeUpdate(sql, number,hadId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 *清空购物车
	 */
	@Override
	public boolean clear() {
		boolean bo = false;
		String sql = "delete from Car_Info";
		try {
			bo = DBUtil.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	
}
