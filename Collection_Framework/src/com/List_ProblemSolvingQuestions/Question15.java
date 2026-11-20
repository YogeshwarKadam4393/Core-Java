package com.List_ProblemSolvingQuestions;

import java.util.ArrayList;

// Q.15 HOW DO YOU REMOVE ALL ELEMENTS OF AN ARRAYLIST AT A TIME ?
// ==> USING CLEAR() METHOD.

public class Question15 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		al.clear(); // Removes all elements of arrayList
		System.out.println(al); // NOW IT WILL PRINT AN EMPTY ARRAY [],BECAUSE OF CLEAR 
	}
}
