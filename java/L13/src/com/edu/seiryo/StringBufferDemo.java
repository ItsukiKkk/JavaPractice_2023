package com.edu.seiryo;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("seiryo");
		stringBuffer.insert(0, "hello");
		stringBuffer.replace(5, 6, ",");
		System.out.println(stringBuffer);
		stringBuffer.reverse();
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.length());
		System.out.println(stringBuffer.capacity());
		stringBuffer.setLength(5);
		System.out.println(stringBuffer);
	}
}
