package com.edu.seiryo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListAddGet1 {
	public static void main(String[] args) {
		String a = "�������ʦA",b = "�������ʦB", c = "�������ʦC", d = "�������ʦD";
		String e = "�������ʦE";
		List<String> list = new LinkedList<String>();
		list.add(a);
		list.add(e);
		list.add(d);
		list.set(1, b);
		list.add(2,c);
		System.out.println(list.toString());
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
