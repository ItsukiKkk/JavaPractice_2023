package com.edu.seiryo;

import java.util.*;

public class MyException {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[3];
		try{
			for (int i = 0; i < arr.length; i++) {
				System.out.println("��"+(i+1)+"��������:");
				arr[i] = scanner.nextInt();
				if (0>arr[i]||arr[i]>100) {
					throw new AgeRangeException("������ĵڣ�"+(i+1)+"����ֵ����0-100��Χ��");
				}
			}
		}catch(AgeRangeException e){
				e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
