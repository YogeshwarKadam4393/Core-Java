package com.exceptionHandling;

public class Example2 {
	
	public static void main(String[] args) {
		
		
		System.out.println("Main Started");
		
		try {
			
			Integer i = new Integer("xyz");
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("Please Enter Numbers only...");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Catch Block");
			System.out.println("Please Enter Numbers only...");
			e.printStackTrace();
		}
		
		System.out.println("Main End");
	}

}
