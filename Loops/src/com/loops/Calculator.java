package com.loops;

import java.util.Scanner;

public class Calculator {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void addition() {
		System.out.println("Enter Your First Number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Your Second Number : ");
		int num2 = sc.nextInt();
		
		int addition = num1 + num2;
		System.out.println("Your Addition is : "+addition);

	}
	
	public static void substraction() {
		System.out.println("Enter Your First Number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Your Second Number : ");
		int num2 = sc.nextInt();
		
		int substraction = num1 - num2;
		System.out.println("Your Addition is : "+substraction);

	}
	
	public static void multiplication() {
		System.out.println("Enter Your First Number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Your Second Number : ");
		int num2 = sc.nextInt();
		
		int multiplication = num1 * num2;
		System.out.println("Your Addition is : "+multiplication);

	}
	
	public static void Division() {
		System.out.println("Enter Your First Number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Your Second Number : ");
		int num2 = sc.nextInt();
		
		if((num1>0 && num2>0)) {
			int division = num1 / num2;
			System.out.println("Your Division is : "+division);
		} else {
			System.out.println("Please Enter Number Greater Than 0");
		}

	}
	
	public static void main(String[] args) {
		
		boolean flag = true;
		
	while (true) {
		
		System.out.println("Calculator Started --->\n");
		System.out.println("==========Menu=========");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		
		System.out.println("\nEnter Your Choice : ");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1: 
			System.out.println("Addition Started");
			addition();
			break;
		case 2: 
			System.out.println("Substraction Started");
			substraction();
			break;
		case 3: 
			System.out.println("Multiplication Started");
			multiplication();
			break;
		case 4: 
			System.out.println("Division Started");
			Division();
			break;
		case 5: 
			System.out.println("Exited Successfully");
			flag = false;
			
		default:
			System.out.println("Invalid choice....Please Enter Valid Choice");
			main(args);
		}
	} 
				
	}

}
