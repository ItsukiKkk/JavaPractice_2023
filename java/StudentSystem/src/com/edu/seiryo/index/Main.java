package com.edu.seiryo.index;

import com.edu.seiryo.view.StudentView;
import com.edu.seiryo.view.UserView;

public class Main {	
	public static void main(String[] args) {
		UserView userView = new UserView();
		StudentView studentView = new StudentView();
		boolean havedLogin = false;
		while(!havedLogin){
			havedLogin = userView.initialUserSystem();
		}
		while(true){
			studentView.initialStudentSystem();
		}
	}
}
