package com.seiryo.edu;

public class ExtendsDemo {
	public static void main(String[] args) {
		Engineer software = new Engineer("王刚", 28, "微软");
		software.setName("王刚");
		software.setAge(28);
		software.setCompany("微软");
		software.setPosition("软件工程师");
		software.setSalary(12000);
		System.out.println(software.getAge()+"岁的"+software.getName()+"在"+software.getCompany()+
				"任职"+software.getPosition()+"的岗位，月薪"+software.getSalary());
		Employee ceo = new Employee("李红", 46);
		ceo.info();
	}
}
