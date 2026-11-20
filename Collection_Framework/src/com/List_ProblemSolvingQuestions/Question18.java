package com.List_ProblemSolvingQuestions;

import java.util.ArrayList;

// Q.18 HOW DO YOU INSERT MORE THAN ONE ELEMENT AT A PARTICULAR POSITION OF AN ARRAYLIST ?
//==> USING addAll(index, collection c) METHOD.

public class Question18 {

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
		
		al.addAll(2, als);
		// will add all elements of als in al from 2nd index of al.
		System.out.println(al); //[10,20,50,60,70,80,30,40]
		
		System.out.println(al.addAll(2, als)); // returns boolean value
	}
}
