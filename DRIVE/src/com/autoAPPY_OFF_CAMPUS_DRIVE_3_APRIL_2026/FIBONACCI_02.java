package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class FIBONACCI_02 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("-- how many Fibonacci numbers you want to print ---> ");
		int n = sc.nextInt();

		int a = 0, b = 1;

		for (int i = 0; i <= n; ++i) {

			System.out.println("");
			System.out.println(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
	}
}
