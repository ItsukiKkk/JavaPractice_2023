package com.game1.seiryo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Test {
	public static void main(String[] args) {
		Map<Integer, Character> allCharacter = new HashMap<Integer, Character>();
		Character zhaoyun = new ShuGuoCharacter("’‘‘∆", 4, "¡˙µ®");
		Character caocao = new WeiGuoCharacter("≤‹≤Ÿ", 4, "ºÈ–€");
		Character zhouyu = new WeiGuoCharacter("÷‹Ë§", 3, "∑¥º‰");
//		allCharacter.put(Character.count, zhaoyun);
//		allCharacter.put(Character.count, caocao);
//		allCharacter.put(Character.count, zhouyu);
		allCharacter.put(zhaoyun.getId(), zhaoyun);
		allCharacter.put(caocao.getId(), caocao);
		allCharacter.put(zhouyu.getId(), zhouyu);
		Set<Integer> set = allCharacter.keySet();
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()){
			Integer count = iterator.next();
			Character a = allCharacter.get(count);
			System.out.println(a.getName()+a.getMaxHp()+a.getSkill());
		}
	}
}
