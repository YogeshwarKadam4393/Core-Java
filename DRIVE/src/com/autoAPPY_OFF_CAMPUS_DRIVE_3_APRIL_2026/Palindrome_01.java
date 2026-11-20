package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class Palindrome_01 {
	
	public static String checkPalindrome(String str) {
		
		int j = str.length()-1;
		for(int i = 0;i<str.length();i++,j--) {
			
			if(str.charAt(i) != str.charAt(j)) {
				return "It is not an Palindrome";
			}
			
		}
		return "It is a Palindrome";
			
		}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("===============================================");
		System.out.println("");
		System.out.print("--> Enter the String :- ");
		String str = sc.nextLine();
		System.out.println("");
		System.out.println(checkPalindrome(str));
		
	}

}
