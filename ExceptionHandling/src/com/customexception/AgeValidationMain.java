package com.customexception;

import java.util.Scanner;

public class AgeValidationMain {

	public static void main(String[] args) throws AgeValidation {

		System.out.println("=============== Voting Booth =================");

		while (true) {
			try {
				VotingCriteria();
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void VotingCriteria() throws AgeValidation {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Age : ");
		int age = sc.nextInt();

		if (age < 18) {
			throw new AgeValidation("You are Not Eligible For Voting...!!");
		} else {
			System.out.println("You are eligible for Voting...!!");
		}
	}

}
