package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class TABLE {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("--> Enter the number you want to print table of :- ");
		for(int i = sc.nextInt(),j=1,n=12 ; j<=n; ++j ) {
			int product = i * j;
			System.out.println(" " + i + " X " + j + " = " + product);

		}
		
		sc.close();

	}
}
