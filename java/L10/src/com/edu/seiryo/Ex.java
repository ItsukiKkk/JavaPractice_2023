package com.edu.seiryo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex {
	//������ҵ���Լ�ֵ�Ե���ʽչʾmap�е����ݣ���Ҫ��getһ������ȡ���
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("��һ��", 1);
		map.put("�ڶ���", 2);
		map.put("������", 3);
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String bString = iterator.next();
			Integer a = map.get(bString);
			System.out.println(bString+a);
		}
	}
}
