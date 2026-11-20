package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

public class Swap_Int_Types_04 {
	
	public static void main(String[] args) {
		
		int a = 50;
		int b = 60;
		
//		int temp = a;
//		a = b;
//		b = temp;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a +""+ b);
	}
}
