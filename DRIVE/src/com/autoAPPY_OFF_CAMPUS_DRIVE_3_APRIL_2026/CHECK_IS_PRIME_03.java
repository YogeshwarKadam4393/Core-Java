package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class CHECK_IS_PRIME_03 {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter a number (or -1 to exit): ");
            int n = sc.nextInt();

            if (n == -1) {
                System.out.println("Program terminated.");
                break;
            }

            if (n <= 1) {
                System.out.println("The number " + n + " is not prime.");
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("The number " + n + " is a prime number.");
            } else {
                System.out.println("The number " + n + " is not a prime number.");
            }

            System.out.println("------------------------------------");
        }

        sc.close();
	}
}
