package com.nau.service;

import java.util.Arrays;
import java.util.List;

import com.nau.dao.LoginDao;
import com.nau.dao.LoginDaoImpl;
import com.nau.model.Login;

public class LoginServiceImpl extends LoginServiceAdaptor {

	private LoginDao loginDao = new LoginDaoImpl();
	
	@Override
	public Integer addUser(Login... logins) {
		List<Login> loginslist = Arrays.asList(logins);
		for(Login login: loginslist) {
			login.setFname(login.getFname().toUpperCase());
			login.setlName(login.getlName().toUpperCase());
			System.out.println(login);
		}
		//System.out.println(loginslist);
		Integer count = loginDao.saveUser(loginslist);
		
		
		return count;
	}

}
