package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class Palindrome_03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("==============================================");
		System.out.println("");
		System.out.print("Enter the String :- ");
		String str = sc.next();
		System.out.println("");
		System.out.println(checkPalindrome(str));
		
	}
	
	static String checkPalindrome(String str) {
		
		for(int i = 0,j=str.length()-1;i < str.length();++i,--j) {
			if(str.charAt(i) != str.charAt(j)) {
				return "It is not Palindrome";
			}
		}
		return "It is a Palindrome";
	}
}
