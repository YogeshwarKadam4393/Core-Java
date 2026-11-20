package com.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Example3_Update {
	
	public static void main(String[] args) {
		
		try {
			// 1. To Load The Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. To Create Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
			
			// 3. Build SQL query
			String query1 = "update employee set name = 'Pratap' where eid = 102";
			
			
			// 4. To Create Statement 
			Statement statement = connection.createStatement();
			
			// 5. Execute Statement
			int updatedCount = statement.executeUpdate(query1);  // executeUpdate Returns the count how much data is affected in the DB
			System.out.println("Count : " + updatedCount);
			// 6. Close the Connection
			connection.close();		
			
			System.out.println("Data Updated Successfully...!!");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
