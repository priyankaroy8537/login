package com.nau.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.nau.database.DBConnection;
import com.nau.model.Login;

public class LoginDaoImpl extends LoginDaoAdaptor {

	private Connection connection = DBConnection.getConnection();

	@Override
	public Integer saveUser(List<Login> logins) {
		System.out.println("in dao");

//		try {
//			Statement statement = connection.createStatement();
//			for (Login login : logins) {
//				Integer userId = login.getUserId();
//				String password = login.getPassword();
//				String lname = login.getlName();
//				String fname = login.getFname();
//				String sql = "insert into login values(" + userId + ",'" + password + "','" + lname + "','" + fname
//						+ "')";
//				statement.addBatch(sql);
//			}
//			int count[] = statement.executeBatch();
//			return count.length;
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		try {
			String sql = "insert into login values(?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			for (Login login : logins) {
				Integer userId = login.getUserId();
				String password = login.getPassword();
				String lname = login.getlName();
				String fname = login.getFname();
				statement.setInt(1, userId);
				statement.setString(2, password);
				statement.setString(3, fname);
				statement.setString(4, lname);
				statement.addBatch();
			}
			int count[] = statement.executeBatch();
			return count.length;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}
}
