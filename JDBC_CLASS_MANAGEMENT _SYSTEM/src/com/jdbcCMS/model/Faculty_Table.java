package com.jdbcCMS.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbcCMS.connection.My_Connection;

public class Faculty_Table {
	
	private static void createFacultyTable() {
		
		try (Connection connection = My_Connection.getConnection();
				Statement smt = connection.createStatement();) {
			String sql1 = "CREATE TABLE faculty (fid INT PRIMARY KEY AUTO_INCREMENT, fname VARCHAR(50) NOT NULL UNIQUE,"
					+ "cid INT,FOREIGN KEY (cid) REFERENCES course(cid))";
			String sql2 ="ALTER TABLE faculty AUTO_INCREMENT=101";
			smt.executeUpdate(sql1);
			smt.executeUpdate(sql2);
			System.out.println("");
			System.out.println("==============================================");
			System.out.println("--> Faculty Table Created");
		} catch (ClassNotFoundException ce) {
			System.out.println(ce);
		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		createFacultyTable();
	}
}
