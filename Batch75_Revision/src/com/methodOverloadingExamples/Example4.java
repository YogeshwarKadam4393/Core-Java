package com.methodOverloadingExamples;

public class Example4 {

	private void m1(float f, int i) {
		System.out.println("Stm 1");
	}

	private void m1(int i, float f) {
		System.out.println("Stm 2");
	}

	public static void main(String[] args) {

		Example4 ex = new Example4();

//		ex.m1(10.0f, 10.8f);  // No Matching Method Found
//		ex.m1(10, 10);        // This is Getting an Ambiguity Problem because Both Methods are having int
		ex.m1(10.0f, 10);
		ex.m1(10, 10.0f);
	}

}
