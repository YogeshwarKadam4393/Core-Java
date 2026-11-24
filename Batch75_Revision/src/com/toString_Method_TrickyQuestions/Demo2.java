package com.toString_Method_TrickyQuestions;

public class Demo2 {
	
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		Demo2 d1 = new Demo2();
		Demo2 d2 = new Demo2();
		Demo2 d3 = d;
		
		System.out.println(d == d1);
		System.out.println(d.equals(d1));
		System.out.println(d.equals(d2));
		System.out.println(d.equals(d3));
	
	}
}
