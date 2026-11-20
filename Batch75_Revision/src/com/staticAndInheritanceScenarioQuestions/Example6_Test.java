package com.staticAndInheritanceScenarioQuestions;

public class Example6_Test {
	
	static {
		System.out.println("Parent Static");
		
//      Here Program Will Get Terminated
		System.exit(0);
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
	}

}
