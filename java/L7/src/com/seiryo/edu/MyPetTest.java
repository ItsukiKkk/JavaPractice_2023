package com.seiryo.edu;

public class MyPetTest {
	public static void main(String[] args) {
		MyPet myPet1 = new MyPet("ºÚÁú");
		MyPet myPet2 = new MyPet("ºÚÁú","²ËĞÄ");
		myPet1.eat("Å£Èâ");
		myPet1.eat(4);
		myPet2.eat();
	}
}
