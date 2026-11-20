package com.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<Integer>();

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
			Integer intset = itrset.next();
			System.out.println(intset);
		}
		System.out.println("------------------------------------------------------------");
		
		for(Integer i:set) {
			System.out.println(i);
		}
	}
}
