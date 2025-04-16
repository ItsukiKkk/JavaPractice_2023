package com.edu.seiryo.test;

public class Round {
	static final double PI = 3.1415926;
	int r;
	Round(int radius){
		r = radius;
	}
	double getAreas(){
		return 2*PI*r;
	}
}
