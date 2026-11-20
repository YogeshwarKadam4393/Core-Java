package com.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MAP_EXAMPLE7_WORLD_MAINCLASS {

	public static void main(String[] args) {

		MAP_EXAMPLE7_WORLD world = new MAP_EXAMPLE7_WORLD();
		Map<String, Map<String, Map<String, String>>> map = world.CountriesData();

		Set<String> set1 = map.keySet();
		Iterator<String> itr1 = set1.iterator();

		while (itr1.hasNext()) {
			String country = itr1.next();
			System.out.println("\n================= USING ITERATOR =================\n");
			System.out.println("COUNTRY NAME : " + country);

			Map<String, Map<String, String>> state = map.get(country);

			Set<String> set2 = state.keySet();
			Iterator<String> itr2 = set2.iterator();

			while (itr2.hasNext()) {
				String stateName = itr2.next();
				System.out.println("\nSTATE NAME : " + stateName);

				Map<String, String> city = state.get(stateName);

				Set<String> set3 = city.keySet();
				Iterator<String> itr3 = set3.iterator();

				while (itr3.hasNext()) {
					String cityCode = itr3.next();
					System.out.println("CITY NAME : " + city.get(cityCode));
				}
			}
		}

		for (String s1 : set1) {

			System.out.println("\n============ USING FOR EACH LOOP =================");

			System.out.println("\nCOUNTRY NAME : " + s1);

			Map<String, Map<String, String>> states = map.get(s1);

			Set<String> state = states.keySet();

			for (String s : state) {

				System.out.println("\nSTATE NAME : " + s);

				Map<String, String> cities = states.get(s);

				Set<String> city = cities.keySet();

				for (String c : city) {

					System.out.println("CITY NAME : " + cities.get(c));
				}
			}
		}

		System.out.println("\n============= ITERATION USING ENTRY SET ===============");

		Set<Map.Entry<String, Map<String, Map<String, String>>>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Map<String, Map<String, String>>>> itr4 = entrySet.iterator();

		while (itr4.hasNext()) {

			Map.Entry<String, Map<String, Map<String, String>>> country = itr4.next();
			System.out.println("\nCOUNTRY NAME :" + country.getKey());

			Map<String, Map<String, String>> countries = country.getValue();
			Set<Map.Entry<String, Map<String, String>>> entrySet2 = countries.entrySet();

			Iterator<Map.Entry<String, Map<String, String>>> itr5 = entrySet2.iterator();

			while (itr5.hasNext()) {

				Map.Entry<String, Map<String, String>> key = itr5.next();
				System.out.println("\nSTATE NAME : " + key.getKey());

				Map<String, String> value = key.getValue();
				Set<Map.Entry<String, String>> entrySet3 = value.entrySet();
				Iterator<Entry<String, String>> iterator = entrySet3.iterator();

				while (iterator.hasNext()) {
					Map.Entry<String, String> next = iterator.next();
					System.out.println("CITY NAME : " + next.getValue());
				}
			}

		}
		
		System.out.println("\n============= ITERATION USING FOR EACH ===============");

		for (Map.Entry<String, Map<String, Map<String, String>>> s : entrySet) {

		    System.out.println("\nCOUNTRY NAME : " + s.getKey());

		    Map<String, Map<String, String>> map2 = s.getValue();

		    Set<Map.Entry<String, Map<String, String>>> entrySet2 = map2.entrySet();

		    for (Map.Entry<String, Map<String, String>> s2 : entrySet2) {

		        System.out.println("\nSTATE NAME : " + s2.getKey());

		        Map<String, String> map3 = s2.getValue();

		        Set<Map.Entry<String, String>> entrySet3 = map3.entrySet();

		        for (Map.Entry<String, String> s3 : entrySet3) {

		            System.out.println("CITY NAME : " + s3.getValue());
		        }
		    }
		}


	}
}
