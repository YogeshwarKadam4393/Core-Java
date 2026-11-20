package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSet1 {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(30);
		set.add(40);
		set.add(null);
		
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println(set);
		
		Iterator<Integer> itrset = set.iterator();
		while(itrset.hasNext()) {
			Integer Integerset = itrset.next();
			System.out.println(Integerset);
		}
		System.out.println("------------------------------------------------------------");
		
	}

}
