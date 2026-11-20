package com.set;

import java.util.HashSet;
import java.util.Set;

public class SET_Example2_UniversityList {

	public static Set<Set<String>> addUniversity() {

		Set<String> puneUniversity = new HashSet<String>();
	//	System.out.println("=========== PUNE UNIVERSITY =============");
		puneUniversity.add("Engineering");
		puneUniversity.add("Medical");
		puneUniversity.add("Law");

		Set<String> mumbaiUniversity = new HashSet<String>();
	//	System.out.println("=========== MUMBAI UNIVERSITY =============");
		mumbaiUniversity.add("Computer Science & Information Technology");
		mumbaiUniversity.add("Pharmacy");
		mumbaiUniversity.add("Commerce & Economics");

		Set<String> shivajiUniversity = new HashSet<String>();
	//	System.out.println("=========== SHIVAJI UNIVERSITY =============");
		shivajiUniversity.add("Management & Business");
		shivajiUniversity.add("Healthcare");
		shivajiUniversity.add("Arts");

		Set<Set<String>> maharashtraUniversity = new HashSet<Set<String>>();
		maharashtraUniversity.add(puneUniversity);
		maharashtraUniversity.add(mumbaiUniversity);
		maharashtraUniversity.add(shivajiUniversity);

		return maharashtraUniversity;
		
	}

}
