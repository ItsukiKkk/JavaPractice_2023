package com.game.seiryo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Task2 {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://127.0.0.1:1433;DataBaseName=SanGuoSha";
	private static final String NAME = "sa";
	private static final String PW = "111";
	static Connection connection = null;
	static CallableStatement cst = null;
	public static void main(String[] args) {
//		try {
//			Class.forName(DRIVER);
//			connection = DriverManager.getConnection(URL,NAME,PW);
//			cst = connection.prepareCall("{call proc_Wujiang(?,?)}");
//			cst.setString(1, "蜀国");
//			cst.registerOutParameter(2, Types.INTEGER);
//			cst.execute();
//			int result = cst.getInt(2);
//			System.out.println(" 蜀国有" + result+"武将");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//            try {
//                if (cst != null) cst.close();
//                if (connection != null) connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
		//insert
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,NAME,PW);
			cst = connection.prepareCall("{call proc_insertWujiang(?,?)}");
			cst.setString(1, "诸葛亮");
			cst.setString(2, "蜀国");
			cst.execute();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
            try {
                if (cst != null) cst.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}
}
