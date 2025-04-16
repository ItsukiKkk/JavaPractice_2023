package com.seiryo.edu;

import java.util.Scanner;

public class Initial {
	//???
	public static Player player = null;
	public static String[][] wujiangArray = new String[6][3];
	static Scanner sc = new Scanner(System.in);
	//开始游戏输出界面
	public static void startGame(){
		System.out.println("欢迎来到迷你版三国杀");
		System.out.println("-------------------");
		System.out.println("三国杀是一款以三国为背景的桌游");
		System.out.println("迷你版三国杀是一款以Java控制台游戏的程序");
		System.out.println("-----武将列表-----");
		wujiangArray[0][0] = "刘备";
		wujiangArray[0][1] = "4";
		wujiangArray[0][2] = "仁德";
		wujiangArray[1][0] = "赵云";
		wujiangArray[1][1] = "4";
		wujiangArray[1][2] = "龙胆";
		wujiangArray[2][0] = "曹操";
		wujiangArray[2][1] = "4";
		wujiangArray[2][2] = "奸雄";
		wujiangArray[3][0] = "夏侯惇";
		wujiangArray[3][1] = "4";
		wujiangArray[3][2] = "刚烈";
		wujiangArray[4][0] = "孙权";
		wujiangArray[4][1] = "4";
		wujiangArray[4][2] = "制衡";
		wujiangArray[5][0] = "周瑜";
		wujiangArray[5][1] = "3";
		wujiangArray[5][2] = "反间";
		for(int i = 0; i<wujiangArray.length; i++){
			System.out.println((i+1)+wujiangArray[i][0]+"\t血量："+wujiangArray[i][1]+"\t技能："+wujiangArray[i][2]);
		}
		System.out.println("======================================");
	}
	//用非静态方法实验：为什么一定要用static方法，不用static方法也可以调用static方法:因为不用初始化方便
	//选择武将 1.存入Character类(为什么现在存而不在一开始存？) 2.存入Player类
	public static void selectWujiang(){
		System.out.println("请输入要选择武将的序号");
		int num = sc.nextInt();
		//存入character
//		for(int i = 0; i<wujiangArray.length; i++){
		Character character = new Character();
		character.setName(wujiangArray[num-1][0]);
		character.setSkill(wujiangArray[num-1][2]);
		character.setMaxhp(Integer.valueOf(wujiangArray[num-1][1]));
//		}
		//存入Player类
		player = new Player();
		player.setCharacter(character);
		player.setType("玩家");
		player.setHp(character.getMaxhp());
		System.out.println("玩家选择"+player.getCharacter().getName()+"进行游戏");
	}
}

