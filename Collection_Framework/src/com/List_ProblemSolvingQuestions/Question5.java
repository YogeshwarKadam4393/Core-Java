package com.List_ProblemSolvingQuestions;

import java.util.ArrayList;

// Q.5 HOW DO YOU FIND OUT WHETHER THE GIVEN ARRAYLIST IS EMPTY OR NOT ?
// ==>> USING isEmpty() METHOD.

public class Question5 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al.isEmpty()); //GIVES BOOLEAN VALUE -->  IF THE ARRAYLIST IS EMPTY IT RETURNS TRUE , ELSE RETURN FALSE
}
}