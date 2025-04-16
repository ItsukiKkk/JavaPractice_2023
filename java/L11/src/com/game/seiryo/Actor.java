/**
 * 
 */
package com.game.seiryo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import javax.naming.InitialContext;

public class Actor {
	//有发牌功能
	private Character character;
	//player手牌
	private ArrayList<Card> handcard = new ArrayList<Card>();
	public ArrayList<Card> getHandcard(){
		return handcard;
	}
	public void setHandcard(ArrayList<Card> handcard){
		this.handcard = handcard;
	}
	public Actor(){
		
	};
	public Actor(Character character){
		this.character = character;
	}
	public Character getCharacter(){
		return character;
	}
	public void setCharacter(Character character){
		this.character = character;;
	}
	public String toString(){
		return "武将"+getCharacter().getName()+",他的血量是"+getCharacter().getMaxHp()
				+",技能是："+getCharacter().getSkill();
	}
	//设置摸牌数量
	public void fetchCard(int num){
		giveCard(num);
	}
	//自定义拍牌数
	public void giveCard(int num){
		System.out.println("玩家摸"+num+"张牌后");
		for (int i = 0; i < num; i++) {
			Card card = Initial.listCard.get(0);
			handcard.add(card);
			//这是static的作用：一个牌拿走了整个类存的数据会变
			Initial.listCard.remove(0);
		}
		
	}
	//初始发牌
	public void giveCard(){
		if(this instanceof Player){
			System.out.println("发牌给玩家："+character.getName());
		}else if(this instanceof PlayerAI){
			System.out.println("\n发牌给对手："+character.getName());
		}
		for (int i = 0; i < 4; i++) {
			Card card = Initial.listCard.get(0);
			System.out.print("手牌：["+(i+1)+"]"+"\t");
			handcard.add(card);
			Initial.listCard.remove(0);
		}
	}
	public void showHandCard(){
		Iterator<Card> iterator = handcard.iterator();
		System.out.println();
		while(iterator.hasNext()){
			Card card = iterator.next();
			System.out.print(card.getColor()+card.getNum()+"["+card.getKey()+"]\t");
		}
	}
	//有杀出杀
	private boolean hasSomeKill(){
		for (int i = 0; i < handcard.size(); i++) {
			Card card = handcard.get(i);
			if (card.getKey().equals("杀")) {
				return true;
			}
		}
		return false;
	}
	//这里是public
	public void sendShaCard(){
		if (hasSomeKill()) {
			boolean canSend = false;
			int index = -1;
			while(!canSend){
				System.out.println(character.getName()+"输入出牌的序号");
				Scanner scanner = new Scanner(System.in);
				index = scanner.nextInt();
				if(!handcard.get(index-1).getKey().equals("杀")){
					System.out.println("攻击时有杀出杀");
					continue;
				}
				canSend = true;
			}
			if(canSend && index>=0){
				Card card = handcard.get(index-1);
				System.out.println(character.getName()+"打出"+card.getColor()
				+card.getNum()+"["+card.getKey()+"]");
				handcard.remove(card);
			}
		}
	}
//	有闪出闪
	private boolean hasSomeShan(){
		for (int i = 0; i < handcard.size(); i++) {
			Card card = handcard.get(i);
			if (card.getKey().equals("闪")) {
				return true;
			}
		}
		return false;
	}
	private boolean hasSomeTao(){
		for (int i = 0; i < handcard.size(); i++) {
			Card card = handcard.get(i);
			if (card.getKey().equals("桃")) {
				return true;
			}
		}
		return false;
	}
	public void sendReplyCard(){
		if(hasSomeShan()){
			System.out.println("有闪牌");
			sendShanCard();
		}else if(hasSomeTao()){
			System.out.println("有桃牌");
			sendTaoCard();
		}
	}
	//这里是private
	private void sendShanCard(){
		if (hasSomeShan()) {
			boolean canSend = false;
			int index = -1;
			while(!canSend){
				System.out.println(character.getName()+"输入闪牌的序号");
				Scanner scanner = new Scanner(System.in);
				index = scanner.nextInt();
				if(!handcard.get(index-1).getKey().equals("闪")){
					System.out.println("回应时有闪出闪");
					continue;
				}
				canSend = true;
			}
			if(canSend && index>=0){
				Card card = handcard.get(index-1);
				System.out.println(character.getName()+"打出"+card.getColor()
				+card.getNum()+"["+card.getKey()+"]");
				handcard.remove(card);
			}
		}
	}
	private void sendTaoCard(){
		if (hasSomeTao()) {
			boolean canSend = false;
			int index = -1;
			while(!canSend){
				System.out.println(character.getName()+"输入桃牌的序号");
				Scanner scanner = new Scanner(System.in);
				index = scanner.nextInt();
				if(!handcard.get(index-1).getKey().equals("闪")){
					System.out.println("回应时有桃出桃");
					continue;
				}
				canSend = true;
			}
			if(canSend && index>=0){
				sendTaoCard(index);
			}
		}
	}
	private void sendTaoCard(int index){
		handcard.remove(index-1);
		Random random = new Random();
		int pos = random.nextInt(Initial.listCard.size());
		Card card = Initial.listCard.get(pos);
		Initial.listCard.remove(card);
		handcard.add(card);
		if(!card.getKey().equals("闪")){
			if (hasSomeTao()) {
				sendTaoCard();
			}
		}else{
			sendShaCard();
		}
	}
	private boolean hasFullKill(){
		return false;
	}
}
