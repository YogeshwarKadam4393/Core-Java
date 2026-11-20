package com.narrowingConcept;

public class Example2 {
	
//  String is a Child Of Object Class	
	public void m1(String s) {
		System.out.println("String Class Method Called");
	}
	
//  Integer is also a Child Of Object Class	
	public void m1(Integer o) {
		System.out.println("Object Class Method Called");
	}
	
	public static void main(String[] args) {
		
		Example2 e = new Example2();

//      Both String and Integer are Present at Same level in Heirarchy ... 
//      So Compiler Cannot Decide Which Method is More Specific
//      Thats Why it will Get An Compile Time Essue		
		
//		e.m1(null);
		
	}

}
