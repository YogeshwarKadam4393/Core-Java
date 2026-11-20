package com.nestedGenericList;

import java.util.Iterator;
import java.util.List;

public class WorldMain {
	
	public static void main(String[] args) {
		
		World world = new World();
		List<List<List<String>>> World = world.countryList();
		
		System.out.println("");
		System.out.println(World);
		System.out.println("");
		
		Iterator<List<List<String>>> itrworld = World.iterator();
		while(itrworld.hasNext()) {
			List<List<String>> countries = itrworld.next();
			System.out.println("");
			System.out.println(countries);
			System.out.println("");
			
			Iterator<List<String>> itrcountry = countries.iterator();
			while(itrcountry.hasNext()) {
				List<String> state = itrcountry.next();
				System.out.println(state);
				System.out.println("");
				
				Iterator<String> itrstates = state.iterator();
				while(itrstates.hasNext()) {
					String city = itrstates.next();
					System.out.println(city);
					System.out.println("");
				}
			}
		}
	}
}
