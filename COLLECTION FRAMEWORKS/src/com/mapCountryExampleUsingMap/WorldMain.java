package com.mapCountryExampleUsingMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WorldMain {
	
	public static void main(String[] args) {
		
		World world = new World();
		
		Map<String, Map<String, Map<String, String>>> worldMap = world.getWorld();
		System.out.println();
		System.out.println("----------> KeySet <----------");
		System.out.println();
		Set<String> keySet = worldMap.keySet();
		Iterator<String> itrWorldMap = keySet.iterator();
		
		while(itrWorldMap.hasNext()) {
			
			String countries = itrWorldMap.next();
			System.out.println("-------------------------------------------------------");
			System.out.println("-- Country ---> " + countries);
			Map<String, Map<String, String>> statesMap = worldMap.get(countries);
			Set<String> setOfStates = statesMap.keySet();
			Iterator<String> itrStates = setOfStates.iterator();
			while(itrStates.hasNext()) {
				String statesList = itrStates.next();
				System.out.println("-------------------------------------------------------");
				System.out.println("-- State ---> " + statesList);
				System.out.println("-------------------------------------------------------");
				Map<String, String> citiesMap = statesMap.get(statesList);
				Set<String> setOfCities = citiesMap.keySet();
				Iterator<String> itrCities = setOfCities.iterator();
				while(itrCities.hasNext()) {
					String cities = itrCities.next();
					System.out.println(citiesMap.get(cities));
					System.out.println();
				}
			}
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println();
		System.out.println("-------->  For Each  <------------");
		System.out.println();
		
		Set<String> setofCountries = worldMap.keySet();
		for(String countries :setofCountries) {
			System.out.println("-------------------------------------------------------");
			System.out.println("-- Country ---> " + countries);		
			Map<String, Map<String, String>> stateMap = worldMap.get(countries);
			Set<String> setOfStates = stateMap.keySet();
			for(String states:setOfStates) {
				System.out.println("-------------------------------------------------------");
				System.out.println("-- State ---> " + states);
				System.out.println("-------------------------------------------------------");
				Map<String, String> citiesMap = stateMap.get(states);
				Set<String> setOfCities = citiesMap.keySet();
				for( String city:setOfCities) {
					System.out.println(citiesMap.get(city));
					System.out.println();
				}
			}
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

		
		System.out.println();
		System.out.println("----------> Entry Set <----------");
		System.out.println();
		
		Set<Map.Entry<String, Map<String, Map<String, String>>>> setOfCountries = worldMap.entrySet();
		Iterator<Map.Entry<String, Map<String, Map<String, String>>>> itrsetOfCountries = setOfCountries.iterator();
		while(itrsetOfCountries.hasNext()) {
			Map.Entry<String, Map<String, Map<String, String>>> countryMap = itrsetOfCountries.next();
			System.out.println("---------------------------------------------------------------------");
			System.out.println("-- Country ---> " + countryMap.getKey());	
			Map<String, Map<String, String>> stateMap = countryMap.getValue();
			Set<Map.Entry<String, Map<String, String>>> setOfStates= stateMap.entrySet();
			Iterator<Map.Entry<String, Map<String, String>>> itrsetOfStates = setOfStates.iterator();
			while(itrsetOfStates.hasNext()) {
				Map.Entry<String, Map<String, String>> states = itrsetOfStates.next();
				System.out.println("---------------------------------------------------------------------");
				System.out.println("-- State ---> " + states.getKey());
				System.out.println("---------------------------------------------------------------------");
				System.out.println();
				Map<String, String> cityMap = states.getValue();
				Set<Map.Entry<String, String>> setOfCities = cityMap.entrySet();
				Iterator<Map.Entry<String, String>> itrsetOfCities = setOfCities.iterator();
				while(itrsetOfCities.hasNext()) {
					Map.Entry<String, String> cities = itrsetOfCities.next();
					System.out.println(" -- " + cities.getKey() + " ---> " + cities.getValue());
                    System.out.println();
				}
			}
			
		}
		
		
	}
}
