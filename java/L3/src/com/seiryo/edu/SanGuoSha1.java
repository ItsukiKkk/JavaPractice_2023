package com.seiryo.edu;
import java.util.Scanner;
public class SanGuoSha1 {
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
		System.out.println("����������佫���");
		boolean ifHave;
		do {
			int index = sc.nextInt();
			ifHave = false;
			switch(index){
				case 1:
					System.out.println("��ѡ��������������Ϸ");
					break;
				case 2:
					System.out.println("��ѡ�������ƽ�����Ϸ");
					break;
				case 3:
					System.out.println("��ѡ���˲ܲٽ�����Ϸ");
					break;
				case 4:
					System.out.println("��ѡ�����ĺ������Ϸ");
					break;
				case 5:
					System.out.println("��ѡ������Ȩ������Ϸ");
					break;
				case 6:
					System.out.println("��ѡ������褽�����Ϸ");
					break;
				default:
					System.out.println("�����ڸ��佫,����������");
					ifHave = true;
			}
		} while (ifHave);
		
	}
}
