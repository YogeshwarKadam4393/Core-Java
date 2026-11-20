package com.covarientReturnType;

public class B extends A {

	// 1st Way To return Child Class Object
	public A m1() {

		return new B();

	}

//	// 2nd Way To return Child Class Object
//	public B m1() {
//		
//     return new B();
//     
//	}

}
