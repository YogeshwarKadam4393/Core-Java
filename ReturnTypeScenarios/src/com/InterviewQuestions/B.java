package com.InterviewQuestions;

public class B {
	
	static {
		System.out.println("Static Block of B");
	}
	
	B() {
		System.out.println("222");
	}
	
	{
		System.out.println("Non Static block of B");
		
	}

}
