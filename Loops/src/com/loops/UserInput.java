package com.loops;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number : ");
		int num = sc.nextInt();
		System.out.println("Your Number is : "+num);
	}

}
