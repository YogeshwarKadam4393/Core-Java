package com.exceptionHandling;

import java.util.InputMismatchException;

// try with PIPE Operator
public class Example9 {

	public static void main(String[] args) {

		System.out.println("Main Starts");

		try {
			int i = 10 / 2;
			System.out.println(i);

			String str = null;
			System.out.println(str.length());

			Integer i1 = new Integer("abc");
			System.out.println("Value Of i = " + i1);

		} catch (NullPointerException | ArithmeticException | InputMismatchException e) {
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("==== Exception Block ====");
			e.printStackTrace();
		}

		System.out.println("Main Ends");
	}

}
