package com.jdbcCMS.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbcCMS.connection.My_Connection;

public class Student_Table {
	
	private static void createStudentTable() {
		
		try (Connection connection = My_Connection.getConnection();
				Statement smt = connection.createStatement();) {
			String sql1 = "CREATE TABLE student (sid INT PRIMARY KEY AUTO_INCREMENT, sname VARCHAR(50) NOT NULL UNIQUE"
					+ ", bid INT, FOREIGN KEY (bid) REFERENCES batch(bid))";
			String sql2 ="ALTER TABLE student AUTO_INCREMENT=101";
			smt.executeUpdate(sql1);
			smt.executeUpdate(sql2);
			System.out.println("");
			System.out.println("==============================================");
			System.out.println("--> Student Table Created");
		} catch (ClassNotFoundException ce) {
			System.out.println(ce);
		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		createStudentTable();
	}
}
