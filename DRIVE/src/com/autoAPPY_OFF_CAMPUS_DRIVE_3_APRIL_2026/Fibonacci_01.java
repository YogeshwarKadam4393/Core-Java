package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class Fibonacci_01 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
	
	/* next = 0 + 1 = 1
	 * a = 1
	 * b = 1 
	 * 
	 * next = 1 + 1
	 * a = 1
	 * b = 2
	 * 
	 * next = 1 + 2
	 * a = 2
	 * b = 3
	 * 
	 * next = 2 + 3
	 * a = 3
	 * b = 5
	 *  */
}
