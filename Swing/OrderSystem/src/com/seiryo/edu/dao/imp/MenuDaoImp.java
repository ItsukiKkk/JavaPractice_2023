package com.seiryo.edu.dao.imp;

import java.util.*;

import com.seiryo.edu.entity.Menu;
public interface MenuDaoImp {
	//�����Ʒ
	public boolean insertMenu(Menu menu);
	//��ѯ���в�Ʒ
	public List<Menu> queryAll();
	//�༭�˵�
	public boolean editMenu(int menu_id,String name,String descrbe,String unit_price );
	//���ײ����ƽ���ģ����ѯ
	public List<Menu> furryQueryMenu(String name, int minPrice, int maxPrice);
	//ɾ���˵�
	public boolean deleteMenu(int menu_id);
	
}
