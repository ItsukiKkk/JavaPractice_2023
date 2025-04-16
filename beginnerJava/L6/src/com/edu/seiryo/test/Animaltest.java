package com.edu.seiryo.test;
import com.edu.seiryo.five.Animal;;
public class Animaltest {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal.n++;
		Animal a1 = new Animal();
		Animal.n++;
		System.out.println(Animal.n);
	}
}
