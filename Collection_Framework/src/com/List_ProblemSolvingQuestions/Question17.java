package com.List_ProblemSolvingQuestions;

import java.util.ArrayList;

// Q.17 HOW DO YOU JOIN TWO ARRAYLIST ?
// ==> USING addAll(collection c) METHOD.

public class Question17 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		ArrayList<Integer> als = new ArrayList<Integer>();
		als.add(50);
		als.add(60);
		als.add(70);
		als.add(80);
		
		// CAN JOIN ONLY SAME GENERICS TYPE
		al.addAll(als); // joins both arrayList
		System.out.println(al); // [10,20,30,40,50,60,70,80]
		
		System.out.println(al.addAll(als));// RETURN BOOLEAN VALUE , IF GENERIC TYPE MATCHED IT RETURNS TRUE ELSE FALSE
		
	}
}
