package com.edu.seiryo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex {
	//额外作业：以键值对的形式展示map中的数据，不要用get一个个获取输出
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("第一个", 1);
		map.put("第二个", 2);
		map.put("第三个", 3);
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String bString = iterator.next();
			Integer a = map.get(bString);
			System.out.println(bString+a);
		}
	}
}
