package com.edu.seiryo;

import java.util.*;

public class MyException {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[3];
		try{
			for (int i = 0; i < arr.length; i++) {
				System.out.println("第"+(i+1)+"个人年龄:");
				arr[i] = scanner.nextInt();
				if (0>arr[i]||arr[i]>100) {
					throw new AgeRangeException("您输入的第："+(i+1)+"个数值不在0-100范围内");
				}
			}
		}catch(AgeRangeException e){
				e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
