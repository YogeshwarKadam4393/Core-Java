package com.narrowingConcept;

public class Example1 {
	
//  String is a Child Of Object Class , So This is More Specific For null	
	public void m1(String s) {
		System.out.println("String Class Method Called");
	}
	
	public void m1(Object o) {
		System.out.println("Object Class Method Called");
	}
	
	public static void main(String[] args) {
		
		Example1 e = new Example1();
		
		e.m1(null);
		
	}

}
