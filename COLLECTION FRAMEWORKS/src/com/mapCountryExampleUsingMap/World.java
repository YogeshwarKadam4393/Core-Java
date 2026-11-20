package com.mapCountryExampleUsingMap;

import java.util.HashMap;
import java.util.Map;

public class World {
	
	public Map<String, Map<String, Map<String, String>>> getWorld() {
		
		Map<String, String> maharashtra = new HashMap<String, String>();
		maharashtra.put("City1", "Pune");
		maharashtra.put("City2", "Mumbai");
		maharashtra.put("City3", "SambhajiNagar");
		
		Map<String, String> karnataka = new HashMap<String, String>();
		karnataka.put("City1", "Bangalore");
		karnataka.put("City2", "Mysore");
		karnataka.put("City3", "Mangalore");
		
		Map<String, Map<String, String>> india = new HashMap<String, Map<String, String>>();
		india.put("Maharashta", maharashtra);
		india.put("Karnataka", karnataka);
		
		Map<String, String> california = new HashMap<String, String>();
		california.put("City1", "Los Angeles");
		california.put("City2", "San Francisco");
		california.put("City3", "OakLand");
		
		Map<String,String> nevada = new HashMap<String, String>();
		nevada.put("City1", "Las Vegas");
		nevada.put("City2", "Henderson");
		nevada.put("City3", "Reno");
		
		Map<String, Map<String, String>> usa = new HashMap<String, Map<String, String>>();
		usa.put("California", california);
		usa.put("Nevada", nevada);
		
		Map<String, Map<String, Map<String, String>>> world = new HashMap<String, Map<String, Map<String, String>>>();
		world.put("USA", usa);
		world.put("India", india);
		
		return world;
	}
}
