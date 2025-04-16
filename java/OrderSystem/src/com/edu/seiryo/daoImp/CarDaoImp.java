package com.edu.seiryo.daoImp;

import java.util.List;

import com.edu.seiryo.entity.Car;

public interface CarDaoImp {
	public boolean addToCar(int id ,int number);
	public boolean updateCar(int id,int number);
	public List<Car> returnCarInfo();
	public boolean clear();
}
