package com.edu.seiryo;

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
			System.out.println(hero[i].getIndex()+"."+hero[i].getName()+"\tѪ����"+hero[i].getHp()+"\t���ܣ�"+hero[i].getSkill());
		}
		
		int index1,index2;
		do {
			System.out.println("����������佫���");
			index1 = sc.nextInt();
			boolean ifHave = false;
			for(int i = 0; i<hero.length; i++){
				if(hero[i].getIndex() == index1){
					System.out.println("��ѡ����"+hero[i].getName()+"������Ϸ");
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
				if(hero[i].getIndex() == index2){
					System.out.println("��Ķ���ѡ����"+hero[i].getName()+"������Ϸ");
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
		//��һ�η���
		System.out.println("���Ƹ����");
		hero[index1-1].getCard(4,true);
		System.out.println("���Ƹ�����");
		hero[index2-1].getCard(4,true);
		//�ڶ��η��ƣ��ҵĻغ�
		hero[index1-1].getCard(2,false);
		System.out.println(hero[index1-1].getName()+"������������");
		System.out.print(hero[index1-1].getName()+"�������У�");
		//�����������Ϣ
		hero[index1-1].printCardInfo();
		System.out.println("������Ҫ���Ƶ���ţ�0Ϊ���ƣ�");
		int playNumber = sc.nextInt();
		//ʵ���ҵĳ��ƹ���
		hero[index1-1].myPlay(playNumber,hero[index1-1],hero[index2-1]);
		//�ڶ��η��ƣ����ֻغ�
		hero[index2-1].getCard(2,false);
		System.out.println(hero[index2-1].getName()+"������������");
		//ʵ���Զ����ƹ���
		hero[index2-1].autoPlay(hero[index1-1],hero[index2-1]);
		System.out.println("��ң�"+hero[index1-1].getName()+")Ѫ��"+hero[index1-1].getHp());
		System.out.println("���֣�"+hero[index2-1].getName()+")Ѫ��"+hero[index2-1].getHp());
		if(hero[index1-1].getHp() > hero[index2-1].getHp()){
			System.out.println("���ʤ");
		}else if(hero[index1-1].getHp() < hero[index2-1].getHp()){
			System.out.println("���ֻ�ʤ");
		}else{
			System.out.println("ƽ��");
		}
	}
}
