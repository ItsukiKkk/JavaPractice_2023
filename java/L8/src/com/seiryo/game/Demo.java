package com.seiryo.game;

public class Demo {
	public static void main(String[] args) {
		WeiGuoCharacter weiGuoCharacter = new WeiGuoCharacter("≤‹≤Ÿ", 4, "ºÈ–€");
		ShuGuoCharacter shuGuoCharacter = new ShuGuoCharacter("’‘‘∆", 4, "¡˙µ®");
		WuGuoCharacter wuGuoCharacter = new WuGuoCharacter("÷‹Ë§", 3, "∑¥º‰");
		System.out.println(wuGuoCharacter.name);
	}
}
