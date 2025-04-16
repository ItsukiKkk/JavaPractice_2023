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
	//�з��ƹ���
	private Character character;
	//player����
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
		return "�佫"+getCharacter().getName()+",����Ѫ����"+getCharacter().getMaxHp()
				+",�����ǣ�"+getCharacter().getSkill();
	}
	//������������
	public void fetchCard(int num){
		giveCard(num);
	}
	//�Զ���������
	public void giveCard(int num){
		System.out.println("�����"+num+"���ƺ�");
		for (int i = 0; i < num; i++) {
			Card card = Initial.listCard.get(0);
			handcard.add(card);
			//����static�����ã�һ���������������������ݻ��
			Initial.listCard.remove(0);
		}
		
	}
	//��ʼ����
	public void giveCard(){
		if(this instanceof Player){
			System.out.println("���Ƹ���ң�"+character.getName());
		}else if(this instanceof PlayerAI){
			System.out.println("\n���Ƹ����֣�"+character.getName());
		}
		for (int i = 0; i < 4; i++) {
			Card card = Initial.listCard.get(0);
			System.out.print("���ƣ�["+(i+1)+"]"+"\t");
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
	//��ɱ��ɱ
	private boolean hasSomeKill(){
		for (int i = 0; i < handcard.size(); i++) {
			Card card = handcard.get(i);
			if (card.getKey().equals("ɱ")) {
				return true;
			}
		}
		return false;
	}
	//������public
	public void sendShaCard(){
		if (hasSomeKill()) {
			boolean canSend = false;
			int index = -1;
			while(!canSend){
				System.out.println(character.getName()+"������Ƶ����");
				Scanner scanner = new Scanner(System.in);
				index = scanner.nextInt();
				if(!handcard.get(index-1).getKey().equals("ɱ")){
					System.out.println("����ʱ��ɱ��ɱ");
					continue;
				}
				canSend = true;
			}
			if(canSend && index>=0){
				Card card = handcard.get(index-1);
				System.out.println(character.getName()+"���"+card.getColor()
				+card.getNum()+"["+card.getKey()+"]");
				handcard.remove(card);
			}
		}
	}
//	��������
	private boolean hasSomeShan(){
		for (int i = 0; i < handcard.size(); i++) {
			Card card = handcard.get(i);
			if (card.getKey().equals("��")) {
				return true;
			}
		}
		return false;
	}
	private boolean hasSomeTao(){
		for (int i = 0; i < handcard.size(); i++) {
			Card card = handcard.get(i);
			if (card.getKey().equals("��")) {
				return true;
			}
		}
		return false;
	}
	public void sendReplyCard(){
		if(hasSomeShan()){
			System.out.println("������");
			sendShanCard();
		}else if(hasSomeTao()){
			System.out.println("������");
			sendTaoCard();
		}
	}
	//������private
	private void sendShanCard(){
		if (hasSomeShan()) {
			boolean canSend = false;
			int index = -1;
			while(!canSend){
				System.out.println(character.getName()+"�������Ƶ����");
				Scanner scanner = new Scanner(System.in);
				index = scanner.nextInt();
				if(!handcard.get(index-1).getKey().equals("��")){
					System.out.println("��Ӧʱ��������");
					continue;
				}
				canSend = true;
			}
			if(canSend && index>=0){
				Card card = handcard.get(index-1);
				System.out.println(character.getName()+"���"+card.getColor()
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
				System.out.println(character.getName()+"�������Ƶ����");
				Scanner scanner = new Scanner(System.in);
				index = scanner.nextInt();
				if(!handcard.get(index-1).getKey().equals("��")){
					System.out.println("��Ӧʱ���ҳ���");
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
		if(!card.getKey().equals("��")){
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
