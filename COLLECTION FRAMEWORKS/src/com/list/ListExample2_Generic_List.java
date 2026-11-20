package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample2_Generic_List {
	
	public static void Line() {
		System.out.println("");
		System.out.println("--------------------------------------------------------");
		System.out.println("");
	}
	
	public static void runList() {
		
		Employees e1 = new Employees(10, "Edward", 5623481256l);
		Employees e2 = new Employees(20, "Alice", 5894216359l);
		Employees e3 = new Employees(30, "Jacob", 5623874516l);
		
		List<Employees> emplist = new ArrayList<Employees>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		
		System.out.println(emplist);
		
		Line();
		
		Iterator<Employees> itr = emplist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Line();
		
		for(Employees e:emplist) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		runList();
	}
}
