package com.List_ProblemSolvingQuestions;

import java.util.ArrayList;

// Q.3 HOW DO YOU DECREASE THE CURRENT CAPACITY OF AN ARRAYLIST TO THE CURRENT SIZE ?
// ==> USING TrimToSize() METHOD.

public class Question3 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>(50);
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		al.trimToSize();
		// IT DECREASES THE CURRENT CAPACITY TO THE CURRENT SIZE.

	}
}