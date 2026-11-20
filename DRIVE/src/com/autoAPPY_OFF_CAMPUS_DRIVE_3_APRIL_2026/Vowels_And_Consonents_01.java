package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Vowels_And_Consonents_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("==============================================");
		System.out.println("");
		System.out.print("--> Enter the Word :- ");
		String str = sc.next();
		checkVowelsAndConsonents(str);
	}

	public static void checkVowelsAndConsonents(String str) {
		
		str = str.toLowerCase();
		Set<Character> vowelsSet = new LinkedHashSet<Character>();
		Set<Character> consoSet = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if(Character.isAlphabetic(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
						|| ch == 'u') {
					vowelsSet.add(ch);
				}else {
					consoSet.add(ch);
				}
			}
		}
		System.out.println("");
		System.out.println("----------------------------------");
		System.out.println("--> Vowels     :- " + vowelsSet);
		System.out.println("----------------------------------");
		System.out.println("--> Consonents :- " + consoSet);
		System.out.println("----------------------------------");
	}
}
