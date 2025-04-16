package com.game.seiryo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Task1 {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://127.0.0.1:1433;DataBaseName=SanGuoSha";
	private static final String NAME = "sa";
	private static final String PW = "111";
	static Connection connection = null;
	static PreparedStatement pst = null;
	public static void main(String[] args) {
		ResultSet resultSet = null;
		String sql = "select id,name,hp,skill,emotion from Character";
		String sql1 = "select id,name,hp,skill,emotion from Character where hp = 4";
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,NAME,PW);
			pst = connection.prepareStatement(sql1);
			resultSet = pst.executeQuery();
			System.out.println("编号\t名字\t血量\t技能\t情谊");
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				int hp = resultSet.getInt(3);
				String skill = resultSet.getString(4);
				String emotion = resultSet.getString(5);
				System.out.println(id+"\t"+name+"\t"+hp+"\t"+skill+"\t"+emotion);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
