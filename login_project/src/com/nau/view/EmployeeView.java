package com.nau.view;

import java.util.Scanner;

import com.nau.model.Employee;
import com.nau.model.Login;
import com.nau.service.EmployeeService;
import com.nau.service.EmployeeServiceImpl;

public class EmployeeView {
	private Scanner input = new Scanner(System.in);
	public EmployeeView() {
		register();
	}
	private void register() {
		System.out.println("=========  Login =========");
		System.out.println("Enter UserId: ");
		Integer userId = input.nextInt();
//		System.out.println("Enter Password: ");
//		String password = input.next();/
		System.out.println("Enter Lname:");
		String lname=input.next();
		System.out.println("Enter Fname:");
		String fname=input.next();
		
		//System.out.println(userId + " " + password); // logged
		Employee emp = new Employee(userId,lname,fname);
		//Login login2 = new Login(121, password,"naushad","akhtar");
		EmployeeService empService = new EmployeeServiceImpl();
		int count = empService.addUser(emp);
		System.out.println("Total Saved " + count);
;	}
}
