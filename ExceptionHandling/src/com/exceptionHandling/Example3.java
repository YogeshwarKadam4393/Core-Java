package com.exceptionHandling;

public class Example3 {
	
	public static void main(String[] args) {
		
		System.out.println("Main Starts");
		
		try {
			int i = 10/0;
			System.out.println(i);
		}catch (ArithmeticException e) {
			System.out.println("Number Cannot Be Divided by zero");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Catch Block");
			System.out.println("Number Cannot Be Divided by zero");
			e.printStackTrace();
		}
		
		System.out.println("Main Ends");
	}

}
