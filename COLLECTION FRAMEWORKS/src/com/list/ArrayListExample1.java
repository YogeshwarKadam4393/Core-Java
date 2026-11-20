package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
	
	private static void runList() {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(400);
		list2.add(500);
		list2.add(600);
		
		System.out.println("--------------------------------------");
		System.out.println(list1);
		System.out.println("--------------------------------------");
		System.out.println(list2);
		System.out.println("--------------------------------------");
		
		System.out.println(list1.addAll(2, list2));
		System.out.println(list1);
		System.out.println("--------------------------------------");
		list1.removeAll(list2);
		System.out.println(list1);
		System.out.println("--------------------------------------");
		
		list1.retainAll(list2);
		System.out.println(list1);
		
	}
	
	public static void main(String[] args) {
		runList();
	}
}
