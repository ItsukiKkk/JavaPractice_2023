package com.edu.seiryo;

public class MathDemo {
	public static void main(String[] args) {
		System.out.println("����ֵ������10.02"+Math.abs(10.02D)+",10.02="+Math.abs(-10.02D));
		System.out.println("���ֵ��23��12��"+Math.max(23, 12)+"��Сֵ��23��12��"+Math.min(23, 12));
		System.out.println("�������룺"+"Math��round(13.6)="+Math.round(13.6)+",Math.round(-13.4)"+Math.round(-13.4));
		System.out.println("���Ǻ�����sin(30)="+Math.sin(30)+"\n\tcos(30)="+Math.cos(30));
		System.out.println("����������16�Ŀ���"+Math.sqrt(16));
		System.out.println("����������ln(10)="+Math.log(10));
		System.out.println("0-10֮�����������������Ϊdouble����="+Math.random()*10);;
	}
}
