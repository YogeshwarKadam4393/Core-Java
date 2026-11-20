package com.mapCountryExampleUsingSet;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WorldMain2 {

	public static void main(String[] args) {

		System.out.println();
		System.out.println("===========================================");
		System.out.println();

		World world = new World();

		Map<String, Map<String, Set<String>>> worldMap = world.Country_List();

		System.out.println(worldMap);

		System.out.println();
		System.out.println("===========================================");
		System.out.println();

		Set<String> countryKeys = worldMap.keySet();

		System.out.println(countryKeys);

		System.out.println();
		System.out.println("===========================================");
		System.out.println();

		Iterator<String> countryIterator = countryKeys.iterator();

		while (countryIterator.hasNext()) {

			String country = countryIterator.next();

			System.out.println("|>>>>>   " + country + "   <<<<<|");
			System.out.println();

			Map<String, Set<String>> statesList = worldMap.get(country);

			System.out.println(statesList);
			System.out.println();
			System.out.println("-------------------------------------------");
			System.out.println();

			Set<String> stateKeys = statesList.keySet();

			System.out.println(stateKeys);
			System.out.println();
			System.out.println("-------------------------------------------");
			System.out.println();

			Iterator<String> stateIterator = stateKeys.iterator();

			while (stateIterator.hasNext()) {

				String state = stateIterator.next();

				System.out.println("|>>>   " + state + "   <<<|");
				System.out.println();

				Set<String> citiesList = statesList.get(state);

				System.out.println(citiesList);
				System.out.println();
				System.out.println("-------------------------------------------");
				System.out.println();

				Iterator<String> cityIterator = citiesList.iterator();

				while (cityIterator.hasNext()) {

					String city = cityIterator.next();

					System.out.println(city);
					System.out.println();
					System.out.println("-------------------------------------------");
					System.out.println();
				}
			}
		}
	}
}