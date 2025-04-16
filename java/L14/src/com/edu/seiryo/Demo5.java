package com.edu.seiryo;

import java.sql.*;

public class Demo5 {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://127.0.0.1:1433;DataBaseName=Company";
	private static final String NAME = "sa";
	private static final String PW = "111";
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement pst = null;
		try{
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,NAME,PW);
			pst = connection.prepareStatement("update Company1 set price = ? where id = ?");
			pst.setInt(1, 150000);
			pst.setInt(2, 2);
			if(pst.executeUpdate()>0)
				System.out.println("数据秀才成功");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			pst.close();
			connection.close();
		}
	}
}
