package com.inheritanceTrickyQuestions;

public class Example1ChildClass extends Example1ParentClass{

	int i = 20;
	
	public void m1() {
		System.out.println("Child Class i : " + i);
	}
	
	
	public static void main(String[] args) {
		
		Example1ParentClass e = new Example1ChildClass();
		
		System.out.println(e.i); // 10
		e.m1();                  // Child Class i : 20

		
	}
	
}
