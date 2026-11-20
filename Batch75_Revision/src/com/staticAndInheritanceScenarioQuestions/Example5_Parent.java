package com.staticAndInheritanceScenarioQuestions;

public class Example5_Parent {
	
	static {
		System.out.println("Parent Static");
	}
	
	{
		System.out.println("Parent Instance");
	}
	
	Example5_Parent() {
		System.out.println("Parent Constructor");
	}

}
