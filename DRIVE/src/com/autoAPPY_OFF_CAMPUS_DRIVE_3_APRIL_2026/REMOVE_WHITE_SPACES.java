package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class REMOVE_WHITE_SPACES {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("===================================================================");
		System.out.println("");
		System.out.print("--> Enter the String :- ");
		String string = sc.nextLine();
		
		String StringWithoutSpaces = string.replaceAll("\\s", "");
		
		System.out.println("");
		System.out.println("String with spaces :- " + string);
		System.out.println("");
		System.out.println("String without Spaces :- " + StringWithoutSpaces);
		
	}
}
