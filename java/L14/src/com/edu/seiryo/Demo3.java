package com.edu.seiryo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Demo3 {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String NAME = "sa";
	private static final String PW = "111";
	private static final String URL = "jdbc:sqlserver://127.0.0.1:1433;DataBaseName=Company";
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		try{
			Class.forName(DRIVER);
			System.out.println("�������سɹ���");
			connection = DriverManager.getConnection(URL,NAME,PW);
			System.out.println("���ݿ����ӳɹ�");
			statement = connection.createStatement();
			String sql = "insert into Company1(id,name,price) values(1,'�ٶ�',12000)";
			int num = statement.executeUpdate(sql);
			if(num > 0)
				System.out.println("���ݲ���ɹ���");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			connection.close();
			statement.close();
		}
	}
}
