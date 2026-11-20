package com.List_ProblemSolvingQuestions;

import java.util.ArrayList;

// Q.6 HOW DO YOU CHECK WHETHER THE GIVEN ELEMENT IS PRESENT IN AN ARRAYLIST OR NOT ?
// ==> USING CONTAINS() METHOD.

public class Question6 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al.contains(10)); //GIVES BOOLEAN VALUE ===> IF CONTAINS : RETURNS TRUE , ELSE RETURN FALSE
}
}