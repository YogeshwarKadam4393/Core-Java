package com.exceptionHandling;

import java.util.InputMismatchException;

// try with multiple catch block
public class Example7 {

	public static void main(String[] args) {

		System.out.println("Main Starts");

		try {
			int i = 10 / 2;
			System.out.println(i);

			String str = null;
			System.out.println(str.length());

			Integer i1 = new Integer("abc");
			System.out.println("Value Of i = " + i1);

		} catch (NullPointerException e) {
			System.out.println("==== NullPointerException ====");
			System.out.println("String Cannot be null...!!");
			e.printStackTrace();

		} catch (ArithmeticException e) {
			System.out.println("==== ArithmeticException ====");
			System.out.println("Number Cannot Be Divided by zero");
			System.out.println(e.getMessage());

		} catch (InputMismatchException e) {
			System.out.println("==== InputMismatchException ====");
			System.out.println("Please Enter Numbers Only...!!");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("==== Exception Block ====");
			e.printStackTrace();
		}

		System.out.println("Main Ends");
	}

}
