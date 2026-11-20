package com.loops;

import java.util.Scanner;

public class TableCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculator Started");
		
		System.out.println("Enter Your Number :");
		int ch = sc.nextInt();
		
		int i = 1;
		
//		for(; i<=10 ; i++) {
//			System.out.println(ch+ "x" + i +"=" + i*ch);
//		}
//		
		boolean flag = true;
		
		while(i<=10) {
			System.out.println(ch+ "x" + i +"=" + i*ch);
		}
		
	}

}
