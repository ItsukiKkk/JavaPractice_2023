package com.edu.seiryo;

public class ThrowException {
	public static void main(String[] args) {
		Employee employee = new Employee("�׾�", 65);
		if(employee.getName() != null){
			employee.showEmpInfo();
		}
	}
}
