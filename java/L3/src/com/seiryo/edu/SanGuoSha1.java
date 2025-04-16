package com.seiryo.edu;
import java.util.Scanner;
public class SanGuoSha1 {
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
		System.out.println("请输入你的武将序号");
		boolean ifHave;
		do {
			int index = sc.nextInt();
			ifHave = false;
			switch(index){
				case 1:
					System.out.println("你选择了刘备进行游戏");
					break;
				case 2:
					System.out.println("你选择了赵云进行游戏");
					break;
				case 3:
					System.out.println("你选择了曹操进行游戏");
					break;
				case 4:
					System.out.println("你选择了夏侯惇进行游戏");
					break;
				case 5:
					System.out.println("你选择了孙权进行游戏");
					break;
				case 6:
					System.out.println("你选择了周瑜进行游戏");
					break;
				default:
					System.out.println("不存在该武将,请重新输入");
					ifHave = true;
			}
		} while (ifHave);
		
	}
}
