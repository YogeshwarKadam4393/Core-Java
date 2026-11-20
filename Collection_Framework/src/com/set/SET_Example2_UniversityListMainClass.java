package com.set;

import java.util.Iterator;
import java.util.Set;

public class SET_Example2_UniversityListMainClass {

	public static void main(String[] args) {

		SET_Example2_UniversityList univercities = new SET_Example2_UniversityList();
		Set<Set<String>> i = univercities.addUniversity();

		Iterator<Set<String>> itr = i.iterator();

		System.out.println("=============== ITERATOR ==============");
		while (itr.hasNext()) {

			Set<String> str = itr.next();

			Iterator<String> itr1 = str.iterator();
			System.out.println();

			while (itr1.hasNext()) {
				String str1 = itr1.next();
				System.out.println("FIELDS : " + str1);
			}
		}

		System.out.println("\n=============== FOR EACH ==============");
		for (Set<String> list : i) {
			System.out.println();
			for (String list1 : list) {
				System.out.println("FIELDS : " + list1);
			}
		}

	}

}
