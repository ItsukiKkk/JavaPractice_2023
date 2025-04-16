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
		System.out.println("---------------��ӭ����ĳ�������---------------");
		System.out.println("1.�鿴��Ʒ");
		System.out.println("2.������Ʒ");
		System.out.println("3.�鿴���ﳵ");
		System.out.println("4.�鿴������Ϣ");
		System.out.println("5.������һ��");
		System.out.println("ѡ������Ҫ�ķ���");
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
		System.out.println("�������������ѡ��");
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
			System.out.println("��Ʒ��ţ�"+id+"\t���ƣ�"+ name +"\t���ۣ�"+unitPrice+
					"\t������"+number);
		}
		main();
		return;
	}
	private void buySomeThing(){
		System.out.println("�����빺�����Ʒ����ţ�:");
		int id = sc.nextInt();
		boolean hadId = service.queryById(id);
		if(!hadId){
			System.out.println("�����������������");
			buySomeThing();
			return;
		}
		System.out.println("�����빺�������:");
		int number = sc.nextInt();
		int hasLeft = service.hasLeft(id);
		if (hasLeft < number) {
			System.out.println("������������������");
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
				System.out.println("����ɹ�");
			}
			boolean boo = true;
			do {
				System.out.println("������Ҫ����ʲô������[y/n]");
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
					System.out.println("������ѡ��");
				}
			} while (boo);
		}
	}
	private String printVip(){
		int userVip = userService.iUser().getUser_vip();
		String aString = null;
		if (userVip == 0) {
			aString = "��ͨ��Ա";
		}
		if (userVip == 1) {
			aString = "������Ա";
		}
		if (userVip == 2) {
			aString = "�ƽ��Ա";
		}
		if (userVip == 3) {
			aString = "�׽��Ա";
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
		System.out.println("---------------�ҵĹ��ﳵ---------------");
		double total = 0;
		for(Car car :list){
			int id = car.getCar_Id();
			String name = car.getCar_Commodity_Name();
			int number = car.getCar_Commodity_number();
			double unitPrice = car.getUnitPrice();
			double totalPrice = car.getTotalPrice();
			total += totalPrice;
			System.out.println("��ţ�"+id+"\t��Ʒ����"+name+"\t������"+number+"\t���ۣ�"+
					unitPrice+"\t�ܼۣ�"+totalPrice);
		}
		String vipInfo = printVip();
		System.out.println(vipInfo);
		System.out.println("�ܼ۸�:"+total);
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String day = simpleDateFormat.format(date);
		System.out.println("��ǰʱ�䣺"+day);
		System.out.println("------------------------------");
		System.out.println("1.��չ��ﳵ��ȫ������");
		System.out.println("2.������һ��");
		System.out.println("��ѡ��");
		int choose = sc.nextInt();
		if(choose == 1){
			boolean hadClear = carService.clear();
			if (hadClear) {
				if(userService.iUser().getUser_Money() < total){
					System.out.println("�û����㣬���ܹ���");
					main();
					return;
				}
				String vipStr = "";
				int vip = 0;
				if(total > 500){
					vip = 1;
					vipStr = "���ѳ���500";
				}
				if(total > 1500){
					vip = 2;
					vipStr = "���ѳ���1500";
				}
				if(total > 3000){
					vip = 3;
					vipStr = "���ѳ���3000";
				}
				double discount = discountVip();
				double balance = (userService.iUser().getUser_Money() - total) * discount;
				boolean changBalance = userService.changeBalance(userService.iUser().getUser_Id(), balance);
				if(changBalance){
					if(userService.iUser().getUser_vip() < vip){
						userService.changIuserVip(balance, vip);
						System.out.println("��ϲ����ɹ�!"+ vipStr+"���"+ printVip());
						userService.changeVip(userService.iUser().getUser_Id(), vip);
					}else{
						System.out.println("��ϲ����ɹ�!");
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
		System.out.println("�����������������");
		myCar();
		return;
	}
	/*
	 * ��ʾ������Ϣ
	 */
	private void userInfo(){
		System.out.println("�𾴵�"+userService.iUser().getUser_Name()+"�û���������Ϣ���£�");
		String vip = printVip();
		double discount = discountVip() * 100;
		System.out.println("��Ա��"+vip+"("+discount+"��)");
		System.out.println("�˺ţ�"+userService.iUser().getUser_Name());
		System.out.println("�ֻ��ţ�"+userService.iUser().getUser_phone());
		System.out.println("ʣ���"+userService.iUser().getUser_Money());
		main();
		return;
	}
//	public static void main(String[] args) {
//		new CommodityService().main();
//	}
}
