package com.edu.seiryo;

import java.sql.*;

public class Demo4 {
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
			pst = connection.prepareStatement("insert into Company1(id,name,price) values(?,?,?)");
			pst.setInt(1, 2);
			pst.setString(2, "腾讯");
			pst.setInt(3, 140000);
			pst.execute();
			System.out.println("数据插入成功！");
		}catch(Exception exception){
			exception.printStackTrace();
		}finally{
			pst.close();
			connection.close();
		}
	}
}
