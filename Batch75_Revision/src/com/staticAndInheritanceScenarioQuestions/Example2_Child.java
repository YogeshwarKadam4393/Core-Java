package com.staticAndInheritanceScenarioQuestions;

public class Example2_Child extends Example2_Parent {

	int x = 20;

	public static void main(String[] args) {

		Example2_Parent pc = new Example2_Child();

//   O/P ---> 10 
//   Variables Ke Case me Method Overriding Nahi Hoti hai ,So It Will Print x = 10 Of Parent Class		
		System.out.println(pc.x);
	}

}
