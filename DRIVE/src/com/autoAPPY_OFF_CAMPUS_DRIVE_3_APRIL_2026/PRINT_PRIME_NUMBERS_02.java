package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class PRINT_PRIME_NUMBERS_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("==============================================");
		System.out.println("");
		System.out.print("Enter the Number from which you want to print prime numbers :- ");
		int prime;
	
		for(prime = sc.nextInt();prime<=100;prime++) {
			boolean isPrime = true;
			
			for(int i = 2;i<=Math.sqrt(prime);++i) {
				if(prime % i == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println(prime);
			}
		}
		
		
		
	}
}
