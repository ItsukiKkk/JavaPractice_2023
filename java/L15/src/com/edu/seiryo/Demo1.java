package com.edu.seiryo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo1 {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://127.0.0.1:1433;DataBaseName=Seiryo";
	private static final String NAME = "sa";
	private static final String PW = "111";
	static Connection connection = null;
	static PreparedStatement pst = null;
	public static void main(String[] args) {
		try {
			Class.forName(DRIVER);
			System.out.println("驱动加载成功");
			connection = DriverManager.getConnection(URL,NAME,PW);
			System.out.println("数据库连接成功");
			pst = connection.prepareStatement("select * from Company");
			ResultSet resultSet = pst.executeQuery();
			while(resultSet.next()){
				System.out.println("公司："+resultSet.getString("name")+"\t市值（单位千美元）"+resultSet.getInt(3));
			}
			System.out.println("数据查询成功");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
