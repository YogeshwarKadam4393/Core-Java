package com.staticAndInheritanceScenarioQuestions;

public class Example4_Child extends Example4_Parent {

	static {
		System.out.println("Child Static");
	}

	{
		System.out.println("Child Instance");
	}

	Example4_Child() {
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {

//      Output ---> 
//		Parent Static
//		Child Static
//		Parent Instance
//		Parent Constructor
//		Child Instance
//		Child Constructor
		
		new Example4_Child();
	}

}
