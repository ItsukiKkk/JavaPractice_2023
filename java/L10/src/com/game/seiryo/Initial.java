package com.game.seiryo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Initial {
	static Card[] card = new Card[104];
	static List<Card> listCard = new ArrayList<Card>();
	public static void cardInit(){
		for(int i = 0; i < 104; i++){
			card[i] = new Card();
			if(i < 42){
				card[i].setKey("É±");
			}else if(i < 42*2){
				card[i].setKey("ÉÁ");
			}else{
				card[i].setKey("ÌÒ");
			}
		}
		int tmp = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 13; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					switch(j2){
						case 0:
							card[tmp].setColor("ºÚÌÒ");
							break;
						case 1:
							card[tmp].setColor("ºìÌÒ");
							break;
						case 2:
							card[tmp].setColor("Ã·»¨");
							break;
						case 3:
							card[tmp].setColor("·½¿é");
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
