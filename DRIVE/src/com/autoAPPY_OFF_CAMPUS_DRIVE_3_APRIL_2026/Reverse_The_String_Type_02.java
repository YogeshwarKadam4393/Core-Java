package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class Reverse_The_String_Type_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("===================================================================");
		System.out.println("");
		System.out.print("--> Enter the String you want to Reverse :- ");
		String str = sc.nextLine();
		char ch;
		String reverse = "";
		for(int i = str.length() - 1; i >=0; --i) {
			ch = str.charAt(i);
			reverse = reverse + ch;
		}
		System.out.println("");
		System.out.print("REVERSED STRING :- " + reverse);
		
		sc.close();

	}
}
