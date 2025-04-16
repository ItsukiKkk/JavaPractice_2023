package com.edu.seiryo.service;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.edu.seiryo.dao.StudentDao;
import com.edu.seiryo.entity.Student;

public class StudentService {
	Scanner scanner = new Scanner(System.in);
	
/**
 * 1����ʾ����ѧ����Ϣ
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
 * 	2�����ݱ�Ų�ѯѧ����Ϣ
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
 * 	3�����ݱ���޸�ѧ������
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
 * 	4�����������޸�ѧ���༶
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
 * 	5�����ݰ༶��ѯȫ��ѧ����Ϣ
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
			//����Ĵ�ӡ����view������
			for (Student i: studentsList) {
				System.out.println(i.getId()+"\t"+i.getName()+"\t"+i.getGender()+"\t"+
						i.getAge()+"\t"+i.getClassNumber());
				havedSelected = true;
			}
		}
		return havedSelected;
	}
	//���Է���
//	public static void main(String[] args) {
//		new StudentService().selectByClassNumber();
//	}
}
