package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Scanner;

public class Swap_String_03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter :- ");
		String d = sc.next();
		String a = "";
		for(int i = 0;i<=d.length() - 1;++i) {
			
			if(i == 0) {
				a += d.charAt(d.length() - 1);
			}else if(i == d.length() - 1) {
				a += d.charAt(0);
			}else {
				a += d.charAt(i);
			}
		}
		
		System.out.println(a);
	}
}
