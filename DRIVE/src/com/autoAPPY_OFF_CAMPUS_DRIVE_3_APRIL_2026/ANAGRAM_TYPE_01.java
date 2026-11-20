package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Arrays;
import java.util.Scanner;

public class ANAGRAM_TYPE_01 {
	
	public static String checkAnagram(String str1, String str2) {
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			return "It is an Anagram";
		}else {
			return "It is not an Anagram"
					+ "";
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("===================================================================");
		System.out.println("");
		System.out.print("--> Enter the first String :- ");
		String str1 = sc.nextLine();
		System.out.print("--> Enter the second String :- ");
		String str2 = sc.nextLine();
		System.out.println(checkAnagram(str1, str2));
	}
}
