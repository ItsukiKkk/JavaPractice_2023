package com.edu.seiryo.five;

public class Conversation {
	final double A = 2.5400;
	final int B = 1852;
	double d,c; 
	public double getCM(int d){
		this.d = d * A;
		return d;
	}
	public double getM(int c){
		this.c = c * A;
		return c * B;
	}
}
