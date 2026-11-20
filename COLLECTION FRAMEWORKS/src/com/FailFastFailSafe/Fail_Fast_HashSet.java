package com.FailFastFailSafe;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Fail_Fast_HashSet {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();	
		Collections.addAll(set, 101,101,102,102,103,104,105);
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			set.add(106);
			System.out.println(set);
		}
	}
}
