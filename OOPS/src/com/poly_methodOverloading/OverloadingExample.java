package com.poly_methodOverloading;

public class OverloadingExample {
	
	public void m1() {
		System.out.println("M1 method with no parameter");
	}
	
	public void m1(int i) {
		System.out.println("m1 method with single paramter");
	}
	
	public void m1(int i , String s) {
		System.out.println("m1 method with Double paramter");
	}
	
	public static void main(String[] args) {
		System.out.println("main method overloading 1");
		
		OverloadingExample o =  new OverloadingExample();
		o.m1();
		o.m1(10);
		o.m1(99, "Yogesh");
	}
	
	public static void main(int[] args) {
		System.out.println("main method overloading 2");
	}

}
