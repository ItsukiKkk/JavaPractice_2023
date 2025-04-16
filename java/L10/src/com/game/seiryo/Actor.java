/**
 * 
 */
package com.game.seiryo;

import java.util.ArrayList;
import java.util.Iterator;

import javax.naming.InitialContext;

public class Actor {
	private Character character;
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
	public void giveCard(){
		if(this instanceof Player){
			System.out.println("���Ƹ���ң�"+character.getName());
		}else if(this instanceof PlayerAI){
			System.out.println("���Ƹ����֣�"+character.getName());
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
}
