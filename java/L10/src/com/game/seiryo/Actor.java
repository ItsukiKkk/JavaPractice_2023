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
		return "武将"+getCharacter().getName()+",他的血量是"+getCharacter().getMaxHp()
				+",技能是："+getCharacter().getSkill();
	}
	public void giveCard(){
		if(this instanceof Player){
			System.out.println("发牌给玩家："+character.getName());
		}else if(this instanceof PlayerAI){
			System.out.println("发牌给对手："+character.getName());
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
}
