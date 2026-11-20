package com.List_ProblemSolvingQuestions;

import java.util.ArrayList;
import java.util.List;

// Q.4 HOW DO YOU FIND THE NUMBER OF ELEMENTS PRESENT IN AN ARRAYLIST ?
// ==> USING SIZE() METHOD.

public class Question4 {

	public static void main(String[] args) {
		
		List lt = new ArrayList();
		
		lt.add("Yogesh");
		lt.add(300);
		lt.add(true);
		lt.add(null);
		lt.add(2900);
		
		System.out.println(lt.size()); //size : 5 (number of elements : 5)
	}
}
