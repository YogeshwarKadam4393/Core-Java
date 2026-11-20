package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

public class PRINT_PRIME_NUMBERS_01 {
	
	public static void main(String[] args) {
		
		System.out.println("Print Prime Numbers Between 1 and 100 ");
		for(int num =2 ; num<=100; num++) {
			boolean isPrime = true;
			
			for(int i = 2; i<=Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}			
			}
			if(isPrime) {
				System.out.println("");
				System.out.print(num + " ");
		}
		

		}
		
	}
}
