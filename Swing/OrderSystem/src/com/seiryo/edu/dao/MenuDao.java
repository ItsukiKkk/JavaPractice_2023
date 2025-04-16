package com.seiryo.edu.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.seiryo.edu.dao.imp.MenuDaoImp;
import com.seiryo.edu.entity.Menu;
import com.seiryo.edu.util.DBUtil;

public class MenuDao implements MenuDaoImp{
	ResultSet rs = null;
	/*
	 * �����Ʒ
	 * @param Menu menu
	 * @return boolean
	 */
	public boolean insertMenu(Menu menu){
		boolean bo = false;
		String sql = "insert Menu(name,descrbe,unit_price) values(?,?,?)";
		try {
			bo = DBUtil.executeUpdate(sql, menu.getName(),menu.getDescribe(),menu.getUnit_price());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 * ��ѯ���в�Ʒ
	 * @return List<Menu>
	 */
	public List<Menu> queryAll(){
		List<Menu> list = new ArrayList<Menu>();
		String sql = "select menu_id,name,descrbe,unit_price from Menu";
		Menu menu = null;
		try {
			rs = DBUtil.executeQuery(sql);
			while(rs.next()){
				menu =  new Menu();
				menu.setMenu_id(rs.getInt(1));
				menu.setName(rs.getString(2));
				menu.setDescribe(rs.getString(3));
				menu.setUnit_price(rs.getInt(4));
				list.add(menu);	
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
	 * ���ײ����ƽ���ģ����ѯ
	 * @param String name, int minPrice,int maxPrice
	 * @return List<Menu>
	 */
	public List<Menu> furryQueryMenu(String name, int minPrice,int maxPrice) {
		List<Menu> list = new ArrayList();
		ResultSet rs = null;
		Menu menu = null;
		String sql = "select menu_id,name,descrbe,unit_price from Menu where 1=1";
		if(!"".equals(name)){
			sql += "and name like '%"+name+"%'";
		}
		if(minPrice != 0){
			sql += "and unit_price >= "+minPrice+"";
		}
		if(maxPrice != 0){
			sql += "and unit_price <= "+maxPrice+"";
		}
		try {
			rs = DBUtil.executeQuery(sql);
			while(rs.next()){
				menu =  new Menu();
				menu.setMenu_id(rs.getInt(1));
				menu.setName(rs.getString(2));
				menu.setDescribe(rs.getString(3));
				menu.setUnit_price(rs.getInt(4));
				list.add(menu);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	/*
	 * �༭�˵�
	 * @param int menu_id,String name,String describe,String unit_price
	 * @return boolean
	 */
	@Override
	public boolean editMenu(int menu_id,String name,String describe,String unit_price ) {
		boolean bo = false;
		String sql = "update Menu set name = ?,descrbe = ?,unit_price = ? where menu_id = ?";
		try {
			bo = DBUtil.executeUpdate(sql,name,describe,unit_price,menu_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 * ɾ���˵�@param Menu menu
	 * @return boolean
	 */
	@Override
	public boolean deleteMenu(int menu_id) {
		boolean bo = false;
		String sql = "delete from Menu where menu_id = ?";
		try {
			bo = DBUtil.executeUpdate(sql, menu_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
}
