package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class Reverse_The_String_Type_03_using_StringBuilder {
	
	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println("===================================================================");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.print("--> Enter the String You want to reverse :- ");
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		System.out.println("");
		System.out.println("--> Reversed String :- " + sb.reverse());
	}
}
