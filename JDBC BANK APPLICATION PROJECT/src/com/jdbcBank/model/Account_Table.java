package com.jdbcBank.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbcBank.connection.My_Connection;

public class Account_Table {

	public static void createAccountTable() throws ClassNotFoundException, SQLException {
		
		Connection connection = My_Connection.getConnection();
		
		String query1 = "CREATE TABLE ACCOUNT (\r\n"
				+ "    Account_Holder_ID INT PRIMARY KEY AUTO_INCREMENT,\r\n"
				+ "    Account_No BIGINT UNIQUE NOT NULL,\r\n"
				+ "    Account_Holder_Name VARCHAR(20) NOT NULL,\r\n"
				+ "    Mobile_No VARCHAR(12) NOT NULL,\r\n"
				+ "    Email_ID VARCHAR(20) NOT NULL,\r\n"
				+ "    PIN INT NOT NULL UNIQUE,\r\n"
				+ "    Aadhar_Card_No VARCHAR(20) UNIQUE,\r\n"
				+ "    Pan_Card_No VARCHAR(20) UNIQUE,\r\n"
				+ "    Address VARCHAR(20),\r\n"
				+ "    Account_Balance DECIMAL(10,4) NOT NULL\r\n"
				+ ");";
		
		String query2 = "ALTER TABLE ACCOUNT AUTO_INCREMENT=101";
		
		try(Statement statement = connection.createStatement();) {
			System.out.println(statement.executeUpdate(query1));
			System.out.println(statement.executeUpdate(query2));
			
			connection.close();	
			
			System.out.println("");
			System.out.println("=================================");
			System.out.println("----- ACCOUNT TABLE CREATED -----");
			System.out.println("=================================");
			System.out.println("");
		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		createAccountTable();
	}
}
