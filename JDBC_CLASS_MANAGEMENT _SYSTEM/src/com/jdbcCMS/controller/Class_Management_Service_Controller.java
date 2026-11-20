package com.jdbcCMS.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.jdbcCMS.connection.My_Connection;
import com.jdbcCMS.serviceIMPL.Class_Management_Service_IMPL;

public class Class_Management_Service_Controller {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Class_Management_Service_IMPL cms = new Class_Management_Service_IMPL();
		displayTitle();
		runClassManagementService(sc, cms);
	}

	private static void runClassManagementService(Scanner sc, Class_Management_Service_IMPL cms) {

		try (Connection connection = My_Connection.getConnection()) {
			boolean flag = true;
			while (flag) {

				System.out.println("");
				System.out.println("=======================================================");
				System.out.println("|             Class Matrix - MAIN MENU                |");
				System.out.println("=======================================================");
				System.out.println("| Option | Description                                |");
				System.out.println("-------------------------------------------------------");
				System.out.println("|   1    | Add Course                                 |");
				System.out.println("|   2    | View All Courses                           |");
				System.out.println("-------------------------------------------------------");
				System.out.println("|   3    | Add Faculty Member                         |");
				System.out.println("|   4    | View All Faculty Members                   |");
				System.out.println("-------------------------------------------------------");
				System.out.println("|   5    | Add Batch                                  |");
				System.out.println("|   6    | View All Batches                           |");
				System.out.println("-------------------------------------------------------");
				System.out.println("|   7    | Register Student                           |");
				System.out.println("|   8    | View All Students                          |");
				System.out.println("|   9    | Fetch Student By ID                        |");
				System.out.println("-------------------------------------------------------");
				System.out.println("|  10    | Update Class Details                       |");
				System.out.println("|  11    | Delete Class By ID                         |");
				System.out.println("-------------------------------------------------------");
				System.out.println("|  12    | Exit Application                           |");
				System.out.println("=======================================================");
				System.out.print("--> Enter Your Preferred Option :- ");
				int op = sc.nextInt();
				System.out.println("=======================================================");
				System.out.println("");
				switch (op) {
				case 1:
					cms.addCourse(connection);
					break;
				case 2:
					cms.fetchAllCourses(connection);
					break;
				case 3:
					cms.addFacultyMember(connection);
					break;
				case 4:
					cms.fetchAllFacultyMembers(connection);
				default:
					break;
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void displayTitle() {
		System.out.println("");
		System.out.println("=======================================================");
		System.out.println("|                                                     |");
		System.out.println("|         >>>  WELCOME TO CLASS MATRIX  <<<           |");
		System.out.println("|                                                     |");
		System.out.println("|         Smart Academic Management System            |");
		System.out.println("|                                                     |");
		System.out.println("=======================================================");
	}
}
