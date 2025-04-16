package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.entity.Student;
import com.edu.seiryo.service.StudentService;

public class StudentView {
	Scanner scanner = new Scanner(System.in);
	StudentService studentService = new StudentService();
	/**
	 * �жϸ�ѧ����Ϣ�Ƿ����
	 */
	private void ifSelected(boolean havedSelected){
		if(!havedSelected){
			System.out.println("��ѧ����Ϣ������");
		}else{
			System.out.println("�����ɹ���");
		}
	}
	/**
	 * ��һ������
	 */
	private void frameOne(){
		studentService.selectAll();
		System.out.println("�Ƿ����[y/n]");
		boolean ifContiue = true;
		while(ifContiue){
			String yesOrNo = scanner.next();
			if(yesOrNo.equals("y")){
				initialStudentSystem();
				ifContiue = false;
			}else if(yesOrNo.equals("n")){
				ifContiue = false;
			}else{
				System.out.println("�����������������");
			}
		}
	}
	/**
	 * ѡ��ĵڶ�������
	 */
	private void frameTwo(){
		boolean havedSelected = false;
		System.out.println("������ѧ�����");
		int id = scanner.nextInt();
		Student student = studentService.selectById(id);
		System.out.println("���\t����\t�Ա�\t����\t�༶");
		if(student != null){
			System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getGender()+"\t"+
					student.getAge()+"\t"+student.getClassNumber());
			havedSelected = true;
		}
		ifSelected(havedSelected);
		System.out.println("�Ƿ����[y/n]");
		boolean ifContiue = true;
		while(ifContiue){
			String yesOrNo = scanner.next();
			if(yesOrNo.equals("y")){
				frameTwo();
				ifContiue = false;
			}else if(yesOrNo.equals("n")){
				ifContiue = false;
			}else{
				System.out.println("�����������������");
			}
		}
	}
	/**
	 * ѡ��ĵ���������
	 */
	private void frameThree(){
		System.out.println("������ѧ�����");
		int id = scanner.nextInt();
		System.out.println("������Ҫ�޸ĵ�ѧ������");
		int age = scanner.nextInt();
		boolean havedSelected = studentService.setById(id,age);
		ifSelected(havedSelected);
		System.out.println("�Ƿ����[y/n]");
		boolean ifContiue = true;
		while(ifContiue){
			String yesOrNo = scanner.next();
			if(yesOrNo.equals("y")){
				frameThree();
				ifContiue = false;
			}else if(yesOrNo.equals("n")){
				ifContiue = false;
			}else{
				System.out.println("�����������������");
			}
		}
	}
	/**
	 * ���ĸ�����
	 */
	private void frameFour(){
		System.out.println("������ѧ������");
		String name = scanner.next();
		System.out.println("������Ҫ�޸ĵ�ѧ���༶");
		String classNumber = scanner.next();
		boolean havedSelected = studentService.setByName(name, classNumber);
		ifSelected(havedSelected);
		System.out.println("�Ƿ����[y/n]");
		boolean ifContiue = true;
		while(ifContiue){
			String yesOrNo = scanner.next();
			if(yesOrNo.equals("y")){
				frameFour();
				ifContiue = false;
			}else if(yesOrNo.equals("n")){
				ifContiue = false;
			}else{
				System.out.println("�����������������");
			}
		}
	}
	/**
	 * ���������
	 */
	private void frameFive(){
		System.out.println("������Ҫ��ѯ��ѧ���༶");
		String classNumber = scanner.next();
		boolean havedSelected = studentService.selectByClassNumber(classNumber);
		ifSelected(havedSelected);
		System.out.println("�Ƿ����[y/n]");
		boolean ifContiue = true;
		while(ifContiue){
			String yesOrNo = scanner.next();
			if(yesOrNo.equals("y")){
				//�ܲ��ܸ����yornдһ�������������б�д�÷�����ѭ����ѭ������
				frameFive();
				ifContiue = false;
			}else if(yesOrNo.equals("n")){
				ifContiue = false;
			}else{
				System.out.println("�����������������");
			}
		}
	}
	/**
	 * ��ʼ������
	 */
	public void initialStudentSystem(){
		System.out.println("��ӭʹ������ѧ������ϵͳ");
		System.out.println("----------------------");
		System.out.println("1����ʾ����ѧ����Ϣ");
		System.out.println("2�����ݱ�Ų�ѯѧ����Ϣ");
		System.out.println("3�����ݱ���޸�ѧ������");
		System.out.println("4�����������޸�ѧ���༶");
		System.out.println("5�����ݰ༶��ѯȫ��ѧ����Ϣ");
		System.out.println("----------------------");
		System.out.println("��ѡ��[1/2/3/4/5]��");
		int choice = scanner.nextInt();
		if(choice == 1){
			frameOne();
		}else if(choice == 2){
			frameTwo();
		}else if(choice == 3){
			frameThree();
		}else if(choice == 4){
			frameFour();
		}else if(choice == 5){
			frameFive();
		}else {
			System.out.println("�������,����������");
			initialStudentSystem();
		}
	}
	//������
	public static void main(String[] args) {
		new StudentView().initialStudentSystem();
	}
}
