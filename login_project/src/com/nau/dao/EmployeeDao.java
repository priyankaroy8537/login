package com.nau.dao;

import java.util.List;

import com.nau.model.Employee;
import com.nau.model.Login;

public interface EmployeeDao {
	Integer saveUser(List<Employee> logins);
}
