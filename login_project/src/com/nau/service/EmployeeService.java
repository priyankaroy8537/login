package com.nau.service;

import com.nau.model.Employee;
import com.nau.model.Login;

public interface EmployeeService {
	Integer addUser(Employee... emp);
}
