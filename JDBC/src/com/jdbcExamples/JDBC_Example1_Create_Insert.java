package com.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Example1_Create_Insert {
	
	public static void main(String[] args) {
		
		try {
			// 1. To Load The Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. To Create Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
			
			// 3. Build SQL query
			String query1 = "create table employee(eid int,name varchar(100))";
			String query2 = "insert into employee values (104,'Tejas')";
			
			
			// 4. To Create Statement 
			Statement statement = connection.createStatement();
			
			// 5. Execute Statement
			statement.execute(query2);
			
			// 6. Close the Connection
			connection.close();		
			
			System.out.println("Data Inserted Successfully...!!");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
