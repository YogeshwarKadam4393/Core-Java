package com.methodOverloadingExamples;

public class Example2 {

	private void m1(float f) {
		System.out.println("Stm 1");
	}

	private void m1(int i) {
		System.out.println("Stm 2");
	}

	public static void main(String[] args) {

		Example2 ex = new Example2();

		ex.m1(10.1f); // In Float Value We have to Declare it by Using f Otherwise it Will Give an
					  // Compile-Time Error
		ex.m1(10);
		
		ex.m1('G');   // char Internally Stored in Ascii Value

	}

}
