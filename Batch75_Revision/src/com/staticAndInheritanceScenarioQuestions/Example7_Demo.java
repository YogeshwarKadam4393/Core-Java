package com.staticAndInheritanceScenarioQuestions;

public class Example7_Demo {
	
	void show(Example7_Demo d) {

//      Step 3 ---> And Yaha Object Ko Print kar rhe hai		
		System.out.println(d);
	}
	
	void display() {
		
//      Step 2 ---> show method ko Call Gaya yaha se 
		show(this);
	}
	
	public static void main(String[] args) {
		
		Example7_Demo d = new Example7_Demo();

//      OutPut ---> com.staticAndInheritanceScenarioQuestions.Example7_Demo@1dbd16a6
//      It Will Give An Hashcode Because We have Printed Object	
		
//      Step 1 --> display Method Calling
		d.display();
		
	}

}
