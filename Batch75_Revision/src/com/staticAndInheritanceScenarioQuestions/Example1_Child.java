package com.staticAndInheritanceScenarioQuestions;

public class Example1_Child extends Example1_Parent{
	
	Example1_Child() {
		this(10);
		System.out.println("B");
	}

	public Example1_Child(int i) {
		System.out.println("C");
	}
	
	public static void main(String[] args) {
		
//      OutPut ---> A , C , B		
		new Example1_Child();
	}
	

}
