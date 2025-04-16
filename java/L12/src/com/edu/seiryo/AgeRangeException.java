package com.edu.seiryo;

public class AgeRangeException extends Exception{
	String message;
	public AgeRangeException(String message) {
		super(message);
	}
	public AgeRangeException() {
		super();
	}
}
