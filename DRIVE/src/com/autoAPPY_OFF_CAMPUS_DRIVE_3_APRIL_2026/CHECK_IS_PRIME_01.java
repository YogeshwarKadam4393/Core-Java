package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class CHECK_IS_PRIME_01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {
			System.out.print("--> Enter the number to check whether it is prime or not :- ");
			int n = sc.nextInt();

			if (n <= 1) {
				System.out.println(" The Numer " + n + " is not prime.");
				return;
			} 
			
			boolean isPrime = true;
			
			for(int i = 2; i <= Math.sqrt(n) ; ++i) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
				
			}
			if (isPrime) {
				System.out.println(" The Numer " + n + " is a prime number.");
//				flag = false;
//				break;
			}else {
				System.out.println(" The Numer " + n + " is not a prime number.");
//				break;
			}
			System.out.println("");
			System.out.println("----------------------------------------------------");
			System.out.println("");
		}
	}
}
