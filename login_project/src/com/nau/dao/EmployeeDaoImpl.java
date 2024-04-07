package com.nau.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.nau.database.DBConnection;
import com.nau.model.Employee;
import com.nau.model.Login;

public class EmployeeDaoImpl extends EmployeeDaoAdaptor {
	private Connection connection = DBConnection.getConnection();
	@Override
	public Integer saveUser(List<Employee> emps) {
		// TODO Auto-generated method stub
		System.out.println(" ");
		
	try {
		String sql = "insert into employee values(?,?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		for (Employee emp : emps) {
			Integer userId = emp.getId();
			//String password = login.getPassword();
			String lname = emp.getLname();
			String fname = emp.getFname();
			statement.setInt(1, userId);
			//statement.setString(2, password);
			statement.setString(2, lname);
			statement.setString(3, fname);
			statement.addBatch();
		}
		int count[] = statement.executeBatch();
		return count.length;
	}catch(SQLException e){
		e.printStackTrace();
	}
	return 0;
	}

}
