package com.edu.seiryo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseUtil {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://127.0.0.1:1433;DataBaseName=Users";
	private static final String NAME = "sa";
	private static final String PW = "111";
	static Connection connection = null;
	static PreparedStatement pst = null;
	public static boolean update(String sql,Object ... objects) throws SQLException{
		boolean hasDone = false;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,NAME,PW);
			pst = connection.prepareStatement(sql);
			for (int i = 0; i < objects.length; i++) {
				pst.setObject(i+1, objects[i]);
			}
			int num = pst.executeUpdate();
			hasDone = num > 0 ? true:false;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			pst.close();
			connection.close();
		}
		return hasDone;
	} 
	public static ResultSet query(String sql,Object ... objects) throws SQLException, ClassNotFoundException{
		ResultSet rSet = null;
		Class.forName(DRIVER);
		connection = DriverManager.getConnection(URL,NAME,PW);
		pst = connection.prepareStatement(sql);
		for (int i = 0; i < objects.length; i++) {
			pst.setObject(i+1, objects[i]);
		}
		rSet = pst.executeQuery();
		return rSet;
	}
}
