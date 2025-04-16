package com.edu.seiryo.daoImp;

import java.util.List;

import com.edu.seiryo.entity.Commodity;

public interface CommodityDaoImp {
	public List<Commodity> showAll();
	public boolean queryById(int id);
	public int hasLeft(int id);
	public boolean fruitReduction(int id ,int number);
	public List<Commodity> addToCar(int id ,int number);
}
