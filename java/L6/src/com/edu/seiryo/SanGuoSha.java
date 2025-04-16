package com.edu.seiryo;

public class SanGuoSha {
	public static void main(String[] args) {
		System.out.println("欢迎来到迷你版三国杀");
		System.out.println("-------------------");
		System.out.println("三国杀是一款以三国为背景的桌游");
		System.out.println("迷你版三国杀是一款以Java控制台游戏的程序");
		System.out.println("-----武将列表-----");
		Character[] characters = new Character[6];
		characters[0] = new Character();
		characters[1] = new Character();
		characters[2] = new Character();
		characters[3] = new Character();
		characters[4] = new Character();
		characters[5] = new Character();
		characters[0].setName("刘备");
		characters[1].setName("赵云");
		characters[2].setName("曹操");
		characters[3].setName("夏侯惇");
		characters[4].setName("孙权");
		characters[5].setName("周瑜");
		characters[0].setMaxhp(4);
		characters[1].setMaxhp(4);
		characters[2].setMaxhp(4);
		characters[3].setMaxhp(4);
		characters[4].setMaxhp(4);
		characters[5].setMaxhp(3);
		characters[0].setSkill("仁德");
		characters[1].setSkill("龙胆");
		characters[2].setSkill("奸雄");
		characters[3].setSkill("刚烈");
		characters[4].setSkill("制衡");
		characters[5].setSkill("反间");
		for(int i = 0; i<characters.length; i++){
			System.out.println((i+1)+"."+characters[i].getName()+"\t血量："+characters[i].getMaxhp()+"\t技能："+characters[i].getSkill());
		}
	}
}
