package com.seiryo.edu.service.imp;

import java.util.List;

import com.seiryo.edu.entity.Menu;

public interface MenuServiceImp {
	//�����Ʒ
	public boolean insertMenu(Menu menu);
	//��ѯ���в�Ʒ
	public List<Menu> queryAll();
	//�༭�˵�
	boolean editMenu(int menu_id, String name, String descrbe, String unit_price);
	public List<Menu> furryQueryMenu(String name, int minPrice, int maxPrice);
	//ɾ���˵�
	boolean deleteMenu(int menu_id);
}
