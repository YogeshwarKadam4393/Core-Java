package com.set;

import java.util.HashSet;
import java.util.Set;

public class SET_Example5_HS_METHODS {
	
	public static void main(String[] args) {
		
		Set<Integer> set =  new HashSet<Integer>();
		set.add(101);
		set.add(102);
		set.add(null);
		set.add(103);
		set.add(1);
		set.add(null);
		set.add(102);
		set.add(103);
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.contains(103));
		
		// IN SET --> REMOVE METHOD IS DIFFERENT FROM LIST , IN SET IT TAKES ELEMENT TO REMOVE BUT IN LIST IT TAKES INDEX
		set.remove(null);
		System.out.println(set);
		
		
	}

}
