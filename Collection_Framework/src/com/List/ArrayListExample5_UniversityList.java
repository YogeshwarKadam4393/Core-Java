package com.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample5_UniversityList {

	public static List<List<String>> addUniversity() {

		List<String> puneUniversity = new ArrayList<String>();
	//	System.out.println("=========== PUNE UNIVERSITY =============");
		puneUniversity.add("Engineering");
		puneUniversity.add("Medical");
		puneUniversity.add("Law");

		List<String> mumbaiUniversity = new ArrayList<String>();
	//	System.out.println("=========== MUMBAI UNIVERSITY =============");
		mumbaiUniversity.add("Computer Science & Information Technology");
		mumbaiUniversity.add("Pharmacy");
		mumbaiUniversity.add("Commerce & Economics");

		List<String> shivajiUniversity = new ArrayList<String>();
	//	System.out.println("=========== SHIVAJI UNIVERSITY =============");
		shivajiUniversity.add("Management & Business");
		shivajiUniversity.add("Healthcare");
		shivajiUniversity.add("Arts");

		List<List<String>> maharashtraUniversity = new ArrayList<List<String>>();
		maharashtraUniversity.add(puneUniversity);
		maharashtraUniversity.add(mumbaiUniversity);
		maharashtraUniversity.add(shivajiUniversity);

		return maharashtraUniversity;
		
	}

}
