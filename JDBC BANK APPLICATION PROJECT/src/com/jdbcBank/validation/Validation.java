package com.jdbcBank.validation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
	
	static Scanner sc = new Scanner(System.in);
	
	public static String validateName () {
		
		String name = sc.next();
		
		if(Pattern.matches("^[A-Za-z]+( [A-Za-z]+)*$", name)) {
			return name;
		}else {
			System.out.println("--> [ERROR] Invalid name. Please enter a valid name.");
			return validateName();
		}
	}	
}
