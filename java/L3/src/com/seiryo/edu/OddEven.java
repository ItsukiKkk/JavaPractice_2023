package com.seiryo.edu;
import java.util.Scanner;;
public class OddEven {
	public static void main(String[] args) {
		System.out.println("请输入数字");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2 == 0){
			System.out.println("输入数字为偶数");
		}else{
			System.out.println("输入数字为奇数");
		}
	}
}
