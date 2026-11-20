package com.PREPAREDSTATEMENT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EXAMPLE_01_INSERT {

	public static void main(String[] args) {

		System.out.println("USING PREPARED STATEMENT");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Roll Number : ");
		int rollNo = sc.nextInt();

		System.out.println("Enter Your Name : ");
		String name = sc.next();

		System.out.println("Enter Your Address : ");
		String address = sc.next();

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");

		 // String query1 = "create table student (rollNo int , name varchar(50) , address varchar(50))";
			String query2 = "insert into student values(?,?,?)";

			PreparedStatement ps = connection.prepareStatement(query2);

			ps.setInt(1, rollNo);
			ps.setString(2, name);
			ps.setString(3, address);

			ps.executeUpdate();

			//System.out.println("Table Created Successfully");
			System.out.println("Data Inserted Successfully");

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
