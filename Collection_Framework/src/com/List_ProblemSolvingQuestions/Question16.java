package com.List_ProblemSolvingQuestions;

import java.util.ArrayList;

// Q.16 HOW DO YOU RETRIEVE A PORTION OF AN ARRAYLIST ?
// ==> USING subList(from index, to index); METHOD.

public class Question16 {

public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(60);
		al.add(70);
		
		System.out.println(al.subList(2, 5)); // [30,40,60]
		// retrieves elements from index 2 to 4
		// includes index 2 but excludes index 5
}
}