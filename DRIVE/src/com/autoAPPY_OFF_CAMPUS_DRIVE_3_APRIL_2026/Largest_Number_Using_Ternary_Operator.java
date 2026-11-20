package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class Largest_Number_Using_Ternary_Operator {

	private static void findLargestNumber(int a, int b, int c) {

//		int large = a > b ? (a > c ? a : (c > b ? c : b)) : (b > c ? b : c);
		int large = a > b ? (a > c ? a : (c > b ? c : b)) : (b > c ? b : c);
		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("Largest Number is " + large);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.print("--> Enter 1st Number :- ");
		int a = sc.nextInt();
		System.out.print("--> Enter 2nd Number :- ");
		int b = sc.nextInt();
		System.out.print("--> Enter 3rd Number :- ");
		int c = sc.nextInt();
		findLargestNumber(a, b, c);
	}
	
	
	
	
	
	
	
	
	
	
}
