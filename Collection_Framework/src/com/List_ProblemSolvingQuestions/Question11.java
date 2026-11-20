package com.List_ProblemSolvingQuestions;

import java.util.ArrayList;

// Q.11 HOW DO YOU APPEND AN ELEMENT AT THE END OF AN ARRAYLIST ?
// ==> USING ADD() METHOD.

public class Question11 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		al.add(50); //added 50 at end of arrayList.
		// simply we will add element at end.
		System.out.println(al);
	
}
}