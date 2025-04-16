package com.edu.seiryo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTraversal {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("北京", "010");
		map.put("广州", "020");
		map.put("上海", "030");
		map.put("武汉", "040");
		System.out.println("显示城市的电话区号：");
		Set setCitys = map.keySet();
		Iterator it = setCitys.iterator();
		while(it.hasNext()){
			String city = (String)it.next();
			Object code = it.next();
			System.out.println(city+"的电话区号是"+code);
		}
	}
}
