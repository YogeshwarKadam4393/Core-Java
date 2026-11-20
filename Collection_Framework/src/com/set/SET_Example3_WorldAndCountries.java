package com.set;

import java.util.HashSet;
import java.util.Set;

public class SET_Example3_WorldAndCountries {

	public static Set<Set<Set<String>>> world() {

		Set<String> maharashtra = new HashSet<String>();
		// System.out.println("=========== MAHARASHTRA CITIES =============");
		maharashtra.add("Pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Parbhani");

		Set<String> rajasthan = new HashSet<String>();
		// System.out.println("=========== RAJASTHAN CITIES =============");
		rajasthan.add("Jaipur");
		rajasthan.add("Udaipur");
		rajasthan.add("Jaisalmer");

		Set<String> madhyaPradesh = new HashSet<String>();
		// System.out.println("=========== MADHYA PRADESH CITIES =============");
		madhyaPradesh.add("Indore");
		madhyaPradesh.add("Bhopal");
		madhyaPradesh.add("Gwaliar");

		Set<Set<String>> india = new HashSet<Set<String>>();
		india.add(madhyaPradesh);
		india.add(maharashtra);
		india.add(rajasthan);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		Set<String> newyork = new HashSet<String>();
		// System.out.println("=========== NEWYORK CITIES =============");
		newyork.add("New York City");
		newyork.add("Buffalo");
		newyork.add("Rochester");

		Set<String> california = new HashSet<String>();
		// System.out.println("=========== CALIFORNIA CITIES =============");
		california.add("Austin");
		california.add("Dallas");
		california.add("Houston");

		Set<String> texas = new HashSet<String>();
		// System.out.println("=========== TEXAS CITIES =============");
		texas.add("Los Angeles");
		texas.add("San Francisco");
		texas.add("San Diego");

		Set<Set<String>> usa = new HashSet<Set<String>>();
		usa.add(newyork);
		usa.add(california);
		usa.add(texas);

		Set<Set<Set<String>>> world = new HashSet<Set<Set<String>>>();
		world.add(india);
		world.add(usa);

		return world;

	}

}
