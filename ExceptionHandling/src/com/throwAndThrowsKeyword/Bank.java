package com.throwAndThrowsKeyword;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter Your Age : ");
			int age = sc.nextInt();
			
			ValidationChecker_throw.ageValidation(age);
		} catch (InputMismatchException | ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
