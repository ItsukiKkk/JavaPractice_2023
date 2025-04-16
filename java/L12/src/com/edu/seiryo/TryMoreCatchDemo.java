package com.edu.seiryo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryMoreCatchDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[5];
		try{
			System.out.println("����������Ԫ�أ�");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			System.out.println("����������Ԫ��������");
			int index = scanner.nextInt();
			System.out.println("arr["+index+"]="+arr[index]);
			int result = arr[3]/arr[0];
			System.out.println("������Ϊ��"+result);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�쳣��Ϣ��"+e);
		}catch(ArithmeticException e){
			System.out.println("�쳣��Ϣ��"+e);
		}catch(InputMismatchException e){
			System.out.println("�쳣��Ϣ��"+e);
		}
		System.out.println("*********�������*********");
	}
}
