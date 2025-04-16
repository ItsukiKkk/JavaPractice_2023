package com.edu.seiryo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListAddGet1 {
	public static void main(String[] args) {
		String a = "软件工程师A",b = "软件工程师B", c = "软件工程师C", d = "软件工程师D";
		String e = "软件工程师E";
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
