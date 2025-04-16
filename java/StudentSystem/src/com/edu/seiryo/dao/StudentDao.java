package com.edu.seiryo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.edu.seiryo.entity.Student;
import com.edu.seiryo.util.DataBaseUtil;

public class StudentDao{
/**
 * 	1����ʾ����ѧ����Ϣ
 * @return
 * @throws SQLException 
 */
	public List<Student> selectAll() throws ClassNotFoundException, SQLException {
	    String sql = "SELECT * FROM Students";
	    try (ResultSet rs = DataBaseUtil.query(sql)) {
	        List<Student> students = new ArrayList<>();
	        while (rs.next()) {
	            students.add(new Student(rs.getString("name"), rs.getString("gender"), rs.getInt("age"), rs.getString("classId")));
	        }
	        return students;
	    }
	}

/**
 * 	2�����ݱ�Ų�ѯѧ����Ϣ
 * @param id
 * @return
 * @throws SQLException 
 *///����ĳ�Student���ͣ�Ҫ���ض�������
	public static Student selectById(int id) throws SQLException, ClassNotFoundException {
	    String sql = "SELECT * FROM Students WHERE id = ?";
	    try (ResultSet rs = DataBaseUtil.query(sql, id)) {
	        if (rs.next()) {
	            return new Student(rs.getString("name"), rs.getString("gender"), rs.getInt("age"), rs.getString("classId"));
	        }
	        return null;
	    }
	}

/**
 * 	3�����ݱ���޸�ѧ������
 * @param id
 * @param age
 * @return
 * @throws SQLException 
 */
	public static boolean setById(int id, int age) throws SQLException, ClassNotFoundException {
	    String sql = "UPDATE Students SET age = ? WHERE id = ?";
	    return DataBaseUtil.update(sql, age, id);
	}

/**
 * 	4�����������޸�ѧ���༶
 * @param name
 * @param classNumber
 * @return
 * @throws SQLException 
 */
	public static boolean setByName(String name, String classNumber) throws SQLException, ClassNotFoundException {
	    String sql = "UPDATE Students SET classNumber = ? WHERE name = ?";
	    return DataBaseUtil.update(sql, classNumber, name);
	}

/**
 * 	5�����ݰ༶��ѯȫ��ѧ����Ϣ
 * @throws SQLException 
 */
	public static  List<Student> selectByClassNumber(String classNumber) throws ClassNotFoundException, SQLException {
	    String sql = "SELECT * FROM Students WHERE classNumber = ?";
	    try (ResultSet rs = DataBaseUtil.query(sql, classNumber)) {
	        List<Student> students = new ArrayList<>();
	        while (rs.next()) {
	            students.add(new Student(rs.getString("name"), rs.getString("gender"), rs.getInt("age"), rs.getString("classId")));
	        }
	        return students;
	    }
	}
}
