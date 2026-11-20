package com.jdbcBank.exceptionHandlers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handlers {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int getVerifiedUserChoice() {
		
		int op = 0;
		
		try {
			op = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.print("-->[ERROR] Invalid input. "
					+ "\n--> Please Enter a Valid Numeric Option :- ");
			return getVerifiedUserChoice();
		}
		return op;
	}
}
