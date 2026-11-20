package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample1 {
	
	public static void Line() {
		System.out.println("");
		System.out.println("--------------------------------------------------------");
		System.out.println("");
	}
	
	public static void runList() {
		
		List arr1 = new ArrayList();
		
		arr1.add(10);
		arr1.add(20);
		arr1.add("Ben");
		arr1.add("Kevin");
		arr1.add(500.25);
		arr1.add('A');
		arr1.add(true);
		arr1.add(8805005190l);
		arr1.add(null);
		
		Line();
		
		System.out.println("Lenth Of List arr1 :- " + arr1.size());
		System.out.println(arr1);
		
		Line();
		
		System.out.println("get method :- ");
		Integer i1 = (Integer)arr1.get(1);
		System.out.println(i1);
		System.out.println(arr1);
		
		Line();
		
		System.out.println("Remove Method :- " + arr1.remove(5));
		System.out.println(arr1);
		
		Line();
		
		System.out.println("Contains Method :- " + arr1.contains("Kevin"));
		
		Line();
		
		System.out.println("Is Empty Method :- " + arr1.isEmpty());
		
		Line();
		
		System.out.println(">>>   Using Iterator   <<<");
		System.out.println("");
		
		Iterator itr1 = arr1.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		Line();
		
		System.out.println(">>>   Using For Each   <<<");
		System.out.println("");
		
		for(Object l1:arr1) {
			System.out.println(l1);
		}
		
		Line();
		
		arr1.add(2, "Gwen");
		System.out.println(arr1);
		
		Line();
		
		arr1.set(6, false);
		System.out.println(arr1);
		
		Line();
		
		System.out.println(arr1.indexOf("Ben"));
		
		Line();
		
		System.out.println(arr1.lastIndexOf("Ben"));
		
		Line();
		
		ListIterator itr2 = arr1.listIterator(2);
		while(itr2.hasNext()) {
			Object obj = itr2.next();
			System.out.println(obj);
		}
		
		Line();
		System.out.println(arr1);
		ListIterator itr3 = arr1.listIterator(9);
		while(itr3.hasPrevious()) {
			Object obj = itr3.previous();
			System.out.println(obj);
		}
		
		Line();
		
		List itr4 = arr1.subList(2,5);
		System.out.println(itr4);
		
		Line();
		
//		System.out.println(arr1.clear());
	}
	
	public static void main(String[] args) {
		
		runList();
	}
}




