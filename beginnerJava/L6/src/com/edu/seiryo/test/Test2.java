package com.edu.seiryo.test;

public class Test2 {
	public static void main(String[] args) {
		StaticVar st = new StaticVar();
		st.a++;
		st.b++;
		System.out.println("实例变量a="+st.a);
		System.out.println("静态变量a="+st.b);
		StaticVar st1 = new StaticVar();
		st1.a++;
		st1.b++;
		System.out.println("实例变量a="+st1.a);
		System.out.println("静态变量a="+st1.b);
	}
}
