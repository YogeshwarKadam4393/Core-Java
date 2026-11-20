package com.jdbcBank.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class My_Connection {

	private My_Connection() {
	}

	public static Connection connection = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		if (connection == null) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_bank_application_project", "root", "root");
		}
		return connection;
	}
}