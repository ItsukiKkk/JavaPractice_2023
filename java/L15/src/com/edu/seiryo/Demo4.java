package com.edu.seiryo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Types;

public class Demo4 {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://127.0.0.1:1433;DataBaseName=Users";
	private static final String NAME = "sa";
	private static final String PW = "111";
	static Connection con = null;
	static CallableStatement cst = null;
	public static void main(String[] args) {
		try {
			con = Dome2.getCon();
			cst = con.prepareCall("{call proc_Company(?,?)}");
			String name = "¹È¸è";
			cst.setString(1, name);
			cst.registerOutParameter(2, Types.INTEGER);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Dome2.closeStatement(cst);
			Dome2.closeCon(con);
		}
	}
}
