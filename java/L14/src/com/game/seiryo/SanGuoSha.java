package com.game.seiryo;


import java.sql.*;
import java.util.concurrent.BlockingDeque;

public class SanGuoSha {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://127.0.0.1:1433;DataBaseName=SanGuoSha";
	private static final String NAME = "sa";
	private static final String PW = "111";
	Connection connection = null;
	PreparedStatement pst = null;
	Statement statement = null;
	public void insertWujiang1(String sql) throws SQLException{
		try{
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,NAME,PW);
			statement = connection.createStatement();
			statement.execute(sql);
			System.out.println("��ӳɹ�");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			statement.close();
			connection.close();
		}
	}
	public void delete(String sql) throws SQLException{
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,NAME,PW);
			statement = connection.createStatement();
			statement.execute(sql);
			System.out.println("ɾ���ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			statement.close();
			connection.close();
		}
	}
	public static void main(String[] args) throws SQLException {
		new SanGuoSha().insertWujiang1("insert into Character(id,name,hp,skill,emotion) values(1,'����',4,'�ʵ�',98)");
		new SanGuoSha().insertWujiang1("insert into Character(id,name,hp,skill,emotion) values(2,'����',4,'�ʵ�',98)");
		new SanGuoSha().insertWujiang1("insert into Character(id,name,hp,skill,emotion) values(3,'�ܲ�',4,'�ʵ�',98)");
		new SanGuoSha().insertWujiang1("insert into Character(id,name,hp,skill,emotion) values(4,'�ĺ',4,'�ʵ�',98)");
		new SanGuoSha().insertWujiang1("insert into Character(id,name,hp,skill,emotion) values(5,'��Ȩ',4,'�ʵ�',98)");
		new SanGuoSha().insertWujiang1("insert into Character(id,name,hp,skill,emotion) values(6,'���',3,'�ʵ�',98)");
		new SanGuoSha().insertWujiang1("update Character set skill = '����' where id = 6");
		Connection connection = null;
		PreparedStatement pst1 = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,NAME,PW);
			String sql = "insert into Character(id,name,hp,skill,emotion) values(?,?,?,?,?)";
			pst1 = connection.prepareStatement(sql);
			pst1.setInt(1, 1);
			pst1.setString(2, "����");
			pst1.setInt(3, 4);
			pst1.setString(4, "�ʵ�");
			pst1.setInt(5, 98);
			pst1.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			pst1.close();
			connection.close();
		}
		new SanGuoSha().delete("delete from Character where id = 6");
	}
}
