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
				cards[i][1] = "ɱ";
				if(i < 21){
					cards[i][2] = "����";
				}else{
					cards[i][2] = "÷��";
				}
	        }else if(i >= 42 && i <= 83){
	        	cards[i][1] = "��";
	        	cards[i][2] = "����";
	        }else{
	        	cards[i][1] = "��";
	        	cards[i][2] = "����";
	        }
		}
		for (int i = 0; i < amount; i++) {
			int randomNumber = random.nextInt(104);
			String cardInfo = cards[randomNumber][1];
			if(ifFirstTime){
				System.out.print("\t[����"+(i+1)+"]:("+cards[randomNumber][2]+") "+cards[randomNumber][1]);
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
//		��ʼѪ��Ӧ����Ϊ final,ʹ������Ѫ����,
//		else if(allCards.get(playNumber-1).equals("��")){
//			if()
//		}else{
//			
//		}
		//ʹ��ɱ��Ѫ����������ܳ���
		boolean ifPlay = false;
//		printCardInfo();
		if(playNumber == 0){
			System.out.println("ѡ��һ���ƶ���");
			int offNumber = sc.nextInt(); 
			System.out.println("������"+ allCards.get(offNumber-1));
			allCards.remove(offNumber-1);
			ifPlay = true;
		}
		if(playNumber > 0 && playNumber <=6){
			System.out.println("�����"+allCards.get(playNumber-1));
			if(allCards.get(playNumber-1).equals("ɱ")){
				hpLoss(rivalHero);
				allCards.remove(playNumber-1);
				ifPlay = true;
			}
		}
		if(playNumber > 6){
			System.out.println("�������,������ѡ��");
			int Number = sc.nextInt();
			myHero.myPlay(Number, myHero,rivalHero);
		}
		
		if(!ifPlay){
			System.out.println("���Ʋ��ܳ�������������Ҫ���Ƶ���ţ�0Ϊ���ƣ�");
			int Number = sc.nextInt();
			myHero.myPlay(Number, myHero,rivalHero);//ʹ�õݹ�����������γ���allCardsԪ�ر�ɾ���͸��ĵ�bug
			//���������ֺ��ˡ�������
		}
	}
	public void autoPlay(Heros myHero,Heros rivalHero){
		boolean ifPlay = false;
		for(int i = 0; i<rivalHero.allCards.size(); i++){
			String a = rivalHero.allCards.get(i);
//			System.out.println(a);
//			System.out.println(rivalHero.allCards);
			if(a.equals("ɱ")){
				System.out.println("���ֳ���ɱ");
				hpLoss(myHero);
				rivalHero.allCards.remove(i);
				ifPlay = true;
				break;
			}
		}
		if(!ifPlay){
			//û��ɱ������һ����
			int cardNum = (int)Math.random()*6;
			System.out.println("��������"+ rivalHero.allCards.get(cardNum));
			rivalHero.allCards.remove(cardNum);
		}
	}
	private void hpLoss(Heros rivalHero){
		int hp = rivalHero.getHp()-1;
		rivalHero.setHp(hp);
		System.out.println(rivalHero.getName()+"ʧȥ��һ��Ѫ,��ʣ"+rivalHero.getHp()+"��Ѫ");
	}
}
