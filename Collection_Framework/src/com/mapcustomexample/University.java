package com.mapcustomexample;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class University {

	public static void main(String[] args) {

		College c = new College();

		Map<Integer, Student> stdMap = c.getStudent();

		System.out.println("=================== USING KEYSET ITERATOR =================\n");
		Set<Integer> set = stdMap.keySet();
		Iterator<Integer> itr = set.iterator();

		while (itr.hasNext()) {

			Integer key = itr.next();
			System.out.println(key + "  " + stdMap.get(key));
		}

		System.out.println("\n=================== USING KEYSET FOR EACH LOOP =================\n");

		for (Integer integer : set) {
			System.out.println(integer + "  " + stdMap.get(integer));
		}

		System.out.println("\n=================== USING ENTRYSET ITERATOR =================\n");
		Set<Map.Entry<Integer, Student>> entrySet = stdMap.entrySet();
		Iterator<Map.Entry<Integer, Student>> itr1 = entrySet.iterator();

		while (itr1.hasNext()) {
			Map.Entry<Integer, Student> ent = itr1.next();
			System.out.println(ent.getKey() + "  " + ent.getValue());
		}

		System.out.println("\n=================== USING ENTRYSET FOR EACH LOOP =================\n");

		for (Map.Entry<Integer, Student> entry : entrySet) {
			System.out.println(entry);
		}

	}

}
