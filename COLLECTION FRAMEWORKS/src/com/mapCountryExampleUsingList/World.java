package com.mapCountryExampleUsingList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class World {
	
	public Map<String, Map<String, List<String>>> countryList() {
		
		List<String> Maharashtra = new ArrayList<String>();
		Maharashtra.add("Pune");
		Maharashtra.add("Mumbai");
		Maharashtra.add("Chattrapati SambhajiNagar");
		
		List<String> UP = new ArrayList<String>();
		UP.add("Noida");
		UP.add("Kanpur");
		UP.add("Agra");
		
		Map<String, List<String>> India = new HashMap<String, List<String>>();
		India.put("Maharashtra", Maharashtra);
		India.put("UP", UP);
		
		List<String> California = new ArrayList<String>();
		California.add("Los Angeles");
		California.add("San Francisco");
		California.add("San Diego");
		
		List<String> New_York = new ArrayList<String>();
		New_York.add("New_York_City");
		New_York.add("Manhattan");
		New_York.add("Rochester");
		
		Map<String, List<String>> USA = new HashMap<String, List<String>>();
		USA.put("California", California);
		USA.put("New_York", New_York);
		
		Map<String, Map<String, List<String>>> World = new LinkedHashMap<String, Map<String, List<String>>>();
		World.put("India", India);
		World.put("USA", USA);
		return World;
	}
}
