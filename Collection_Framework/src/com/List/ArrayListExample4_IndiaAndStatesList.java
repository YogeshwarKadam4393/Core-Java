package com.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample4_IndiaAndStatesList {

	public static List<List<String>> addCountry() {

		List<String> maharashtra = new ArrayList<String>();
	//	System.out.println("=========== MAHARASHTRA CITIES =============");
		maharashtra.add("Pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Parbhani");

		List<String> rajasthan = new ArrayList<String>();
	//	System.out.println("=========== RAJASTHAN CITIES =============");
		rajasthan.add("Jaipur");
		rajasthan.add("Udaipur");
		rajasthan.add("Jaisalmer");

		List<String> madhyaPradesh = new ArrayList<String>();
	//	System.out.println("=========== MADHYA PRADESH CITIES =============");
		madhyaPradesh.add("Indore");
		madhyaPradesh.add("Bhopal");
		madhyaPradesh.add("Gwaliar");

		List<List<String>> india = new ArrayList<List<String>>();
		india.add(madhyaPradesh);
		india.add(maharashtra);
		india.add(rajasthan);

		return india;
		
	}

}
