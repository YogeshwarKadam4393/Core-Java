package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MAP_EXAMPLE4_USING_ENTRYSET {

	public static void main(String[] args) {

//		System.out.println("============= HASH MAP ==============");
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

		
		System.out.println("============= ITERATION USING ENTRY SET ==============");
		
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
	    Iterator<Map.Entry<Integer, String>> itr1 = entrySet.iterator();
	    
	    while(itr1.hasNext()) {
	    	
	    	Map.Entry<Integer, String> entry = itr1.next();
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	    
		System.out.println("============= ITERATION USING FOR EACH LOOP ==============");
		
		for (Map.Entry<Integer, String> entry : entrySet) {
			
		System.out.println(entry.getKey()+" "+ entry.getValue());
		}

		
	}
}
