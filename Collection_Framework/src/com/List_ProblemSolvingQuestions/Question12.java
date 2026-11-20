package com.List_ProblemSolvingQuestions;

import java.util.ArrayList;

// Q.12 HOW DO YOU INSERT AN ELEMENT AT PARTICULAR POSITION OF AN ARRAYLIST ?
// ==> USING ADD(INDEX,ELEMENT); METHOD.

public class Question12 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		al.add(1, 600);
		// inserted 600 at 1 index(position)
		//at index 1 we will get 600 element
		// 20 will shift to index 2 and 30 will shift to index 3 and so on..
		System.out.println(al);
		// output : [10,600,20,30,40]
}
}