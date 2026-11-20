package com.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// List Iterator is more powerful than Iterator Method because it can traverse data in both directions forward as well as in reverse Order

public class ArrayListExample3_UsingIterator {
	
	public static void main(String[] args) {
		
		List<Character> list = new ArrayList<Character>();
		
		list.add('1');
		list.add('2');
		list.add('3');
		list.add('4');
		
		System.out.println("-----------Iterator Method------------");
		Iterator<Character> itr =list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("-----------For Each------------------");
		
		for (Character string : list) {
			System.out.println(string);
		}
		
		System.out.println("----------List Iterator---------------");
		ListIterator<Character> listIterator = list.listIterator();
		
		// Using Forward Traversal i.e, It can print data in forward way
		System.out.println("=== Forward Traversal ===");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		// Using Reverse Traversal i.e, It can print data in Reverse way
		System.out.println("=== Reverse Traversal ===");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
	}

}
