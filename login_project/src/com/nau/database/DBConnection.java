package com.nau.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection connection;
	static {
		
		String url = "jdbc:mysql://localhost:3306/";
		String database = "priyanka_ey";
		String user = "priyanka";
		String password = "priyanka";
		try {
			connection = DriverManager.getConnection(url+database, user, password);
			System.out.println("Connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return connection;
	}
	
}
