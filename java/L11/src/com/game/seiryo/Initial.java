package com.game.seiryo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Initial {
	//武将的初始化
	static Character[] wujiang = {
			new ShuGuoCharacter("刘备", 4,"仁德",98),
			new ShuGuoCharacter("关羽", 4,"龙胆",85),
			new WeiGuoCharacter("曹操", 4, "奸雄"),
			new WuGuoCharacter("孙权",4,"制衡"),
			new WuGuoCharacter("周瑜",3,"反间")
			};
	//遍历武将信息
	public static void showWujiang(){
		System.out.println("武将列表：");
		for (int i = 0; i < wujiang.length; i++) {
			System.out.print((i+1)+"."+wujiang[i].getName()+",血量："+wujiang[i].getMaxHp()
					+",技能:"+wujiang[i].getSkill());
			if(wujiang[i] instanceof ShuGuoCharacter){
				ShuGuoCharacter shuGuoWujiang = (ShuGuoCharacter)wujiang[i];
				System.out.print(",情谊:"+shuGuoWujiang.getEmotion());
			}
			System.out.println();
		}
	}
	//选择武将，返回player信息为了给Actor用，static方法
	public static Actor[] selectWujiang(){
		boolean flag;
		Actor[] actors = new Actor[2];
		Scanner scanner = new Scanner(System.in);
		Actor player = null;
		Actor playerAI = null;
		do {
			flag = false;
			try{
				System.out.println("\n请输入要选择武将的序号");
				int num = scanner.nextInt();
				player = new Player(wujiang[num-1]);
				flag = true;
			}catch(InputMismatchException e){
				System.out.println("你输入的不是整数请重新输入");
				scanner.next();
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("你输入序号越界请重新输入");
			}catch(Exception e){
				System.out.println("发生了其他异常"+e.getMessage());
			}
		} while (!flag);
		System.out.println("玩家选择"+player.getCharacter().getName()+"进行游戏");
		System.out.println("=======================");
		do {
			flag = false;
			try{
				System.out.println("\n请输入要选择对手武将的序号");
				int num = scanner.nextInt();
				num = scanner.nextInt();
				playerAI = new PlayerAI(wujiang[num-1]);
			}catch(InputMismatchException e){
				System.out.println("你输入的不是整数请重新输入");
				scanner.next();
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("你输入序号越界请重新输入");
			}catch(Exception e){
				System.out.println("发生了其他异常"+e.getMessage());
			}
		} while (!flag);
		System.out.println("对手选择"+playerAI.getCharacter().getName()+"进行游戏");
//		Actor[] actors = new Actor[2];
//		System.out.println("\n请输入要选择武将的序号");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		Actor player = new Player(wujiang[num-1]);
//		System.out.println("玩家选择"+player.getCharacter().getName()+"进行游戏");
//		System.out.println("=======================");
//		System.out.println("\n请输入要选择对手武将的序号");
//		num = scanner.nextInt();
//		Actor playerAI = new PlayerAI(wujiang[num-1]);
//		System.out.println("对手选择"+playerAI.getCharacter().getName()+"进行游戏");
		actors[0] = player;
		actors[1] = playerAI;
		return actors;
	}
	//卡牌的初始化
	static Card[] card = new Card[104];
	//所有牌
	static List<Card> listCard = new ArrayList<Card>();
	public static void cardInit(){
		for(int i = 0; i < 104; i++){
			card[i] = new Card();
			if(i < 42){
				card[i].setKey("杀");
			}else if(i < 42*2){
				card[i].setKey("闪");
			}else{
				card[i].setKey("桃");
			}
		}
		int tmp = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 13; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					switch(j2){
						case 0:
							card[tmp].setColor("黑桃");
							break;
						case 1:
							card[tmp].setColor("红桃");
							break;
						case 2:
							card[tmp].setColor("梅花");
							break;
						case 3:
							card[tmp].setColor("方块");
							break;
					}
					switch(j){
					case 0:
						card[tmp].setNum("A");
						break;
					case 10:
						card[tmp].setNum("J");
						break;
					case 11:
						card[tmp].setNum("Q");
						break;
					case 12:
						card[tmp].setNum("K");
						break;
					default:
						card[tmp].setNum(Integer.toString(j+1));
					}
					listCard.add(card[tmp]);
					tmp++; 
				}
			}
		}
		for (int i = 0; i < card.length; i++) {
			Card cardTmp = new Card();
			cardTmp = card[i];
			Random r = new Random();
			int index = r.nextInt(listCard.size());
			listCard.remove(cardTmp);
			listCard.add(index,cardTmp);
		}
	}
	public static void showCard(){
		for (Card card2 : listCard) {
			String string = card2.getColor()+" "+card2.getKey()+" "+card2.getNum();
			System.out.println(string);
			
		}
	}
}
