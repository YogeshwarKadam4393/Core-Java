package com.mapCountryExampleUsingSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class World {

	public Map<String, Map<String, Set<String>>> Country_List() {

		Set<String> New_South_Wales = new HashSet<String>();
		New_South_Wales.add("Sydney");
		New_South_Wales.add("Newcastle");
		New_South_Wales.add("Wollongong");
		
		Set<String> Victoria = new HashSet<String>();
		Victoria.add("Melbourne");
		Victoria.add("Geelong");
		Victoria.add("Ballarat");
		
		Map<String, Set<String>> Australia = new HashMap<String, Set<String>>();
		Australia.put("New_South_Wales", New_South_Wales);
		Australia.put("Victoria", Victoria);
		
		Set<String> Jalisco = new HashSet<String>();
		Jalisco.add("Guadalajara");
		Jalisco.add("Zapopan");
		Jalisco.add("Tlaquepaque");
		
		Set<String> Nuevo_León = new HashSet<String>();
		Nuevo_León.add("Monterrey");
		Nuevo_León.add("San Nicolás de los Garza");
		Nuevo_León.add("Guadalupe");
		
		Map<String, Set<String>> Mexico = new HashMap<String, Set<String>>();
		Mexico.put("Jalisco", Jalisco);
		Mexico.put("Nuevo_León", Nuevo_León);
		
		Map<String, Map<String, Set<String>>> World = new HashMap<String, Map<String, Set<String>>>();
		World.put("Australia", Australia);
		World.put("Mexico", Mexico);
		
		return World;
	}
}
