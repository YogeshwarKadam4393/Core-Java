package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Iterator;

public class FACTORIAL {
	
	public static void main(String[] args) {
		
		int factorial = 1;
		int n = 6;
		int i;
		for(i = 1; i <= n ; ++i) {
			factorial *= i;
		}
		System.out.println("The Factorial Of " + n + " is " + factorial);

	}
}
