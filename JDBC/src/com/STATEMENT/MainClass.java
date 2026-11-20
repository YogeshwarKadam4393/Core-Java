package com.STATEMENT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainClass {
	
	public static void main(String[] args) {
		
		try {
			// 1. To Load The Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. To Create Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
			
			// 3. Build SQL query
			String query1 = "create table Order(oid int,oname varchar(100))";
			String query2 = "insert into Order values (1001,'IPhone 17')";
			
			
			// 4. To Create Statement 
			Statement statement = connection.createStatement();
			
			// 5. Execute Statement
			statement.execute(query1);
			
			// 6. Close the Connection
			connection.close();		
			
			System.out.println("Data Inserted Successfully...!!");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
