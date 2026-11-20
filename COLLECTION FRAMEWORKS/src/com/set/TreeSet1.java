package com.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
	
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>();
		set.add("Sarvadnya");
		set.add("Chetan");
		set.add("Shravani");
		set.add("Achal");
		set.add("Prathamesh");
		set.add("Omkar");
		set.add("Sujeet");
		set.add("Sumit");
//		set.add(null);  // null values cannot be added here in TreeSet
		
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println(set);
		
		Iterator<String> itrset = set.iterator();
		while(itrset.hasNext()) {
			String stringset = itrset.next();
			System.out.println(stringset);
		}
		
		System.out.println("------------------------------------------------------------");
		
//		Iterator<String> itrset2 = set.iterator();
//		while(itrset.hasPrevious()) {
//			String stringset2 = itrset.previous();
//			System.out.println(stringset2);
//			
//			hasPrevious() is exclusive to ListIterator and 
//			works only with List, not with Set or other collections.
		
//		🚀 Why only List?
//
//				Because:
//
//				List is ordered + indexed
//				So Java can move forward and backward
//
//				But:
//
//				Set is unordered
//				So backward navigation doesn’t make sense
//		}
	}
}
