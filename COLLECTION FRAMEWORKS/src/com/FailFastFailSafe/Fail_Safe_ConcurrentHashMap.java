package com.FailFastFailSafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Fail_Safe_ConcurrentHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> world = new ConcurrentHashMap<Integer, String>();
		world.put(101, "United States Of America");
		world.put(102, "Soviet Union");
		world.put(103, "New Zealand");
		world.put(104, "United Kingdom");
		
		Set<Map.Entry<Integer, String>> worldSet = world.entrySet();
		Iterator<Map.Entry<Integer, String>> itrworldSet = worldSet.iterator();
		while(itrworldSet.hasNext()) {
			Map.Entry<Integer, String> countries = itrworldSet.next();
			world.put(105, "North Korea");
			System.out.println("-- " + countries.getKey()
			+ " --> " + countries.getValue());
		}
	}
}
