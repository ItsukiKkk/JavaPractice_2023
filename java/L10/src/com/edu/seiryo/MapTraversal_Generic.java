package com.edu.seiryo;

import java.util.*;
public class MapTraversal_Generic {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("����", "010");
		map.put("����", "020");
		map.put("�Ϻ�", "030");
		map.put("�人", "040");
		System.out.println("��ʾ���еĵ绰���ţ�");
		Set<String> setCitys = map.keySet();
		Iterator<String> it = setCitys.iterator();
		while(it.hasNext()){
			String city = it.next();
			String code = it.next();
			System.out.println(city+"�ĵ绰������"+code);
		}
	}
}