package com.edu.seiryo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTraversal {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("����", "010");
		map.put("����", "020");
		map.put("�Ϻ�", "030");
		map.put("�人", "040");
		System.out.println("��ʾ���еĵ绰���ţ�");
		Set setCitys = map.keySet();
		Iterator it = setCitys.iterator();
		while(it.hasNext()){
			String city = (String)it.next();
			Object code = it.next();
			System.out.println(city+"�ĵ绰������"+code);
		}
	}
}
