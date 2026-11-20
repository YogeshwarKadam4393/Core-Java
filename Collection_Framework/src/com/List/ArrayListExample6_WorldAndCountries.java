package com.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample6_WorldAndCountries {

	public static List<List<List<String>>> world() {

		List<String> maharashtra = new ArrayList<String>();
		// System.out.println("=========== MAHARASHTRA CITIES =============");
		maharashtra.add("Pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Parbhani");

		List<String> rajasthan = new ArrayList<String>();
		// System.out.println("=========== RAJASTHAN CITIES =============");
		rajasthan.add("Jaipur");
		rajasthan.add("Udaipur");
		rajasthan.add("Jaisalmer");

		List<String> madhyaPradesh = new ArrayList<String>();
		// System.out.println("=========== MADHYA PRADESH CITIES =============");
		madhyaPradesh.add("Indore");
		madhyaPradesh.add("Bhopal");
		madhyaPradesh.add("Gwaliar");

		List<List<String>> india = new ArrayList<List<String>>();
		india.add(madhyaPradesh);
		india.add(maharashtra);
		india.add(rajasthan);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		List<String> newyork = new ArrayList<String>();
		// System.out.println("=========== NEWYORK CITIES =============");
		newyork.add("New York City");
		newyork.add("Buffalo");
		newyork.add("Rochester");

		List<String> california = new ArrayList<String>();
		// System.out.println("=========== CALIFORNIA CITIES =============");
		california.add("Austin");
		california.add("Dallas");
		california.add("Houston");

		List<String> texas = new ArrayList<String>();
		// System.out.println("=========== TEXAS CITIES =============");
		texas.add("Los Angeles");
		texas.add("San Francisco");
		texas.add("San Diego");

		List<List<String>> usa = new ArrayList<List<String>>();
		usa.add(newyork);
		usa.add(california);
		usa.add(texas);

		List<List<List<String>>> world = new ArrayList<List<List<String>>>();
		world.add(india);
		world.add(usa);

		return world;

	}

}
