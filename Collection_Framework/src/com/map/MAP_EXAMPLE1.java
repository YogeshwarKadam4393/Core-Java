package com.map;

import java.util.HashMap;
import java.util.Map;

public class MAP_EXAMPLE1 {

	public static void main(String[] args) {

		System.out.println("============= HASHMAP ==============");
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
		
		System.out.println(map.get(7)); // If u will pass the KEY which is not available then it will return NULL
		
		System.out.println(map.get(1));
		System.out.println(map.size());
		System.out.println(map.containsKey(2)); //PASS KEY
		System.out.println(map.containsValue(null)); // PASS VALUE
		System.out.println(map.isEmpty());
		
		String remove = map.remove(null); // Key Pass karna padenga
		System.out.println(map);
		
		System.out.println(map.size());
		

	}

}
