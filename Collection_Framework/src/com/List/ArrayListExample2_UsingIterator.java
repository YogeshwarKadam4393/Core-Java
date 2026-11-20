package com.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample2_UsingIterator {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Yogesh");
		list.add("Omkar");
		list.add("Tejas");
		list.add("Yogesh");
		
		System.out.println("-----------Iterator Method------------");
		Iterator<String> itr =list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("-----------For Each------------------");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("----------List Iterator---------------");
		ListIterator<String> listIterator = list.listIterator();
		
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
