package com.edu.seiryo.test;
import com.edu.seiryo.five.Car;
public class Fivetest {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			Car car = new Car();
			car.print();
		}
	}
}
