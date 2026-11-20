package com.List_ProblemSolvingQuestions;

import java.util.ArrayList;

// Q.9 HOW DO YOU RETRIEVE AN ELEMENT FROM A PARTICULAR POSITION OF AN ARRAYLIST ?
// ==> USING GET() METHOD.

public class Question9 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al.get(3)); // // HERE IF U PUT THE INDEX , WE CAN GET THAT INDEX'S ELEMENT i.e., 40
}
}
