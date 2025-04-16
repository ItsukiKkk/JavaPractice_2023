package com.edu.seiryo.main;

import com.edu.seiryo.service.CommodityService;
import com.edu.seiryo.service.UserService;
import com.edu.seiryo.serviceImp.CommodityServiceImp;
import com.edu.seiryo.serviceImp.UserServiceImp;

public class Test {
	public static void main(String[] args) {
		UserServiceImp user = new UserService();
		CommodityServiceImp commodity = new CommodityService();
		boolean ifLoginSuccess = user.main();
		if(ifLoginSuccess){
			commodity.main();
			return;
		}
	}
}
