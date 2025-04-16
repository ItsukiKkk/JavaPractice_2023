package com.edu.seiryo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo6 {
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
			pst = connection.prepareStatement("delete from Company1 where id = ?");
			pst.setInt(1, 1);
			if(pst.executeUpdate()>0)
				System.out.println("数据删除成功");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			pst.close();
			connection.close();
		}
	}
}
