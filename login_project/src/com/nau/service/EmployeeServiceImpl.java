package com.nau.service;

import java.util.Arrays;
import java.util.List;

import com.nau.dao.EmployeeDao;
import com.nau.dao.EmployeeDaoImpl;
import com.nau.dao.LoginDao;
import com.nau.dao.LoginDaoImpl;
import com.nau.model.Employee;
import com.nau.model.Login;

public class EmployeeServiceImpl extends EmployeeServiceAdaptor {
private EmployeeDao loginDao = new EmployeeDaoImpl();
	
	@Override
	public Integer addUser(Employee... emp) {
		List<Employee> emplist = Arrays.asList(emp);
		for(Employee emps: emplist) {
			emps.setFname(emps.getFname().toUpperCase());
			emps.setLname(emps.getLname().toUpperCase());
			System.out.println(emps);
		}
		//System.out.println(loginslist);
		Integer count = loginDao.saveUser(emplist);
		
		
		return count;
	}
}
