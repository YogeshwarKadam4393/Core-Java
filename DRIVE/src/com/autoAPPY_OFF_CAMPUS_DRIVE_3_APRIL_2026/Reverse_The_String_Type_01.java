package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class Reverse_The_String_Type_01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("==================================");
		System.out.println("");
		System.out.print("--> Enter the String You Want to reverse :- ");
		String str = sc.nextLine();
		String reversestr = "";
		char ch;
		
		for(int i = 0; i<str.length(); ++i) {
			
			ch = str.charAt(i);
			reversestr = ch + reversestr;
			reversestr = reversestr.toUpperCase();
		}
		System.out.println("");
		System.out.println("Reversed String :- " + reversestr);
		
		sc.close();
	}
	
}
