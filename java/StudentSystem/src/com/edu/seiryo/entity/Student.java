package com.edu.seiryo.entity;

public class Student {
	/**
	 * 编号
	 */
	private int id;
	/**
	 * 实现编号自增
	 */
	private static int count = 0;
	/**
	 * 学生姓名
	 */
	private String name;
	/**
	 * 性别
	 */
	private String gender;
	/**
	 * 年龄
	 */
	private int age;
	/**
	 * 班号
	 */
	private String classNumber;
	/**
	 * 查看编号
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * 设置编号
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 返回姓名
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置姓名
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 返回性别
	 * @return
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * 设置性别
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * 返回年龄
	 * @return
	 */
	public int getAge() {
		return age;
	}
	/**
	 * 设置年龄
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 返回班级
	 * @return
	 */
	public String getClassNumber() {
		return classNumber;
	}
	/**
	 * 设置班级
	 * @param classNumber
	 */
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
	/**
	 * 有参构造方法
	 * @param name
	 * @param gender
	 * @param age
	 * @param classNumber
	 */
	public Student(String name, String gender, int age, String classNumber) {
		super();
		this.id = ++count;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.classNumber = classNumber;
	}
	/**
	 * 无参构造方法
	 */
	public Student() {
		super();
	}
	/**
	 * 重写toString
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", classNumber="
				+ classNumber + "]";
	}
}
