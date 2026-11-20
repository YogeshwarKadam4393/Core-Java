package com.methodOverRiding;

public class B5 extends A {

//  This will execute but if u will do final in PArent Class then it will give an compile time 
//	essue i.e, static hides the implemetation but final will unhide that method so thats what the 
//	main reason we cannot put final in Parent Class
	public final static void main(String[] args) {
		System.out.println("B");
	}

}
