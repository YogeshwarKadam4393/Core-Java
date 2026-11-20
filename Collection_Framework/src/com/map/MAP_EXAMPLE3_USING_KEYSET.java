package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MAP_EXAMPLE3_USING_KEYSET {

	public static void main(String[] args) {

		System.out.println("============= HASH MAP ==============");
		Map<Integer, String> map = new HashMap<Integer, String>();

		// HASHMAP WORKS ON : Key - Value Pair
		// Key : MUST BE UNIQUE & Value : CAN BE DUPLICATE
		// IN HASHMAP ONLY ONE NULL KEY IS ALLOWED

		map.put(1, "Yogesh");
		map.put(2, "Sujit");
		map.put(3, "Yogesh");
		map.put(4, "null");
		map.put(5, "null");
		map.put(6, "Sujit");
		map.put(null, "Sujit");
		System.out.println(map);

		Set<Integer> set = map.keySet(); // Returns list of keys and Return type is Set Interface
		System.out.println(set);
		System.out.println("============== Using Iterator =============");

		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			System.out.println(key + " " + map.get(key));
		}

		System.out.println("============== Using For Each Loop ==============");

		for (Integer key : set) {
			System.out.println(key + " " + map.get(key));
		}

	}
}
