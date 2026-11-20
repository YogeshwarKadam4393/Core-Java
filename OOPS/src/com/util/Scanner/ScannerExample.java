package com.util.Scanner;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		System.out.println("Scanner Started ---->\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Name : ");
		String name = sc.next();
		
		System.out.print("Enter Your Mobile Number : ");
		long phnNo = sc.nextLong();
		
		System.out.print("Enter Your Address : ");
		String address = sc.next();
		
		System.out.println("\nScanner Closed");
	}

}
