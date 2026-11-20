package com.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Example4_Resultset_SelectQuery {
	
	public static void main(String[] args) {
		
		try {
			// 1. To Load The Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. To Create Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
			
			// 3. Build SQL query
			String query1 = "Select * from Employee";
						
			// 4. To Create Statement 
			Statement statement = connection.createStatement();
			
			// 5. Execute Statement
			ResultSet selectQuery = statement.executeQuery(query1);  // To get all data we have to do  executeQuery and its return type  is resultSet
			
			while(selectQuery.next()) {
				System.out.println(selectQuery.getInt(1) + "  " + selectQuery.getString("name"));
			}
			
			// 6. Close the Connection
			connection.close();		
			
			System.out.println("Data Fetched Successfully...!!");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
