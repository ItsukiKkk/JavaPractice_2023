package com.seiryo.edu.dao.imp;

import java.util.*;

import com.seiryo.edu.entity.Menu;
public interface MenuDaoImp {
	//储存菜品
	public boolean insertMenu(Menu menu);
	//查询所有菜品
	public List<Menu> queryAll();
	//编辑菜单
	public boolean editMenu(int menu_id,String name,String descrbe,String unit_price );
	//对套餐名称进行模糊查询
	public List<Menu> furryQueryMenu(String name, int minPrice, int maxPrice);
	//删除菜单
	public boolean deleteMenu(int menu_id);
	
}
