package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

public class STRING_SWAP_SUBSTRING_01 {
	
	public static void main(String[] args) {
		
		String str1 = "Tom";
		String str2 = "Cruise";
		
		System.out.println("--------------------------------");
		System.out.println("------- Before Swapping --------");
		System.out.println("--------------------------------");
		System.out.println("   str1 ----> " + str1);
		System.out.println("   str2 ----> " + str2);
		System.out.println("--------------------------------");
		
		str1 = str1 + str2;
		
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("------- After Swapping --------");
		System.out.println("--------------------------------");
		System.out.println("   str1 ----> " + str1);
		System.out.println("   str2 ----> " + str2);
		System.out.println("--------------------------------");
	}
}
