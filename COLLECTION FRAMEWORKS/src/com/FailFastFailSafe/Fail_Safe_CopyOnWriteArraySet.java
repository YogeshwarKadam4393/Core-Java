package com.FailFastFailSafe;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Fail_Safe_CopyOnWriteArraySet {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new CopyOnWriteArraySet<>();
		Collections.addAll(set, 101,102,103,104);
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			set.add(105);
			System.out.println(set);
		}
	}
}
