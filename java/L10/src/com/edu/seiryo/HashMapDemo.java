package com.edu.seiryo;

import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(2201810, null);
		map.put(2201811, "����");
		System.out.println("get()�������ؽ����");
		System.out.print("-------"+map.get(2201810));
		System.out.print(" "+map.get(2201811));
		System.out.println(" "+map.get(220182));
		System.out.println("containsKey()�����ķ��ؽ���ǣ�");

		System.out.print("-------"+map.containsKey(2201810));
		System.out.print(" "+map.containsKey(2201811));
		System.out.print(" "+map.containsKey(220182));
	}
}
