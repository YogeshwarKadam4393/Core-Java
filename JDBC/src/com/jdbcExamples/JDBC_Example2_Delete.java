package com.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Example2_Delete {
	
	public static void main(String[] args) {
		
		try {
			// 1. To Load The Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. To Create Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
			
			// 3. Build SQL query
			String query1 = "delete FROM employee where eid = 104";  // Delete the Employee Data With Given Id
			
			
			// 4. To Create Statement 
			Statement statement = connection.createStatement();
			
			// 5. Execute Statement
			statement.executeUpdate(query1); 
			
			// 6. Close the Connection
			connection.close();		
			
			System.out.println("Employee Delete Successfully...!!");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
