package com.edu.seiryo;

import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dome2 {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://127.0.0.1:1433;DataBaseName=Company";
	private static final String NAME = "sa";
	private static final String PW = "111";
	static Connection connection = null;
	static PreparedStatement pst = null;
	public static Connection getCon() {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,NAME,PW);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	public static void closeCon(Connection con){
		try {
			if(con != null){
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void closeResultSet(ResultSet rst){
		if(rst != null){
			try {
				rst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void closeStatement(Statement pst){
		try {
			if(pst != null){
				pst.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
