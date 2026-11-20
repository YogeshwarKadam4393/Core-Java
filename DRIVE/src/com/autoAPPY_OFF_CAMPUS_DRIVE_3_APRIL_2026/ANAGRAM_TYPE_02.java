package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Arrays;

public class ANAGRAM_TYPE_02 {
	
	public static void main(String[] args) {
		
		String str1 = "night";
		String str2 = "thing";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println();
		}
	}
}
