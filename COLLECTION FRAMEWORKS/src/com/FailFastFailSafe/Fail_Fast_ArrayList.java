package com.FailFastFailSafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Fail_Fast_ArrayList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		Collections.addAll(list, 10, 20, 30, 40, 50);

//		Iterator<Integer> itrList = list.iterator();
//		while (itrList.hasNext()) {
////			if (itrList.next() == 20) {
////				itrList.remove();
//////				list.add(60);
//////				System.out.println(list);
////			}
//     		Integer i = itrList.next();
//     		itrList.remove();
//     		System.out.println(i);		
//		}
//		System.out.println(list);
	

		for (Integer i : list) {
			list.add(500);
			System.out.println(list);
		}
	}
}