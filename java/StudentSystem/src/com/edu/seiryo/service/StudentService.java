package com.edu.seiryo.service;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.edu.seiryo.dao.StudentDao;
import com.edu.seiryo.entity.Student;

public class StudentService {
	Scanner scanner = new Scanner(System.in);
	
/**
 * 1、显示所有学生信息
 */
	public void selectAll(){
		StudentDao dao = new StudentDao();
		List<Student> list = null;
		try {
			list = dao.selectAll();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Student i: list){
			System.out.println(i.getId()+"\t"+i.getName()+"\t"+i.getGender()+"\t"+
					i.getAge()+"\t"+i.getClassNumber());
		}
	}
/**
 * 	2、根据编号查询学生信息
 * @param id
 * @return
 */
	public Student selectById(int id){
		List<Student> list = null;
		Student student = null;
		if(id <= list.size() && id > 0){
			try {
				student = StudentDao.selectById(id);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return student;
	}
/**
 * 	3、根据编号修改学生年龄
 * @param id
 * @param age
 * @return
 */
	public boolean setById(int id, int age){
		boolean hasReset = false;
		List<Student> list = null;
		if(id <= list.size() && id > 0){
			try {
				hasReset = StudentDao.setById(id, age);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return hasReset;
	}
/**
 * 	4、根据姓名修改学生班级
 * @param name
 * @param classNumber
 * @return
 */
	public boolean setByName(String name, String classNumber){
		boolean havedSelected = false;
		try {
			havedSelected = StudentDao.setByName(name, classNumber);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return havedSelected;
	}
/**
 * 	5、根据班级查询全部学生信息
 * @param classNumber
 * @return
 */
	public boolean selectByClassNumber(String classNumber){
		boolean havedSelected = false;
		List<Student> studentsList = null;
		try {
			studentsList = StudentDao.selectByClassNumber(classNumber);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(studentsList != null){
			//这里的打印放在view还是这
			for (Student i: studentsList) {
				System.out.println(i.getId()+"\t"+i.getName()+"\t"+i.getGender()+"\t"+
						i.getAge()+"\t"+i.getClassNumber());
				havedSelected = true;
			}
		}
		return havedSelected;
	}
	//测试方法
//	public static void main(String[] args) {
//		new StudentService().selectByClassNumber();
//	}
}
