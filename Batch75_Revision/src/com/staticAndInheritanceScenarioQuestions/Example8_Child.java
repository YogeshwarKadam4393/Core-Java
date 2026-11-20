package com.staticAndInheritanceScenarioQuestions;

public class Example8_Child extends Example8_Parent {

	int x = 20;
	
	void show() {
		System.out.println("Child");
	}
	
	void display() {
		System.out.println(super.x);
		super.show();
	}

	public static void main(String[] args) {

//      Output ---> 
//		10
//		Parent
		
		new Example8_Child().display();
	}

}
