package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MAP_EXAMPLE2 {

	public static void main(String[] args) {

		System.out.println("============= HASH MAP ==============");
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// HASHMAP WORKS ON : Key - Value Pair 
		// Key : MUST BE UNIQUE & Value : CAN BE DUPLICATE
		// IN HASHMAP ONLY ONE NULL KEY IS ALLOWED
		
		map.put(1, "Yogesh"); // IN MAP IF U WANT TO ADD ELEMENTS , HERE Put(k,v) Method is there...NOT ADD() METHOD
		map.put(2, "Sujit");
		map.put(3, "Yogesh");
		map.put(4, "null");
		map.put(5, "null");
		map.put(6, "Sujit");
		map.put(null, "Sujit");
		System.out.println(map);
		
		
		System.out.println("\n============= LINKED HASH MAP ==============");
		Map<Integer, String> map1 = new LinkedHashMap<Integer, String>();
		
		// LINKED HASHMAP WORKS ON : 1. Key - Value Pair
		//                           2. INSERTION ORDER FOLLOWS OF KEY
		//                           3. CAN ADD ONE NULL KEY
		
		map1.put(1, "Yogesh"); // IN MAP IF U WANT TO ADD ELEMENTS , HERE Put(k,v) Method is there...NOT ADD() METHOD
		map1.put(2, "Sujit");
		map1.put(3, "Yogesh");
		map1.put(4, "null");
		map1.put(5, "null");
		map1.put(6, "Sujit");
		map1.put(null, "Sujit");
		System.out.println(map1);
		
		
		System.out.println("\n============= TREE MAP ==============");
		Map<Integer, String> map2 = new TreeMap<Integer, String>();
		
		// LINKED HASHMAP WORKS ON : 1. Key - Value Pair
		//                           2. ASCENDING ORDER SORTING OF KEYS
		//                           3. NO NULL VALUES ARE ALLOWED
		
		map2.put(7, "Yogesh"); // IN MAP IF U WANT TO ADD ELEMENTS , HERE Put(k,v) Method is there...NOT ADD() METHOD
		map2.put(2, "Sujit");
		map2.put(1, "Yogesh");
		map2.put(4, "null");
		map2.put(9, "null");
		map2.put(6, "Sujit");
		//map2.put(null, "Sujit"); // IF U ADD NULL VALUES THEN IT WILL GIVE NULLPOINTEREXCEPTION
		System.out.println(map2);
		
	}
}
