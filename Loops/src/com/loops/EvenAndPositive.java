package com.loops;

import java.util.Scanner;

public class EvenAndPositive {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter Your Number :");
//		int num = sc.nextInt();
//
//		if ((num > 0) && (num % 2 == 0)) {
//			System.out.println("Given Number is Even and Positive");
//		} else {
//			System.out.println("Given Number is Not Even and Positive");
//		}
		
		boolean flag = true;

		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Your Number :");
			int num = sc.nextInt();
			
			if ((num > 0) && (num % 2 == 0)) {
				System.out.println("Given Number is Even and Positive");
				flag = false;

			} else {
				System.out.println("Given Number is Not Even and Positive");
			}
			
			
		} while (flag);

	}
}
