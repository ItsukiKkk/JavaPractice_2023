package com.game.seiryo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Initial {
	//�佫�ĳ�ʼ��
	static Character[] wujiang = {
			new ShuGuoCharacter("����", 4,"�ʵ�",98),
			new ShuGuoCharacter("����", 4,"����",85),
			new WeiGuoCharacter("�ܲ�", 4, "����"),
			new WuGuoCharacter("��Ȩ",4,"�ƺ�"),
			new WuGuoCharacter("���",3,"����")
			};
	//�����佫��Ϣ
	public static void showWujiang(){
		System.out.println("�佫�б�");
		for (int i = 0; i < wujiang.length; i++) {
			System.out.print((i+1)+"."+wujiang[i].getName()+",Ѫ����"+wujiang[i].getMaxHp()
					+",����:"+wujiang[i].getSkill());
			if(wujiang[i] instanceof ShuGuoCharacter){
				ShuGuoCharacter shuGuoWujiang = (ShuGuoCharacter)wujiang[i];
				System.out.print(",����:"+shuGuoWujiang.getEmotion());
			}
			System.out.println();
		}
	}
	//ѡ���佫������player��ϢΪ�˸�Actor�ã�static����
	public static Actor[] selectWujiang(){
		boolean flag;
		Actor[] actors = new Actor[2];
		Scanner scanner = new Scanner(System.in);
		Actor player = null;
		Actor playerAI = null;
		do {
			flag = false;
			try{
				System.out.println("\n������Ҫѡ���佫�����");
				int num = scanner.nextInt();
				player = new Player(wujiang[num-1]);
				flag = true;
			}catch(InputMismatchException e){
				System.out.println("������Ĳ�����������������");
				scanner.next();
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("���������Խ������������");
			}catch(Exception e){
				System.out.println("�����������쳣"+e.getMessage());
			}
		} while (!flag);
		System.out.println("���ѡ��"+player.getCharacter().getName()+"������Ϸ");
		System.out.println("=======================");
		do {
			flag = false;
			try{
				System.out.println("\n������Ҫѡ������佫�����");
				int num = scanner.nextInt();
				num = scanner.nextInt();
				playerAI = new PlayerAI(wujiang[num-1]);
			}catch(InputMismatchException e){
				System.out.println("������Ĳ�����������������");
				scanner.next();
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("���������Խ������������");
			}catch(Exception e){
				System.out.println("�����������쳣"+e.getMessage());
			}
		} while (!flag);
		System.out.println("����ѡ��"+playerAI.getCharacter().getName()+"������Ϸ");
//		Actor[] actors = new Actor[2];
//		System.out.println("\n������Ҫѡ���佫�����");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		Actor player = new Player(wujiang[num-1]);
//		System.out.println("���ѡ��"+player.getCharacter().getName()+"������Ϸ");
//		System.out.println("=======================");
//		System.out.println("\n������Ҫѡ������佫�����");
//		num = scanner.nextInt();
//		Actor playerAI = new PlayerAI(wujiang[num-1]);
//		System.out.println("����ѡ��"+playerAI.getCharacter().getName()+"������Ϸ");
		actors[0] = player;
		actors[1] = playerAI;
		return actors;
	}
	//���Ƶĳ�ʼ��
	static Card[] card = new Card[104];
	//������
	static List<Card> listCard = new ArrayList<Card>();
	public static void cardInit(){
		for(int i = 0; i < 104; i++){
			card[i] = new Card();
			if(i < 42){
				card[i].setKey("ɱ");
			}else if(i < 42*2){
				card[i].setKey("��");
			}else{
				card[i].setKey("��");
			}
		}
		int tmp = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 13; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					switch(j2){
						case 0:
							card[tmp].setColor("����");
							break;
						case 1:
							card[tmp].setColor("����");
							break;
						case 2:
							card[tmp].setColor("÷��");
							break;
						case 3:
							card[tmp].setColor("����");
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
