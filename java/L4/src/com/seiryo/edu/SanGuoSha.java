package com.seiryo.edu;
import java.util.Scanner;
public class SanGuoSha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Heros []hero = new Heros[6];
		 hero[0] = new Heros(1,"����",4,"�ʵ�");
		 hero[1] = new Heros(2,"����",4,"����");
		 hero[2] = new Heros(3,"�ܲ�",4,"����");
		 hero[3] = new Heros(4,"�ĺ",4,"����");
		 hero[4] = new Heros(5,"��Ȩ",4,"�ƺ�");
		 hero[5] = new Heros(6,"���",3,"����");
		System.out.println("��ӭ�������������ɱ");
		System.out.println("-------------------");
		System.out.println("����ɱ��һ��������Ϊ����������");
		System.out.println("���������ɱ��һ����Java����̨��Ϸ�ĳ���");
		System.out.println("-----�佫�б�-----");
		for(int i = 0; i<hero.length; i++){
			System.out.println(hero[i].index+"."+hero[i].name+"\tѪ����"+hero[i].hp+"\t���ܣ�"+hero[i].skill);
		}
		
		int index1,index2;
		do {
			System.out.println("����������佫���");
			index1 = sc.nextInt();
			boolean ifHave = false;
			for(int i = 0; i<hero.length; i++){
				if(hero[i].index == index1){
					System.out.println("��ѡ����"+hero[i].name+"������Ϸ");
					ifHave = true;
					break;
				}
			}
			if(!ifHave){
				System.out.println("�����ڸ��佫,����������");
				continue;
			}
			break;
		} while (true);
		do {
			System.out.println("����������ֵ��佫���");
			 index2 = sc.nextInt();
			boolean ifHave = false;
			for(int i = 0; i<hero.length; i++){
				if(hero[i].index == index2){
					System.out.println("��Ķ���ѡ����"+hero[i].name+"������Ϸ");
					ifHave = true;
					break;
				}
			}
			if(!ifHave){
				System.out.println("�����ڸ��佫,����������");
				continue;
			}
			break;
		} while (true);
		System.out.println("-----------------------------");
		System.out.println("���Ƹ����");
		hero[index1].getCard();
		System.out.println("���Ƹ�����");
		hero[index2].getCard();
	}
}
