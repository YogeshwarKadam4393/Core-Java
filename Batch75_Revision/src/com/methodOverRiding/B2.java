package com.methodOverRiding;

public class B2 extends A {

//  This will Work As We are doing final in child class method so there will be no essue , 
//	But if u will Do final in parent class and try to override that method it will give an 
//	compile time essue as final methods cannot be overriden
	public final void m1() {
		System.out.println("B Class m1()");
	}

	public static void main(String[] args) {

		A a = new A();
		a.m1(); // A Class m1() Will Call as we are Calling with Direct With Parent Object

		A ab = new B2();
		ab.m1(); // B Class m1() Will Call as it is Overriden Method

		B2 b = new B2();
		b.m1(); // B Class m1() Will Call as it is Overriden Method

	}

}
