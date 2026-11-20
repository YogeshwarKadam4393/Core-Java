package com.List;

import java.util.Iterator;
import java.util.List;

public class ArrayListExample4_IndiaAndStatesListMainClass {

	public static void main(String[] args) {

		ArrayListExample4_IndiaAndStatesList india = new ArrayListExample4_IndiaAndStatesList();
		List<List<String>> i = india.addCountry();

		Iterator<List<String>> itr = i.iterator();

		System.out.println("=============== ITERATOR ==============");
		while (itr.hasNext()) {

			List<String> str = itr.next();

			Iterator<String> itr1 = str.iterator();
			System.out.println();

			while (itr1.hasNext()) {
				String str1 = itr1.next();
				System.out.println("CITIES : " + str1);
			}
		}

		System.out.println("\n=============== FOR EACH ==============");
		for (List<String> list : i) {
			System.out.println();
			for (String list1 : list) {
				System.out.println("CITIES : " + list1);
			}
		}

	}

}
