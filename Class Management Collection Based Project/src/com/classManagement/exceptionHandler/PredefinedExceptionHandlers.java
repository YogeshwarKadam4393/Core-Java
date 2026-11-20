package com.classManagement.exceptionHandler;

import java.util.InputMismatchException;
import java.util.Scanner;


public class PredefinedExceptionHandlers {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int getVerifiedOption() {
	    int op = 0;
	//    System.out.println(op);
	    try {
	        op = sc.nextInt();
	    } catch (InputMismatchException e) {
	        System.out.print("-->[ERROR] Invalid input. "
	                + "\n--> Please Enter a Valid Numeric Option :- ");
	        return getVerifiedOption();
	    }
	    return op;
	}
	
	public static int getVerifiedInputValue() {
		
		int n = 0;
		
		try {
			n = sc.nextInt();
//			sc.nextLine();
		} catch (InputMismatchException e) {
			System.out.print("-->[ERROR] Invalid input. "
					+ "\n--> Please Enter a Valid Numeric Value :- ");
			return getVerifiedInputValue();
		}
		return n;
	}
	
//	public static String getVerifiedStringValue() {
//		
//		String value = null;
//		
//		try {
//			value = sc.nextLine();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}

}
