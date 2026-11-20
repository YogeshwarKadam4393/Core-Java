package com.List;

import java.util.Iterator;
import java.util.List;

public class ArrayListExample5_UniversityListMainClass {

	public static void main(String[] args) {

		ArrayListExample5_UniversityList univercities = new ArrayListExample5_UniversityList();
		List<List<String>> i = univercities.addUniversity();

		Iterator<List<String>> itr = i.iterator();

		System.out.println("=============== ITERATOR ==============");
		while (itr.hasNext()) {

			List<String> str = itr.next();

			Iterator<String> itr1 = str.iterator();
			System.out.println();

			while (itr1.hasNext()) {
				String str1 = itr1.next();
				System.out.println("FIELDS : " + str1);
			}
		}

		System.out.println("\n=============== FOR EACH ==============");
		for (List<String> list : i) {
			System.out.println();
			for (String list1 : list) {
				System.out.println("FIELDS : " + list1);
			}
		}

	}

}
