package com.seiryo.edu;

import java.util.Scanner;

public class Initial {
	//???
	public static Player player = null;
	public static String[][] wujiangArray = new String[6][3];
	static Scanner sc = new Scanner(System.in);
	//��ʼ��Ϸ�������
	public static void startGame(){
		System.out.println("��ӭ�������������ɱ");
		System.out.println("-------------------");
		System.out.println("����ɱ��һ��������Ϊ����������");
		System.out.println("���������ɱ��һ����Java����̨��Ϸ�ĳ���");
		System.out.println("-----�佫�б�-----");
		wujiangArray[0][0] = "����";
		wujiangArray[0][1] = "4";
		wujiangArray[0][2] = "�ʵ�";
		wujiangArray[1][0] = "����";
		wujiangArray[1][1] = "4";
		wujiangArray[1][2] = "����";
		wujiangArray[2][0] = "�ܲ�";
		wujiangArray[2][1] = "4";
		wujiangArray[2][2] = "����";
		wujiangArray[3][0] = "�ĺ";
		wujiangArray[3][1] = "4";
		wujiangArray[3][2] = "����";
		wujiangArray[4][0] = "��Ȩ";
		wujiangArray[4][1] = "4";
		wujiangArray[4][2] = "�ƺ�";
		wujiangArray[5][0] = "���";
		wujiangArray[5][1] = "3";
		wujiangArray[5][2] = "����";
		for(int i = 0; i<wujiangArray.length; i++){
			System.out.println((i+1)+wujiangArray[i][0]+"\tѪ����"+wujiangArray[i][1]+"\t���ܣ�"+wujiangArray[i][2]);
		}
		System.out.println("======================================");
	}
	//�÷Ǿ�̬����ʵ�飺Ϊʲôһ��Ҫ��static����������static����Ҳ���Ե���static����:��Ϊ���ó�ʼ������
	//ѡ���佫 1.����Character��(Ϊʲô���ڴ������һ��ʼ�棿) 2.����Player��
	public static void selectWujiang(){
		System.out.println("������Ҫѡ���佫�����");
		int num = sc.nextInt();
		//����character
//		for(int i = 0; i<wujiangArray.length; i++){
		Character character = new Character();
		character.setName(wujiangArray[num-1][0]);
		character.setSkill(wujiangArray[num-1][2]);
		character.setMaxhp(Integer.valueOf(wujiangArray[num-1][1]));
//		}
		//����Player��
		player = new Player();
		player.setCharacter(character);
		player.setType("���");
		player.setHp(character.getMaxhp());
		System.out.println("���ѡ��"+player.getCharacter().getName()+"������Ϸ");
	}
}

