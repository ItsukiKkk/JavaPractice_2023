package com.seiryo.edu;

public class TestInterface {
	public static void main(String[] args) {
		Ship ship = new Warship("�ൺ��");
		ship.sail();
		Weapon weapon = new Warship("տ����");
		weapon.fire();
		Warship warship = new Warship("������");
		warship.sail();
		warship.fire();
	}
}
