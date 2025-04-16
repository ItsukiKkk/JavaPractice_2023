package com.edu.seiryo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryMoreCatchDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[5];
		try{
			System.out.println("请输入数组元素：");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			System.out.println("请输入数组元素引索：");
			int index = scanner.nextInt();
			System.out.println("arr["+index+"]="+arr[index]);
			int result = arr[3]/arr[0];
			System.out.println("计算结果为："+result);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("异常信息："+e);
		}catch(ArithmeticException e){
			System.out.println("异常信息："+e);
		}catch(InputMismatchException e){
			System.out.println("异常信息："+e);
		}
		System.out.println("*********程序结束*********");
	}
}
