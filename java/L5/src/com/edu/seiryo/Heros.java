package com.edu.seiryo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Heros {
	private int index;
	private String name;
	private int hp;
	private String skill;
	private Random random = new Random();
	ArrayList<String> allCards = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public Heros() {
	}
	public Heros(int index, String name, int hp, String skill) {
		super();
		this.index = index;
		this.name = name;
		this.hp = hp;
		this.skill = skill;
	}
	public void getCard(int amount,boolean ifFirstTime){
		String[][] cards = new String[104][3];
		for(int i = 0; i<cards.length; i++){
			cards[i][0] = String.valueOf(i);
			if(i <= 41){
				cards[i][1] = "杀";
				if(i < 21){
					cards[i][2] = "黑桃";
				}else{
					cards[i][2] = "梅花";
				}
	        }else if(i >= 42 && i <= 83){
	        	cards[i][1] = "闪";
	        	cards[i][2] = "方块";
	        }else{
	        	cards[i][1] = "桃";
	        	cards[i][2] = "红桃";
	        }
		}
		for (int i = 0; i < amount; i++) {
			int randomNumber = random.nextInt(104);
			String cardInfo = cards[randomNumber][1];
			if(ifFirstTime){
				System.out.print("\t[卡牌"+(i+1)+"]:("+cards[randomNumber][2]+") "+cards[randomNumber][1]);
			}
			allCards.add(cardInfo);
			if (i == amount-1) {
				System.out.println();
			}
		}
	}
	public void printCardInfo(){
		for(int i = 0; i<allCards.size(); i++){
			System.out.print((i+1)+"."+allCards.get(i)+" ");
		}
	}
	public void myPlay(int playNumber, Heros myHero,Heros rivalHero){
//		初始血量应该设为 final,使用桃满血不加,
//		else if(allCards.get(playNumber-1).equals("桃")){
//			if()
//		}else{
//			
//		}
		//使用杀减血，他情况不能出牌
		boolean ifPlay = false;
//		printCardInfo();
		if(playNumber == 0){
			System.out.println("选择一张牌丢弃");
			int offNumber = sc.nextInt(); 
			System.out.println("你弃牌"+ allCards.get(offNumber-1));
			allCards.remove(offNumber-1);
			ifPlay = true;
		}
		if(playNumber > 0 && playNumber <=6){
			System.out.println("你出了"+allCards.get(playNumber-1));
			if(allCards.get(playNumber-1).equals("杀")){
				hpLoss(rivalHero);
				allCards.remove(playNumber-1);
				ifPlay = true;
			}
		}
		if(playNumber > 6){
			System.out.println("输入错误,请重新选择");
			int Number = sc.nextInt();
			myHero.myPlay(Number, myHero,rivalHero);
		}
		
		if(!ifPlay){
			System.out.println("此牌不能出，请重新输入要出牌的序号（0为弃牌）");
			int Number = sc.nextInt();
			myHero.myPlay(Number, myHero,rivalHero);//使用递归输入错误三次出现allCards元素被删除和更改的bug
			//重新启动又好了。。。。
		}
	}
	public void autoPlay(Heros myHero,Heros rivalHero){
		boolean ifPlay = false;
		for(int i = 0; i<rivalHero.allCards.size(); i++){
			String a = rivalHero.allCards.get(i);
//			System.out.println(a);
//			System.out.println(rivalHero.allCards);
			if(a.equals("杀")){
				System.out.println("对手出了杀");
				hpLoss(myHero);
				rivalHero.allCards.remove(i);
				ifPlay = true;
				break;
			}
		}
		if(!ifPlay){
			//没有杀任意弃一张牌
			int cardNum = (int)Math.random()*6;
			System.out.println("对手弃牌"+ rivalHero.allCards.get(cardNum));
			rivalHero.allCards.remove(cardNum);
		}
	}
	private void hpLoss(Heros rivalHero){
		int hp = rivalHero.getHp()-1;
		rivalHero.setHp(hp);
		System.out.println(rivalHero.getName()+"失去了一滴血,还剩"+rivalHero.getHp()+"滴血");
	}
}
