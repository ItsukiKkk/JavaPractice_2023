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
			System.out.println("�������سɹ�");
			connection = DriverManager.getConnection(URL,NAME,PW);
			System.out.println("���ݿ����ӳɹ�");
			pst = connection.prepareStatement("select * from Company");
			ResultSet resultSet = pst.executeQuery();
			while(resultSet.next()){
				System.out.println("��˾��"+resultSet.getString("name")+"\t��ֵ����λǧ��Ԫ��"+resultSet.getInt(3));
			}
			System.out.println("���ݲ�ѯ�ɹ�");
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
