package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class SUM_OF_DIGITS_03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the number :- ");
		System.out.println("");
		int n = sc.nextInt();
		int sum = 0;
		
		while (n>0) {
			
			sum += n % 10;
			n /= 10;
		}
		System.out.println(sum);
	}
}
