package com.edu.seiryo.entity;

public class Student {
	/**
	 * ���
	 */
	private int id;
	/**
	 * ʵ�ֱ������
	 */
	private static int count = 0;
	/**
	 * ѧ������
	 */
	private String name;
	/**
	 * �Ա�
	 */
	private String gender;
	/**
	 * ����
	 */
	private int age;
	/**
	 * ���
	 */
	private String classNumber;
	/**
	 * �鿴���
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * ���ñ��
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * ��������
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * ��������
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * �����Ա�
	 * @return
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * �����Ա�
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * ��������
	 * @return
	 */
	public int getAge() {
		return age;
	}
	/**
	 * ��������
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * ���ذ༶
	 * @return
	 */
	public String getClassNumber() {
		return classNumber;
	}
	/**
	 * ���ð༶
	 * @param classNumber
	 */
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
	/**
	 * �вι��췽��
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
	 * �޲ι��췽��
	 */
	public Student() {
		super();
	}
	/**
	 * ��дtoString
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", classNumber="
				+ classNumber + "]";
	}
}
