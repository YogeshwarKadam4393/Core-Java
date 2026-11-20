package com.staticAndInheritanceScenarioQuestions;

public class Example5_Child extends Example4_Parent {

	static {
		System.out.println("Child Static");
	}

	{
		System.out.println("Child Instance");
	}

	Example5_Child() {
		this(10);
		System.out.println("Child Constructor");
	}

	public Example5_Child(int i) {
		System.out.println("Child Parametarized Constructor");
	}

	public static void main(String[] args) {

//      Output ---> 
//		Parent Static
//		Child Static
//		Parent Instance
//		Parent Constructor
//		Child Instance
//		Child Parametarized Constructor
//		Child Constructor
		
		new Example5_Child();
	}

}
