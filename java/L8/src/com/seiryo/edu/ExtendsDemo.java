package com.seiryo.edu;

public class ExtendsDemo {
	public static void main(String[] args) {
		Engineer software = new Engineer("����", 28, "΢��");
		software.setName("����");
		software.setAge(28);
		software.setCompany("΢��");
		software.setPosition("�������ʦ");
		software.setSalary(12000);
		System.out.println(software.getAge()+"���"+software.getName()+"��"+software.getCompany()+
				"��ְ"+software.getPosition()+"�ĸ�λ����н"+software.getSalary());
		Employee ceo = new Employee("���", 46);
		ceo.info();
	}
}
