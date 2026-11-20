package com.List_ProblemSolvingQuestions;

import java.util.ArrayList;

// Q.7 HOW DO YOU GET THE POSITION OF PARTICULAR ELEMENT IN AN ARRAYLIST ?
// ==> USING indexOf() METHOD.

public class Question7 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(al.get(2));      // HERE IF U PUT THE INDEX , WE CAN GET THAT INDEX'S ELEMENT
		System.out.println(al.indexOf(30)); // PUT THE ELEMENT , WE CAN GET THE INDEX OF THAT ELEMENT THROUGH indexOf() Method
	}
}