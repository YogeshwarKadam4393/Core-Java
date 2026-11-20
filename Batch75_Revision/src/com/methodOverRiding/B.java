package com.methodOverRiding;

public class B extends A {

//  @OverRide annotation is not Necessary , Thats Just For Developer Purpose , If u will Not Give 
//	Override then also it will execute	
	void m1() {
		System.out.println("B Class m1()");
	}

	public static void main(String[] args) {

		A a = new A();
		a.m1();         // A Class m1() Will Call as we are Calling with Direct With Parent Object

		A ab = new B();
		ab.m1();        // B Class m1() Will Call as it is Overriden Method

		B b = new B();
		b.m1();         // B Class m1() Will Call as it is Overriden Method

	}

}
