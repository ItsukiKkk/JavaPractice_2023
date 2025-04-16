package com.edu.seiryo.test;
import com.edu.seiryo.five.Conversation;;
public class Conversationtest {
	public static void main(String[] args) {
		Conversation co = new Conversation();
		double d = co.getCM(100);
		double c = co.getM(100);
		System.out.println(d);
		System.out.println(c);
	}
}
