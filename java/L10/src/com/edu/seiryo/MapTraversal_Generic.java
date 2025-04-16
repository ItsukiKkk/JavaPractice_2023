package com.edu.seiryo;

import java.util.*;
public class MapTraversal_Generic {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("北京", "010");
		map.put("广州", "020");
		map.put("上海", "030");
		map.put("武汉", "040");
		System.out.println("显示城市的电话区号：");
		Set<String> setCitys = map.keySet();
		Iterator<String> it = setCitys.iterator();
		while(it.hasNext()){
			String city = it.next();
			String code = it.next();
			System.out.println(city+"的电话区号是"+code);
		}
	}
}