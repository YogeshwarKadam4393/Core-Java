package com.mapCountryExampleUsingSet;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WorldMain {
	
	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println("===========================================");
		System.out.println("");
		World world = new World();
		Map<String, Map<String, Set<String>>> WorldMap = world.Country_List();
		System.out.println(WorldMap);
		System.out.println("");
		System.out.println("===========================================");
		System.out.println("");
		Set<String> countryKeys = WorldMap.keySet();
		System.out.println(countryKeys);
		System.out.println("");
		System.out.println("===========================================");
		System.out.println("");
		
		Iterator<String> itrCountryKeys = countryKeys.iterator();
		while(itrCountryKeys.hasNext()) {
			String Countries = itrCountryKeys.next();
			System.out.println("");
			System.out.println("|>>>>>   "+Countries+"   <<<<<|");
			System.out.println("");
			Map<String, Set<String>> statesList= WorldMap.get(Countries);
			System.out.println(statesList);
			System.out.println("");
			System.out.println("-------------------------------------------");
			System.out.println("");
			Set<String> statesKeys = statesList.keySet();
			System.out.println(statesKeys);
			System.out.println("");
			System.out.println("-------------------------------------------");
			System.out.println("");
			Iterator<String> itrStateKeys = statesKeys.iterator();
			while(itrStateKeys.hasNext()) {
				String States = itrStateKeys.next();
				System.out.println("|>>>   "+States+"   <<<|");
				System.out.println("");
				Set<String> CitiesList = statesList.get(States);
				System.out.println(CitiesList);
				System.out.println("");
				System.out.println("-------------------------------------------");
				System.out.println("");
				Iterator<String> itrCities = CitiesList.iterator();
				while(itrCities.hasNext()) {
					String Cities = itrCities.next();
					System.out.println(Cities);
					System.out.println("");
					System.out.println("-------------------------------------------");
					System.out.println("");
				}
			}
		}
	}
}
