package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

public class SUM_OF_DIGITS_01 {
	
	public static void main(String[] args) {
		
		int n = 5793;
		int sum = 0;
		
		while(n>0) {
			
			sum += n%10;
			n /= 10;
			
		}
		
		System.out.println(sum);
	}
}
