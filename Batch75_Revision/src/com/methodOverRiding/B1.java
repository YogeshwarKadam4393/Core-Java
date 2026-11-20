package com.methodOverRiding;

public class B1 extends A {

//  private scope is Within the Class , it will give Compile Time Essue
//	private void m1() {
//		System.out.println("B Class m1()");
//	}

	public static void main(String[] args) {

		A a = new A();
		a.m1();         // A Class m1() Will Call as we are Calling with Direct With Parent Object

		A ab = new B1();
		ab.m1();        // B Class m1() Will Call as it is Overriden Method

		B1 b = new B1();
		b.m1();         // B Class m1() Will Call as it is Overriden Method

	}

}
