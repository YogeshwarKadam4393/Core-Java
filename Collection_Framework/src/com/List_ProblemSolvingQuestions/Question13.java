package com.List_ProblemSolvingQuestions;

import java.util.ArrayList;

// Q.13 HOW DO YOU REMOVE AN ELEMENT FORM A PARTICULAR POSITION OF ARRAYLIST ? 
//==> USING REMOVE(index) METHOD.

public class Question13 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		al.remove(2);// need to remove 30.
		// we can remove by index no.
		// 30 will be removed.
		System.out.println(al);
}
}