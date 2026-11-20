package com.mapCountryExampleUsingList;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorldMain {
	
	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println("===================================================");
		System.out.println("");
		
		World world = new World();
		Map<String, Map<String, List<String>>> WorldMap = world.countryList();
		System.out.println(WorldMap);
		
		System.out.println("");
		System.out.println("===================================================");
		System.out.println("");
		
		Set<String> countryKeys = WorldMap.keySet();
		System.out.println(countryKeys);
		
		System.out.println("");
		System.out.println("===================================================");
		System.out.println("");
		
		Iterator<String> itrCountryKeys = countryKeys.iterator();
		while(itrCountryKeys.hasNext()) {
			String countries  = itrCountryKeys.next();
			System.out.println("");
			System.out.println("|>>>>>   " + countries + "   <<<<<|");
			System.out.println("");
			System.out.println("-----------------------------------");
			Map<String, List<String>> countryStates = WorldMap.get(countries);
			System.out.println(countryStates);
			System.out.println("-----------------------------------");
		    Set<String> stateKeys = countryStates.keySet();
			System.out.println(stateKeys);
			System.out.println("-----------------------------------");
			Iterator<String> itrStateKeys = stateKeys.iterator();
			while(itrStateKeys.hasNext()) {
				String states = itrStateKeys.next();
				System.out.println("");
				System.out.println("|>>>   " + states + "   <<<|");
				System.out.println("");
				List<String> cities = countryStates.get(states);
//				System.out.println(cities);
				Iterator<String> itrCities = cities.iterator();
				while(itrCities.hasNext()) {
					String citiesList = itrCities.next();
					System.out.println(citiesList);
					System.out.println("");
				}
			}
		}
	}
	

}
