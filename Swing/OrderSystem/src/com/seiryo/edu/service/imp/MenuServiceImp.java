package com.seiryo.edu.service.imp;

import java.util.List;

import com.seiryo.edu.entity.Menu;

public interface MenuServiceImp {
	//储存菜品
	public boolean insertMenu(Menu menu);
	//查询所有菜品
	public List<Menu> queryAll();
	//编辑菜单
	boolean editMenu(int menu_id, String name, String descrbe, String unit_price);
	public List<Menu> furryQueryMenu(String name, int minPrice, int maxPrice);
	//删除菜单
	boolean deleteMenu(int menu_id);
}
