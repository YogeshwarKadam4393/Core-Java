package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Arrays;
import java.util.Scanner;

public class ANAGRAM_TYPE_03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------");
		System.out.print("-- Enter String 1 ----> ");
		String s1 = sc.next();
		System.out.print("-- Enter String 2 ----> ");
		String s2 = sc.next();
		System.out.println("");
		System.out.println(checkAnagram(s1, s2));
		System.out.println("----------------------------------------------------");
	}
	
	public static String checkAnagram(String s1,String s2) {
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			return "It's a Anagram";
		}else {
			return "It's not a Anagram";
		}
	}
}
