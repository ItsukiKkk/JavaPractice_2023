package com.edu.seiryo.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.edu.seiryo.dao.CarDao;
import com.edu.seiryo.dao.CommodityDao;
import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.daoImp.CarDaoImp;
import com.edu.seiryo.daoImp.CommodityDaoImp;
import com.edu.seiryo.daoImp.UserDaoImp;
import com.edu.seiryo.entity.Car;
import com.edu.seiryo.entity.Commodity;
import com.edu.seiryo.serviceImp.CommodityServiceImp;
import com.edu.seiryo.serviceImp.UserServiceImp;
public class CommodityService implements CommodityServiceImp{
	Scanner sc = new Scanner(System.in);
	CommodityDaoImp service = new CommodityDao();
	CarDaoImp carService = new CarDao();
	UserDaoImp userService = new UserDao() ;
	public void main(){
		System.out.println("---------------欢迎来到某宝购物店---------------");
		System.out.println("1.查看商品");
		System.out.println("2.购买商品");
		System.out.println("3.查看购物车");
		System.out.println("4.查看个人信息");
		System.out.println("5.返回上一层");
		System.out.println("选择您需要的服务");
		int choose = sc.nextInt();
		if(choose == 1){
			checkAllFruit();
			return;
		}
		if(choose == 2){
			buySomeThing();
			return;
		}
		if(choose == 3){
			myCar();
			return;
		}
		if(choose == 4){
			userInfo();
			return;
		}
		if(choose == 5){
			UserServiceImp us = new UserService();
			us.main();
			return;
		}
		System.out.println("输入错误请重新选择");
		main();
		return;
	}
	private void checkAllFruit(){
		List<Commodity> list = service.showAll();
		for(Commodity commodity :list){
			int id = commodity.getCommodity_Id();
			String name = commodity.getCommodity_name();
			double unitPrice = commodity.getCommodity_price();
			int number = commodity.getCommodity_number();
			System.out.println("物品序号："+id+"\t名称："+ name +"\t单价："+unitPrice+
					"\t数量："+number);
		}
		main();
		return;
	}
	private void buySomeThing(){
		System.out.println("请输入购买的商品（序号）:");
		int id = sc.nextInt();
		boolean hadId = service.queryById(id);
		if(!hadId){
			System.out.println("输入错误请重新输入");
			buySomeThing();
			return;
		}
		System.out.println("请输入购买的数量:");
		int number = sc.nextInt();
		int hasLeft = service.hasLeft(id);
		if (hasLeft < number) {
			System.out.println("余量不足请重新输入");
			buySomeThing();
			return;
		}
		boolean success = service.fruitReduction(id, number);
		if(success){
			boolean hadSame = false;
			List<Car> list = carService.returnCarInfo();
			if(list == null){
				carService.addToCar(id, number);
			}else{
				for(Car car: list){
					hadSame = car.getCar_Id() == id? true:false;
				}
				service.addToCar(id, number);
				if(!hadSame){
					carService.addToCar(id, number);
				}else{
					carService.updateCar(id, number);
				}
				System.out.println("购买成功");
			}
			boolean boo = true;
			do {
				System.out.println("您还需要购买什么东西吗？[y/n]");
				String judge = sc.next();
				if(judge.equals("n")){
					boo = false;
					main();
					return;
				}else if(judge.equals("y")){
					buySomeThing();
					boo = false;
					return;
				}else{
					System.out.println("请重新选择");
				}
			} while (boo);
		}
	}
	private String printVip(){
		int userVip = userService.iUser().getUser_vip();
		String aString = null;
		if (userVip == 0) {
			aString = "普通会员";
		}
		if (userVip == 1) {
			aString = "白银会员";
		}
		if (userVip == 2) {
			aString = "黄金会员";
		}
		if (userVip == 3) {
			aString = "白金会员";
		}
		return aString;
	}
	private double discountVip(){
		int userVip = userService.iUser().getUser_vip();
		double off = 1;
		if (userVip == 0) {
			off = 1;
		}
		if (userVip == 1) {
			off = 0.98;
		}
		if (userVip == 2) {
			off = 0.95;
		}
		if (userVip == 3) {
			off = 0.9;
		}
		return off;
	}
	private void myCar(){
		 List<Car> list = carService.returnCarInfo();
		System.out.println("---------------我的购物车---------------");
		double total = 0;
		for(Car car :list){
			int id = car.getCar_Id();
			String name = car.getCar_Commodity_Name();
			int number = car.getCar_Commodity_number();
			double unitPrice = car.getUnitPrice();
			double totalPrice = car.getTotalPrice();
			total += totalPrice;
			System.out.println("序号："+id+"\t商品名："+name+"\t数量："+number+"\t单价："+
					unitPrice+"\t总价："+totalPrice);
		}
		String vipInfo = printVip();
		System.out.println(vipInfo);
		System.out.println("总价格:"+total);
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String day = simpleDateFormat.format(date);
		System.out.println("当前时间："+day);
		System.out.println("------------------------------");
		System.out.println("1.清空购物车（全部购买）");
		System.out.println("2.返回上一层");
		System.out.println("请选择");
		int choose = sc.nextInt();
		if(choose == 1){
			boolean hadClear = carService.clear();
			if (hadClear) {
				if(userService.iUser().getUser_Money() < total){
					System.out.println("用户余额不足，不能购买");
					main();
					return;
				}
				String vipStr = "";
				int vip = 0;
				if(total > 500){
					vip = 1;
					vipStr = "消费超过500";
				}
				if(total > 1500){
					vip = 2;
					vipStr = "消费超过1500";
				}
				if(total > 3000){
					vip = 3;
					vipStr = "消费超过3000";
				}
				double discount = discountVip();
				double balance = (userService.iUser().getUser_Money() - total) * discount;
				boolean changBalance = userService.changeBalance(userService.iUser().getUser_Id(), balance);
				if(changBalance){
					if(userService.iUser().getUser_vip() < vip){
						userService.changIuserVip(balance, vip);
						System.out.println("恭喜购买成功!"+ vipStr+"获得"+ printVip());
						userService.changeVip(userService.iUser().getUser_Id(), vip);
					}else{
						System.out.println("恭喜购买成功!");
					}
				}
				main();
				return;
			}
		}
		if(choose == 2){
			main();
			return;
		}
		System.out.println("输入错误请重新输入");
		myCar();
		return;
	}
	/*
	 * 显示个人信息
	 */
	private void userInfo(){
		System.out.println("尊敬的"+userService.iUser().getUser_Name()+"用户，您的信息如下：");
		String vip = printVip();
		double discount = discountVip() * 100;
		System.out.println("会员："+vip+"("+discount+"折)");
		System.out.println("账号："+userService.iUser().getUser_Name());
		System.out.println("手机号："+userService.iUser().getUser_phone());
		System.out.println("剩余金额："+userService.iUser().getUser_Money());
		main();
		return;
	}
//	public static void main(String[] args) {
//		new CommodityService().main();
//	}
}
