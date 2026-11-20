package com.jdbcCMS.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbcCMS.connection.My_Connection;

public class Course_Table {
	
	private static void createCourseTable() {
		
		try(Connection connection = My_Connection.getConnection();
			Statement smt = connection.createStatement();) {
			String sql1 = "CREATE TABLE course (cid INT PRIMARY KEY AUTO_INCREMENT, cname VARCHAR(20) NOT NULL UNIQUE)";
			String sql2 ="ALTER TABLE course AUTO_INCREMENT=101";
			smt.executeUpdate(sql1);
			smt.executeUpdate(sql2);
			System.out.println("");
			System.out.println("==============================================");
			System.out.println("--> Course Table Created");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		createCourseTable();
	}
}
