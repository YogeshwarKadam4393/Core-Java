package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MAP_EXAMPLE6_COUNTRYMAP {

	public Map<String, List<String>> addCountry() {

		List<String> maharashtra = new ArrayList<String>();

		maharashtra.add("Pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Parbhani");

		List<String> rajasthan = new ArrayList<String>();

		rajasthan.add("Jaipur");
		rajasthan.add("Udaipur");
		rajasthan.add("Jaisalmer");

		List<String> madhyaPradesh = new ArrayList<String>();

		madhyaPradesh.add("Indore");
		madhyaPradesh.add("Bhopal");
		madhyaPradesh.add("Gwalior");

		Map<String, List<String>> india = new HashMap<String, List<String>>();

		india.put("MAHARASHTRA", maharashtra);
		india.put("RAJASTHAN", rajasthan);
		india.put("MADHYAPRADESH", madhyaPradesh);

		return india;
	}

	public static void main(String[] args) {

		MAP_EXAMPLE6_COUNTRYMAP map = new MAP_EXAMPLE6_COUNTRYMAP();

		Map<String, List<String>> country = map.addCountry();

		// ================= USING ITERATOR =================

		System.out.println("================ USING ITERATOR ===============\n");

		Set<String> key = country.keySet();

		Iterator<String> itr = key.iterator();

		while (itr.hasNext()) {

			String key1 = itr.next();

			System.out.println("\nSTATE NAME : " + key1);

			List<String> list = country.get(key1);

			Iterator<String> itr2 = list.iterator();

			while (itr2.hasNext()) {

				String city = itr2.next();

				System.out.println("CITIES : " + city);
			}
		}

		// ================= USING FOR EACH LOOP =================

		System.out.println("\n\n================ USING FOR EACH LOOP ===============");

		for (String state : country.keySet()) {

			System.out.println("\nSTATE NAME : " + state);

			List<String> list = country.get(state);

			for (String city : list) {

				System.out.println("CITIES : " + city);
			}
		}
	}
}