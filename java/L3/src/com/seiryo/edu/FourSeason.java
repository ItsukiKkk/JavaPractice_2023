package com.seiryo.edu;

public class FourSeason {
	public static void main(String[] args) {
		String season = "夏天";
		switch(season){
			case "春天":
				System.out.println("春暖花开");
				break;
			case "夏天":
				System.out.println("夏日炎热");
				break;
			case "秋天":
				System.out.println("秋高气爽");
				break;
			case "冬天":
				System.out.println("冬雪皑皑");
				break;
			default:
				System.out.println("季节错误");
		}
	}
}
