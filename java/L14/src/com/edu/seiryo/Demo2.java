package com.edu.seiryo;


import java.sql.*;

public class Demo2 {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
	private static final String URL = "jdbc:sqlserver://127.0.0.1:1433;DataBaseName=Company";
	private static final String NAME = "sa";
	private static final String PW = "111";
	public static void main(String[] args) throws SQLException {
		Connection connection= null;
		try{
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,NAME,PW);
			System.out.println(connection);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}
