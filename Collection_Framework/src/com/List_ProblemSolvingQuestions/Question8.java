package com.List_ProblemSolvingQuestions;

// Q.8 HOW DO YOU CONVERT ARRAYLIST TO ARRAY ?
// ==> USING toArray() METHOD.

import java.util.ArrayList;

public class Question8 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		al.toArray();
		System.out.println(al);

		Object[] ar = al.toArray(); // Object[] - return type of toArray
		System.out.println(ar[1]);// retrives element of index 1 that is 20
	}
}