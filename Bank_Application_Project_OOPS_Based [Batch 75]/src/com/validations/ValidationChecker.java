package com.validations;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidationChecker {

	static Scanner sc = new Scanner(System.in);

	// Method to validate First Name
	public static String checkFirstName() {

		while (true) {

			try {

				String name = sc.next();

				if (Pattern.matches("[A-Za-z]+", name)) {
					return name;
				} else {
					System.out.println("  ◆ Invalid Name...!");
					System.out.print("\n  ➤ RE-ENTER YOUR FIRST NAME            : ");
				}
			} catch (Exception e) {
				System.out.println("  ◆ Invalid Input...!");
				System.out.print("\n  ➤ RE-ENTER YOUR FIRST NAME            : ");
			}
		}
	}

	// Method to validate Middle Name
	public static String checkMiddleName() {

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

	// Validates Aadhar number
	// Format: 12 digits with spaces
	// Example: 2345 6789 0123
	public static String aadharValidation() {

		while (true) {

			try {

				String adharCardNumber = sc.nextLine();

				if (Pattern.matches("[2-9]{1}[0-9]{3}[ ]{1}[0-9]{4}[ ]{1}[0-9]{4}", adharCardNumber)) {
					return adharCardNumber;
				} else {
					System.out.println("  ◆ Invalid AadharCard Number...!");
					System.out.print("\n  ➤ RE-ENTER YOUR AADHAR NUMBER         : ");
				}

			} catch (Exception e) {

				System.out.println("  ◆ Invalid Input...!");

				System.out.print("\n  ➤ RE-ENTER YOUR AADHAR NUMBER         : ");
			}
		}
	}

	// Method to validate PAN Card Number
	public static String checkValidPanNumber() {

		while (true) {

			try {

				String panCardNumber = sc.next();

				String upperCasePanNo = panCardNumber.toUpperCase();

				if (Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", upperCasePanNo)) {
					return upperCasePanNo;
				} else {
					System.out.println("  ◆ Invalid Pan Number...!");
					System.out.print("\n  ➤ RE-ENTER YOUR PANCARD NUMBER        : ");
				}

			} catch (Exception e) {

				System.out.println("  ◆ Invalid Input...!");

				System.out.print("\n  ➤ RE-ENTER YOUR PANCARD NUMBER        : ");
			}
		}
	}

	// Method to validate Mobile Number
	public static String getValidMobileno() {

		while (true) {

			try {

				String mobileNo = sc.next();

				if (Pattern.matches("[6-9]{1}[0-9]{9}", mobileNo) && mobileNo.length() == 10) {
					return mobileNo;
				} else {
					System.out.println("  ◆ Invalid Mobile Number...!");
					System.out.print("\n  ➤ RE-ENTER YOUR PHONE NUMBER          : ");
				}

			} catch (Exception e) {

				System.out.println("  ◆ Invalid Input...!");

				System.out.print("\n  ➤ RE-ENTER YOUR PHONE NUMBER          : ");
			}
		}
	}

	// Validates Email format using regex
	public static String emailValidation() {

		while (true) {

			try {

				String email = sc.next();

				// yogesh.kadam | @ | gmail | . | com
				// ↓ ↓ ↓ ↓ ↓
				// username @ domain dot TLD

				if (Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", email)) {
					return email;
				} else {
					System.out.println("  ➤ Invalid Email Address...!");
					System.out.print("\n  ➤ RE-ENTER YOUR EMAIL ADDRESS         : ");
				}

			} catch (Exception e) {

				System.out.println("  ◆ Invalid Input...!");

				System.out.print("\n  ➤ RE-ENTER YOUR EMAIL ADDRESS         : ");
			}
		}
	}
}
