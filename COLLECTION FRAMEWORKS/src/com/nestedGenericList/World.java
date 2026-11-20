package com.nestedGenericList;

import java.util.ArrayList;
import java.util.List;

public class World {
	
	public List<List<List<String>>> countryList(){
		
		List<String> Maharashtra = new ArrayList<String>();
		Maharashtra.add("Sambhaji Nagar");
		Maharashtra.add("Pune");
		Maharashtra.add("Mumbai");
		
		List<String> Karnataka = new ArrayList<String>();
		Karnataka.add("Mysore");
		Karnataka.add("Bangalore");
		Karnataka.add("Mangaluru");
		
		List<String> Goa = new ArrayList<String>();
		Goa.add("Panaji");
		Goa.add("Vasco da Gama");
		Goa.add("Margao");
		
		List<List<String>> India = new ArrayList<List<String>>();
		India.add(Maharashtra);
		India.add(Karnataka);
		India.add(Goa);
		
		List<String> California = new ArrayList<String>();
		California.add("Los Angeles");
		California.add("San Francisco");
		California.add("San Diego");
		
		List<String> New_York = new ArrayList<String>();
		New_York.add("New York City");
		New_York.add("Buffalo");
		New_York.add("Rochester");
		
		List<String> Texas = new ArrayList<String>();
		Texas.add("Houston");
		Texas.add("Dallas");
		Texas.add("Austin");
		
		List<List<String>> USA = new ArrayList<List<String>>();
		USA.add(California);
		USA.add(New_York);
		USA.add(Texas);
		
		List<List<List<String>>> World = new ArrayList<List<List<String>>>();
		World.add(India);
		World.add(USA);
		
		return World;
	}
}
