package com.methodOverloadingExamples;

public class Example3 {

	private void m1(float f) {
		System.out.println("Stm 1");
	}

	private void m1(short i) {
		System.out.println("Stm 2");
	}

	public static void main(String[] args) {

		Example3 ex = new Example3();

		ex.m1(10.1f); // In Float Value We have to Declare it by Using f Otherwise it Will Give an
					  // Compile-Time Error
		ex.m1(10);    // ByDefault short and byte --> int ko support karte hai toh hame pahale isko
					  // declare karna padta hai and then we can send byte or short in parameter

	}

}
