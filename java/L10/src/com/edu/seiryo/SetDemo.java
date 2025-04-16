package com.edu.seiryo;

import java.util.*;

public class SetDemo {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("abc");
		set.add("def");
		set.add("ghi");
		set.add("abc");
		System.out.println("set = "+set.toString());
		System.out.println("size = "+set.size());
		
		List list = new ArrayList();
		list.add("abc");
		list.add("aaa");
		list.add("fff");
		set.addAll(list);
		System.out.println("size = "+set.size());
		System.out.println("set = "+set.toString());
	}
}
