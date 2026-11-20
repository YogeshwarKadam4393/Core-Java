package com.set;

import java.util.Iterator;
import java.util.Set;

public class SET_Example1_IndiaAndStatesMainClass {

	public static void main(String[] args) {

		SET_Example1_IndiaAndStates india = new SET_Example1_IndiaAndStates();
		Set<Set<String>> i = india.addCountry();

		Iterator<Set<String>> itr = i.iterator();

		System.out.println("=============== ITERATOR ==============");
		while (itr.hasNext()) {

			Set<String> str = itr.next();

			Iterator<String> itr1 = str.iterator();
			System.out.println();

			while (itr1.hasNext()) {
				String str1 = itr1.next();
				System.out.println("CITIES : " + str1);
			}
		}

		System.out.println("\n=============== FOR EACH ==============");
		for (Set<String> list : i) {
			System.out.println();
			for (String list1 : list) {
				System.out.println("CITIES : " + list1);
			}
		}

	}

}
