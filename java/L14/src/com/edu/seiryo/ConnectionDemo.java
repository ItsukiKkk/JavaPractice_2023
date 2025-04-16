package com.edu.seiryo;

public class ConnectionDemo {
	static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static void main(String[] args) {
		try{
			Class.forName(DRIVER);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
