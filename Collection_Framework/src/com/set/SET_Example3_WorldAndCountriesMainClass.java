package com.set;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SET_Example3_WorldAndCountriesMainClass {

	public static void main(String[] args) {

		SET_Example3_WorldAndCountries world = new SET_Example3_WorldAndCountries();
		Set<Set<Set<String>>> i = world.world();

		Iterator<Set<Set<String>>> itr = i.iterator();

		System.out.println("=============== ITERATOR ==============");
		while (itr.hasNext()) {

			Set<Set<String>> str = itr.next();

			Iterator<Set<String>> itr1 = str.iterator();
			System.out.println();

			while (itr1.hasNext()) {
				Set<String> str1 = itr1.next();
				System.out.println();

				Iterator<String> itr3 = str1.iterator();

				while (itr3.hasNext()) {

					String cities = itr3.next();
					System.out.println("CITIES : " + cities);

				}
			}
		}

		System.out.println("\n=============== FOR EACH ==============");

		for (Set<Set<String>> list : i) {

			for (Set<String> list2 : list) {
				System.out.println();

				for (String list3 : list2) {

					System.out.println("CITIES : " + list3);
				}
			}
		}

	}

}
