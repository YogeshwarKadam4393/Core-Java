package com.jdbcCMS.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class My_Connection {
	
	private My_Connection() {}
	
	public static Connection connection = null;
	
	public static Connection getConnection() throws ClassNotFoundException,SQLException {
		if(connection == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_class_management_system?useSSL=false",
					"root", "root");
		}
		return connection;
	}
}
