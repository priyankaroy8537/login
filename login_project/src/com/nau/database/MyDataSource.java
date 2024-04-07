package com.nau.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDataSource {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

	//	Driver driver = new com.mysql.cj.jdbc.Driver();
	//	DriverManager.registerDriver(new Driver());
	//	Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/";
		String database = "naushad_ey";
		String user = "naushad";
		String password = "naushad";
		Connection connection = DriverManager.getConnection(url+database, user, password);
		System.out.println("Connected");
		
	//	String sql = "insert into login values(666,'nau25','Naushad','Akhtar')";
	//	Statement statement = connection.createStatement();
	//	int c = statement.executeUpdate(sql);
		
	//	System.out.println(c);
		String sql1 = "insert into login values(777,'nau25','Naushad','Akhtar')";
		String sql2 = "insert into login values(888,'nau25','Naushad','Akhtar')";
		Statement statement = connection.createStatement();
		statement.addBatch(sql1);
		statement.addBatch(sql2);
		int count[] = statement.executeBatch();
		System.out.println("Total records inserted is : " + count.length);
	}

}
