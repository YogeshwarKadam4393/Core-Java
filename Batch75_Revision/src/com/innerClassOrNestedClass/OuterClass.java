package com.innerClassOrNestedClass;

public class OuterClass {

	// Non-static Inner Class
	// protected and private both can be used at Inner Class Level i.e, All Four
	// Access Modifiers are Eligible to use at Inner Class Level
	protected static class InnerClass {

		static int i = 10; // After jdk 15 static are also Allowed

		static void m1() { // Till jdk 15 Only Non static things are Allowed

			System.out.println("M1 Method Of Inner Class");

		}

	}

	// Outer class can directly create an Inner Class object
	private void m2() {

		InnerClass inner = new InnerClass();

		inner.m1();

	}

	public static void main(String[] args) {

		System.out.println("Outer Class");

//		// Creating Outer Class Object
//		OuterClass outer = new OuterClass();
//
//		// Creating Inner Class Object using Outer Class Object
//		OuterClass.InnerClass innerClass = outer.new InnerClass();
//
//		innerClass.m1();
//
//		// Calling private method of Outer Class
//		outer.m2();
		
		InnerClass.m1();
		System.out.println(InnerClass.i);

	}

}
