package com.staticAndInheritanceScenarioQuestions;

public class Example4_Parent {
	
	static {
		System.out.println("Parent Static");
	}
	
	{
		System.out.println("Parent Instance");
	}
	
	Example4_Parent() {
		System.out.println("Parent Constructor");
	}

}
