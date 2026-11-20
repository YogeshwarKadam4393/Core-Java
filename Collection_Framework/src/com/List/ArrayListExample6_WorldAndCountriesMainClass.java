package com.List;

import java.util.Iterator;
import java.util.List;

public class ArrayListExample6_WorldAndCountriesMainClass {

	public static void main(String[] args) {

		ArrayListExample6_WorldAndCountries world = new ArrayListExample6_WorldAndCountries();
		List<List<List<String>>> i = world.world();

		Iterator<List<List<String>>> itr = i.iterator();

		System.out.println("=============== ITERATOR ==============");
		while (itr.hasNext()) {

			List<List<String>> str = itr.next();

			Iterator<List<String>> itr1 = str.iterator();
			System.out.println();
 
			while (itr1.hasNext()) {
				List<String> str1 = itr1.next();
				System.out.println();
				
				Iterator<String> itr3 = str1.iterator();
				
				while(itr3.hasNext()) {
					
					String cities = itr3.next();
					System.out.println("CITIES : "+ cities);
					
				}
			}
		}

		System.out.println("\n=============== FOR EACH ==============");
		
		for (List<List<String>> list : i) {
			
			for (List<String> list2 : list) {
				System.out.println();
				for (String list3 : list2) {
					
					System.out.println("CITIES : "+list3);
				}
			}
		}

	}

}
