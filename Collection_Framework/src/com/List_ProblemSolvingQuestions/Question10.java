package com.List_ProblemSolvingQuestions;

import java.util.ArrayList;

// Q.10 HOW DO YOU REPLACE A PARTICULAR ELEMENT IN AN ARRAYLIST WITH THE GIVEN ELEMENT ?
// ==> USING SET() METHOD.

public class Question10 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
	
		// replace 30 with 500
		al.set(2, 500); // (index no , element to replace)
		System.out.println(al); 
}
}