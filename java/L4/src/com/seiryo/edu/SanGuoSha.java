package com.seiryo.edu;
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
			System.out.println(hero[i].index+"."+hero[i].name+"\t血量："+hero[i].hp+"\t技能："+hero[i].skill);
		}
		
		int index1,index2;
		do {
			System.out.println("请输入你的武将序号");
			index1 = sc.nextInt();
			boolean ifHave = false;
			for(int i = 0; i<hero.length; i++){
				if(hero[i].index == index1){
					System.out.println("你选择了"+hero[i].name+"进入游戏");
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
				if(hero[i].index == index2){
					System.out.println("你的对手选择了"+hero[i].name+"进入游戏");
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
		System.out.println("发牌给玩家");
		hero[index1].getCard();
		System.out.println("发牌给对手");
		hero[index2].getCard();
	}
}
