package com.throwAndThrowsKeyword;

import java.util.Scanner;

public class ValidationChecker_throw {

	public static void ageValidation(int age) {

		try {

			if (age >= 18) {
				System.out.println("Account Creation Successfull...!!");
				return;
			} else {
				throw new ArithmeticException(
						"You are not Eligible For Account Creation...!!\nAge Should Be Minimum 18...!!");
			}

		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());

			Scanner sc = new Scanner(System.in);

			System.out.println("-----------------------------------------------------------------------------------");

			System.out.print("Enter Your Age Again: ");
			int age1 = sc.nextInt();

			ageValidation(age1);
		}
	}

}
