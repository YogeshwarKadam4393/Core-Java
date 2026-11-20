package com.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SET_Example1_IndiaAndStates {

	public static Set<Set<String>> addCountry() {

		Set<String> maharashtra = new HashSet<String>();
	//	System.out.println("=========== MAHARASHTRA CITIES =============");
		maharashtra.add("Pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Parbhani");

		Set<String> rajasthan = new HashSet<String>();
	//	System.out.println("=========== RAJASTHAN CITIES =============");
		rajasthan.add("Jaipur");
		rajasthan.add("Udaipur");
		rajasthan.add("Jaisalmer");

		Set<String> madhyaPradesh = new HashSet<String>();
	//	System.out.println("=========== MADHYA PRADESH CITIES =============");
		madhyaPradesh.add("Indore");
		madhyaPradesh.add("Bhopal");
		madhyaPradesh.add("Gwaliar");

		Set<Set<String>> india = new HashSet<Set<String>>();
		india.add(madhyaPradesh);
		india.add(maharashtra);
		india.add(rajasthan);

		return india;
		
	}

}
