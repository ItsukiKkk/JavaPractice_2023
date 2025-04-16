package com.edu.seiryo;


import java.util.ArrayList;
import java.util.List;

public class ListIndex {
	public static void main(String[] args) {
		String a = "软件工程师A",b = "软件工程师B", c = "软件工程师C", d = "软件工程师D";
		String repeat = "Repeat";
		List<String> list = new ArrayList<String>();
		list.add(a);
		list.add(repeat);
		list.add(b);
		list.add(repeat);
		list.add(c);
		list.add(repeat);
		list.add(d);
		System.out.println(list.indexOf(repeat));
		System.out.println(list.lastIndexOf(repeat));
		System.out.println(list.indexOf(b));
		System.out.println(list.lastIndexOf(b));
	}
}
