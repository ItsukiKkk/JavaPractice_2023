package com.seiryo.edu.service;

import java.util.List;

import com.seiryo.edu.dao.MenuDao;
import com.seiryo.edu.dao.imp.MenuDaoImp;
import com.seiryo.edu.entity.Menu;
import com.seiryo.edu.service.imp.MenuServiceImp;

public class MenuService implements MenuServiceImp{
	private MenuDaoImp dao = new MenuDao();
	static private int deleteId;
	
	public static int getDeleteId() {
		return deleteId;
	}
	public static void setDeleteId(int deleteId) {
		MenuService.deleteId = deleteId;
	}
	//储存菜品
	public boolean insertMenu(Menu menu){
		boolean bo = dao.insertMenu(menu);
		return bo;
	};
	//查询所有菜品
	public List<Menu> queryAll(){
		List<Menu> list = dao.queryAll();
		return list;
	}
	@Override
	public List<Menu> furryQueryMenu(String name, int minPrice, int maxPrice) {
		List<Menu> list = dao.furryQueryMenu(name, minPrice, maxPrice);
		return list;
	};
	//删除菜单
	public boolean deleteMenu(int menu_id){
		boolean bo = dao.deleteMenu(menu_id);
		return bo;
	}
	@Override
	public boolean editMenu(int menu_id, String name, String descrbe,
			String unit_price) {
		boolean bo = dao.editMenu(menu_id, name, descrbe, unit_price);
		return bo;
	};
	
}
