package com.FailFastFailSafe;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Fail_Safe_CopyOnWriteArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> list = new CopyOnWriteArrayList<Integer>();
		
		Collections.addAll(list, 10, 20, 30, 40, 50);

//		Iterator<Integer> itrList = list.iterator();
//		while (itrList.hasNext()) {
//			list.add(60);
//			System.out.println(list);
//
//		}
		
		for(Integer i:list) {
			list.add(60);
			System.out.println(list);
		}
	}
}
