package com.exceptionHandling;

// Inner/Nasted try catch Block
public class Example6 {

	public static void main(String[] args) {

		System.out.println("Main Starts");

		try {
			int i = 10 / 2;
			System.out.println(i);

			try {
				String str = null;
				System.out.println(str.length());
			} catch (NullPointerException e) {
				e.printStackTrace();
			}

			try {
				Integer i1 = new Integer("abc");
				System.out.println("Value Of i = " + i1);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

		} catch (ArithmeticException e) {
			System.out.println("Number Cannot Be Divided by zero");
			System.out.println(e.getMessage());

		} catch (Exception e) {
			System.out.println("Catch Block");
			e.printStackTrace();
		}

		System.out.println("Main Ends");
	}

}
