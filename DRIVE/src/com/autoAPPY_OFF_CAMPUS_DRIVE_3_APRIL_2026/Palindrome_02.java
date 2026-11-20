package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class Palindrome_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter :- ");
		String str = sc.next();
		
		for(int i = 0,j = str.length()-1; i<str.length();++i,--j ) {
			
			if(str.charAt(i) != str.charAt(j)) {
				System.out.println("Not palindrome");
				return;
			}
		}
		System.out.println("Palindrome");
	}
}
