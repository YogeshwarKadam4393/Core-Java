package com.InterviewQuestions;


public class A {
	
	B b = new B();
	
	{
		System.out.println("Non Static Block of A");
	}
	
	A() {
		System.out.println("111");
		System.out.println("Default Constructor of A");
		B b = new B();
	}
	
	static {
		System.out.println("Static Block of A");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
//		A a = new A(); 
		B b = new B();
		
		
		System.out.println("Main End");
	}
	

}
