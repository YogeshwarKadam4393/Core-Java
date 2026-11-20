package com.methodOverRiding;

public class A4 {
	
	public final void m1() {
		System.out.println("A Class m1()");
	}
	
	// Here Method OverLoading Done First and then Overrided the m1(int i) method
	public void m1(int i ) {
		System.out.println("Parametarized m1() method");
	}
	
}
