package com.validations;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.customExceptions.InvalidAadharNumberException;
import com.customExceptions.InvalidMobileNumberException;
import com.customExceptions.InvalidPanCardNumberException;

public class ValidationChecker {

	// Validates Aadhaar number format (12 digits, starts with 2–9).
	public static String aadharValidation() {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("\nEnter Your Aadhar Number :");
			String adharCardNumber = sc.nextLine();
			if (Pattern.matches("[2-9]{1}[0-9]{3}[ ]{1}[0-9]{4}[ ]{1}[0-9]{4}", adharCardNumber)) {
				return adharCardNumber;
			} else {
				System.out.println("Invalid AadharCard Number...!");
			}
		}
		throw new InvalidAadharNumberException("Maximum 10 Attempts Exceeded...!!");

	}

	// Method to validate PAN Card Number
	public static String checkValidPanNumber() {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("\nEnter Pan Number: ");
			String panCardNumber = sc.next();

			String upperCasePanNo = panCardNumber.toUpperCase();

			if (Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", upperCasePanNo)) {
				return upperCasePanNo;
			} else {
				System.out.println("Invalide Pan Number...!");
			}
		}
		throw new InvalidPanCardNumberException("Maximum 3 Attempts Exceeded");
	}

	public static long getValidMobileno() {

	    Scanner sc = new Scanner(System.in);

	    for (int i = 0; i < 10; i++) {

	        System.out.print("\nEnter mobile Number: ");
	        String mobileNumberLongToString = sc.next();

	        if (Pattern.matches("[6-9]{1}[0-9]{9}", mobileNumberLongToString) && mobileNumberLongToString.length() == 10) {

	            return Long.parseLong(mobileNumberLongToString);
	        } else {
	            System.out.println("Invalid Mobile Number");
	        }
	    }

	    throw new InvalidMobileNumberException("Maximum 3 Attempts Exceeded");
	}
	
	
}