package com.validations;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidationChecker {

	public static String getValidVehicleNumber() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			String vehicleNumber = sc.nextLine().toUpperCase();

			if (Pattern.matches("[A-Za-z]{2}[ ]{1}[0-9]{2}[ ]{1}[A-Za-z]{2}[ ]{1}[0-9]{4}", vehicleNumber)) {
				return vehicleNumber;

			} else {

				System.out.println("\nInvalid Vehicle Number...!");
				System.out.print("RE-ENTER VEHICLE NUMBER   : ");
			}
		}
	}

	// Method to validate First Name
	public static String checkFirstName() {

		Scanner sc = new Scanner(System.in);

		while (true) {

				String name = sc.next();

				if (Pattern.matches("[A-Za-z]+", name)) {
					return name;
				} else {
					System.out.println("  ◆ Invalid Name...!");
					System.out.print("\n  ➤ RE-ENTER YOUR FIRST NAME            : ");
				}
			} 
		}
	

	// Method to validate Middle Name
	public static String checkMiddleName() {
		
		Scanner sc = new Scanner(System.in);

		while (true) {

			try {

				String name = sc.next();

				if (Pattern.matches("[A-Za-z]+", name)) {
					return name;
				} else {
					System.out.println("  ◆ Invalid Name...!");
					System.out.print("\n  ➤ RE-ENTER YOUR MIDDLE NAME           : ");
				}

			} catch (Exception e) {

				System.out.println("  ◆ Invalid Input...!");

				System.out.print("\n  ➤ RE-ENTER YOUR MIDDLE NAME           : ");
			}
		}
	}

	// Method to validate Last Name
	public static String checkLastName() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			try {

				String name = sc.next();

				if (Pattern.matches("[A-Za-z]+", name)) {
					return name;
				} else {
					System.out.println("  ◆ Invalid Name...!");
					System.out.print("\n  ➤ RE-ENTER YOUR LAST NAME             : ");
				}

			} catch (Exception e) {

				System.out.println("  ◆ Invalid Input...!");

				System.out.print("\n  ➤ RE-ENTER YOUR LAST NAME             : ");
			}
		}
	}
	
	
	

}
