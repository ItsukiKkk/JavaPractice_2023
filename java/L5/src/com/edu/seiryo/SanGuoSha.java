package com.edu.seiryo;

import java.util.Scanner;
public class SanGuoSha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Heros []hero = new Heros[6];
		 hero[0] = new Heros(1,"刘备",4,"仁德");
		 hero[1] = new Heros(2,"赵云",4,"龙胆");
		 hero[2] = new Heros(3,"曹操",4,"奸雄");
		 hero[3] = new Heros(4,"夏侯惇",4,"刚烈");
		 hero[4] = new Heros(5,"孙权",4,"制衡");
		 hero[5] = new Heros(6,"周瑜",3,"反间");
		System.out.println("欢迎来到迷你版三国杀");
		System.out.println("-------------------");
		System.out.println("三国杀是一款以三国为背景的桌游");
		System.out.println("迷你版三国杀是一款以Java控制台游戏的程序");
		System.out.println("-----武将列表-----");
		for(int i = 0; i<hero.length; i++){
			System.out.println(hero[i].getIndex()+"."+hero[i].getName()+"\t血量："+hero[i].getHp()+"\t技能："+hero[i].getSkill());
		}
		
		int index1,index2;
		do {
			System.out.println("请输入你的武将序号");
			index1 = sc.nextInt();
			boolean ifHave = false;
			for(int i = 0; i<hero.length; i++){
				if(hero[i].getIndex() == index1){
					System.out.println("你选择了"+hero[i].getName()+"进入游戏");
					ifHave = true;
					break;
				}
			}
			if(!ifHave){
				System.out.println("不存在该武将,请重新输入");
				continue;
			}
			break;
		} while (true);
		do {
			System.out.println("请输入你对手的武将序号");
			 index2 = sc.nextInt();
			boolean ifHave = false;
			for(int i = 0; i<hero.length; i++){
				if(hero[i].getIndex() == index2){
					System.out.println("你的对手选择了"+hero[i].getName()+"进入游戏");
					ifHave = true;
					break;
				}
			}
			if(!ifHave){
				System.out.println("不存在该武将,请重新输入");
				continue;
			}
			break;
		} while (true);
		System.out.println("-----------------------------");
		//第一次发牌
		System.out.println("发牌给玩家");
		hero[index1-1].getCard(4,true);
		System.out.println("发牌给对手");
		hero[index2-1].getCard(4,true);
		//第二次发牌，我的回合
		hero[index1-1].getCard(2,false);
		System.out.println(hero[index1-1].getName()+"摸了两张手牌");
		System.out.print(hero[index1-1].getName()+"的手牌有：");
		//输出所有牌信息
		hero[index1-1].printCardInfo();
		System.out.println("请输入要出牌的序号（0为弃牌）");
		int playNumber = sc.nextInt();
		//实现我的出牌功能
		hero[index1-1].myPlay(playNumber,hero[index1-1],hero[index2-1]);
		//第二次发牌，对手回合
		hero[index2-1].getCard(2,false);
		System.out.println(hero[index2-1].getName()+"摸了两张手牌");
		//实现自动出牌功能
		hero[index2-1].autoPlay(hero[index1-1],hero[index2-1]);
		System.out.println("玩家（"+hero[index1-1].getName()+")血量"+hero[index1-1].getHp());
		System.out.println("对手（"+hero[index2-1].getName()+")血量"+hero[index2-1].getHp());
		if(hero[index1-1].getHp() > hero[index2-1].getHp()){
			System.out.println("你获胜");
		}else if(hero[index1-1].getHp() < hero[index2-1].getHp()){
			System.out.println("对手获胜");
		}else{
			System.out.println("平局");
		}
	}
}
