package com.nau.view;

import java.util.Scanner;

import com.nau.model.Login;
import com.nau.service.LoginService;
import com.nau.service.LoginServiceImpl;
public class LoginView {
	private Scanner input = new Scanner(System.in);
	public LoginView() {
		login();
	}
	private void login() {
		System.out.println("=========  Login =========");
		System.out.println("Enter UserId: ");
		Integer userId = input.nextInt();
		System.out.println("Enter Password: ");
		String password = input.next();
		System.out.println(userId + " " + password); // logged
		Login login1 = new Login(userId, password,"naushad","akhtar");
		Login login2 = new Login(121, password,"naushad","akhtar");
		LoginService loginService = new LoginServiceImpl();
		int count = loginService.addUser(login1,login2);
		System.out.println("Total Saved " + count);
;	}
}
