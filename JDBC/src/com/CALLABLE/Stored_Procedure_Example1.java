package com.CALLABLE;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

import com.connection.MyConnection;

public class Stored_Procedure_Example1 {

	public static void fetchAllDetailsOfEmployees() {

		try {

			Connection connection = MyConnection.getConnection();

			String query = "call fetch_employees";

			CallableStatement call = connection.prepareCall(query);

			ResultSet result = call.executeQuery();

			while (result.next()) {
				
				System.out.println(result.getInt(1) + "   " + result.getString(2));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void updateEmployeeName() {
		
		Scanner sc = new Scanner(System.in);
		
		try {

			Connection connection = MyConnection.getConnection();

			String query = "call update_employeeName(?,?)";

			CallableStatement call = connection.prepareCall(query);
			
			System.out.println("Enter Updated Name : ");
			call.setString(1, sc.next());
			
			System.out.println("Enter Id : ");
			call.setInt(2, sc.nextInt());

			call.executeUpdate();

			System.out.println("EMPLOYEE NAME UPDATED SUCCESSFULLY...");

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	

	public static void main(String[] args) {
		
		fetchAllDetailsOfEmployees();
		
		updateEmployeeName();
	}

}
