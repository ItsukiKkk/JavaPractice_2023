package com.seiryo.edu;

public class MyPetTest {
	public static void main(String[] args) {
		MyPet myPet1 = new MyPet("����");
		MyPet myPet2 = new MyPet("����","����");
		myPet1.eat("ţ��");
		myPet1.eat(4);
		myPet2.eat();
	}
}
