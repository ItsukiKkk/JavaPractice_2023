package com.edu.seiryo;

public class SanGuoSha {
	public static void main(String[] args) {
		System.out.println("��ӭ�������������ɱ");
		System.out.println("-------------------");
		System.out.println("����ɱ��һ��������Ϊ����������");
		System.out.println("���������ɱ��һ����Java����̨��Ϸ�ĳ���");
		System.out.println("-----�佫�б�-----");
		Character[] characters = new Character[6];
		characters[0] = new Character();
		characters[1] = new Character();
		characters[2] = new Character();
		characters[3] = new Character();
		characters[4] = new Character();
		characters[5] = new Character();
		characters[0].setName("����");
		characters[1].setName("����");
		characters[2].setName("�ܲ�");
		characters[3].setName("�ĺ");
		characters[4].setName("��Ȩ");
		characters[5].setName("���");
		characters[0].setMaxhp(4);
		characters[1].setMaxhp(4);
		characters[2].setMaxhp(4);
		characters[3].setMaxhp(4);
		characters[4].setMaxhp(4);
		characters[5].setMaxhp(3);
		characters[0].setSkill("�ʵ�");
		characters[1].setSkill("����");
		characters[2].setSkill("����");
		characters[3].setSkill("����");
		characters[4].setSkill("�ƺ�");
		characters[5].setSkill("����");
		for(int i = 0; i<characters.length; i++){
			System.out.println((i+1)+"."+characters[i].getName()+"\tѪ����"+characters[i].getMaxhp()+"\t���ܣ�"+characters[i].getSkill());
		}
	}
}
