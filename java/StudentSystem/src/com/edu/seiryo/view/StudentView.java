package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.entity.Student;
import com.edu.seiryo.service.StudentService;

public class StudentView {
	Scanner scanner = new Scanner(System.in);
	StudentService studentService = new StudentService();
	/**
	 * 判断该学生信息是否存在
	 */
	private void ifSelected(boolean havedSelected){
		if(!havedSelected){
			System.out.println("该学生信息不存在");
		}else{
			System.out.println("操作成功！");
		}
	}
	/**
	 * 第一个界面
	 */
	private void frameOne(){
		studentService.selectAll();
		System.out.println("是否继续[y/n]");
		boolean ifContiue = true;
		while(ifContiue){
			String yesOrNo = scanner.next();
			if(yesOrNo.equals("y")){
				initialStudentSystem();
				ifContiue = false;
			}else if(yesOrNo.equals("n")){
				ifContiue = false;
			}else{
				System.out.println("输入错误请重新输入");
			}
		}
	}
	/**
	 * 选择的第二个画面
	 */
	private void frameTwo(){
		boolean havedSelected = false;
		System.out.println("请输入学生编号");
		int id = scanner.nextInt();
		Student student = studentService.selectById(id);
		System.out.println("编号\t姓名\t性别\t年龄\t班级");
		if(student != null){
			System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getGender()+"\t"+
					student.getAge()+"\t"+student.getClassNumber());
			havedSelected = true;
		}
		ifSelected(havedSelected);
		System.out.println("是否继续[y/n]");
		boolean ifContiue = true;
		while(ifContiue){
			String yesOrNo = scanner.next();
			if(yesOrNo.equals("y")){
				frameTwo();
				ifContiue = false;
			}else if(yesOrNo.equals("n")){
				ifContiue = false;
			}else{
				System.out.println("输入错误请重新输入");
			}
		}
	}
	/**
	 * 选择的第三个界面
	 */
	private void frameThree(){
		System.out.println("请输入学生编号");
		int id = scanner.nextInt();
		System.out.println("请输入要修改的学生年龄");
		int age = scanner.nextInt();
		boolean havedSelected = studentService.setById(id,age);
		ifSelected(havedSelected);
		System.out.println("是否继续[y/n]");
		boolean ifContiue = true;
		while(ifContiue){
			String yesOrNo = scanner.next();
			if(yesOrNo.equals("y")){
				frameThree();
				ifContiue = false;
			}else if(yesOrNo.equals("n")){
				ifContiue = false;
			}else{
				System.out.println("输入错误请重新输入");
			}
		}
	}
	/**
	 * 第四个界面
	 */
	private void frameFour(){
		System.out.println("请输入学生姓名");
		String name = scanner.next();
		System.out.println("请输入要修改的学生班级");
		String classNumber = scanner.next();
		boolean havedSelected = studentService.setByName(name, classNumber);
		ifSelected(havedSelected);
		System.out.println("是否继续[y/n]");
		boolean ifContiue = true;
		while(ifContiue){
			String yesOrNo = scanner.next();
			if(yesOrNo.equals("y")){
				frameFour();
				ifContiue = false;
			}else if(yesOrNo.equals("n")){
				ifContiue = false;
			}else{
				System.out.println("输入错误请重新输入");
			}
		}
	}
	/**
	 * 第五个界面
	 */
	private void frameFive(){
		System.out.println("请输入要查询的学生班级");
		String classNumber = scanner.next();
		boolean havedSelected = studentService.selectByClassNumber(classNumber);
		ifSelected(havedSelected);
		System.out.println("是否继续[y/n]");
		boolean ifContiue = true;
		while(ifContiue){
			String yesOrNo = scanner.next();
			if(yesOrNo.equals("y")){
				//能不能给这个yorn写一个方法，参数列表写该方法的循环自循环方法
				frameFive();
				ifContiue = false;
			}else if(yesOrNo.equals("n")){
				ifContiue = false;
			}else{
				System.out.println("输入错误请重新输入");
			}
		}
	}
	/**
	 * 初始化界面
	 */
	public void initialStudentSystem(){
		System.out.println("欢迎使用青凌学生管理系统");
		System.out.println("----------------------");
		System.out.println("1、显示所有学生信息");
		System.out.println("2、根据编号查询学生信息");
		System.out.println("3、根据编号修改学生年龄");
		System.out.println("4、根据姓名修改学生班级");
		System.out.println("5、根据班级查询全部学生信息");
		System.out.println("----------------------");
		System.out.println("请选择[1/2/3/4/5]：");
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
			System.out.println("输入错误,请重新输入");
			initialStudentSystem();
		}
	}
	//测试用
	public static void main(String[] args) {
		new StudentView().initialStudentSystem();
	}
}
