package com.edu.seiryo.test;

public class StaticBlock {
	static{
		System.out.println("第一个静态代码块");
	}
	static{
		System.out.println("第二个静态代码块");
	}
	static void print(){
		System.out.println("静态方法在静态代码块之后执行");
	}
	public static void main(String[] args) {
		StaticBlock st = new StaticBlock();
		StaticBlock.print();
	}
}
