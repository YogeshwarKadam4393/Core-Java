package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class Swap_String_01 {
	
	public static String swapFirstLast(String str) {
		
		String ans = "";
		for(int i = 0;i<str.length();++i) {
			
			if(i==0) {
				ans += str.charAt(str.length()-1);
			}else if(i == str.length() - 1) {
				ans += str.charAt(0);
			}else {
				ans += str.charAt(i);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("==============================================");
		System.out.println("");
		System.out.print("--> Enter the String :- ");
		String str = sc.nextLine();
		System.out.println(Swap_String_01.swapFirstLast(str));
	}
}
