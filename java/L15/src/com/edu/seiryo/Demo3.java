package com.edu.seiryo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Demo3 {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://127.0.0.1:1433;DataBaseName=Users";
	private static final String NAME = "sa";
	private static final String PW = "111";
	static Connection connection = null;
	static PreparedStatement pst = null;
	public static void main(String[] args) {
		ResultSet resultSet = null;
		try {
			connection = Dome2.getCon();
			pst = connection.prepareStatement("select * from Company where price > ?");
			pst.setInt(1, 12000000);
			resultSet = pst.executeQuery();
			while (resultSet.next()) {
				System.out.println("公司："+resultSet.getString("name")+"\t市值（单位千美元）"+resultSet.getInt(3));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			Dome2.closeStatement(pst);
			Dome2.closeResultSet(resultSet);
			Dome2.closeCon(connection);
		}
	}
}
