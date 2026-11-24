package com.toString_Method_TrickyQuestions;

public class Demo {
	
	int id = 101;
	String name = "Yogesh";
	
	public int hashCode() {
		return id;
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d);
	}
}
