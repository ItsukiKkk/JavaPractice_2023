package com.edu.seiryo.test;

public class Roundtest {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			Round ro = new Round(i);
			System.out.println("Բ�����Ϊ="+ro.getAreas());
		}
	}
}
