package com.failFast_failSafe;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class failSafe_Example {

	public static void main(String[] args) {

		CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<Integer>();
		al.add(101);
		al.add(102);
		al.add(103);

		for (Integer integer : al) {
			al.add(104);
			System.out.println(integer);
	
		}
	System.out.println("==============================================================================");
		CopyOnWriteArraySet<Integer> al1 = new CopyOnWriteArraySet<Integer>();
		al1.add(101);
		al1.add(102);
		al1.add(103);
		al1.add(101);

		for (Integer integer1 : al1) {
			al.add(104);
			System.out.println(integer1);
	
		}
	
		System.out.println("==============================================================================");
		ConcurrentHashMap<Integer, String> al2 = new ConcurrentHashMap<Integer, String>();

		al2.put(101, "Yogesh");
		al2.put(102, "Sujit");
		al2.put(103, "Tejas");
		al2.put(104, "Sarvadnya");

		for (Integer integer : al2.keySet()) {

			al2.put(105, "Kartik");
		   System.out.println(integer +"  "+ al2.get(integer));
		    
		   

	}



	}
}
