package com.PREPAREDSTATEMENT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EXAMPLE_02_UPDATE {

	public static void main(String[] args) {

		System.out.println("USING PREPARED STATEMENT");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Roll Number : ");
		int rollNo = sc.nextInt();

		System.out.println("Enter New Name : ");
		String name = sc.next();

		System.out.println("Enter New Address : ");
		String address = sc.next();

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");

			String query2 = "update student set name = ?, address = ? where rollNo = ?";

			PreparedStatement ps = connection.prepareStatement(query2);

			ps.setString(1, name);
			ps.setString(2, address);
			ps.setInt(3, rollNo);

			ps.executeUpdate();

			System.out.println("Data Updated Successfully");

			connection.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}