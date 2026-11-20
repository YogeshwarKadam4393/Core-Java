package com.exceptionHandling;

public class Example1 {

	public static void main(String[] args) {

		System.out.println("This Statement will be Executed");
		
		try {
			System.out.println("Try Block");
			String str = args[3];        // ArrayIndexOutOfBoundsException
			System.out.println(str);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Given Value is not Available at the Given Index");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Catch Block");
			System.out.println("Given Value is not Available at the Given Index");
			e.printStackTrace();
		}
	}
}
