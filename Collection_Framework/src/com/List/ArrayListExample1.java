package com.List;

import java.util.ArrayList;
import java.util.List;

// List Properties : 
// 1. Insertion Order Follows
// 2. Index maintain
// 3. Duplicate Values are allowed
// 4. Random access Possible because of Index Maintains

public class ArrayListExample1 {

	public static void main(String[] args) {

		List arrayList = new ArrayList();

		arrayList.add("Yogesh");
		arrayList.add(10);
		arrayList.add(true);
		arrayList.add("Yogesh");
		arrayList.add(99.00);
		System.out.println(arrayList);

		System.out.println(arrayList.contains("Yogesh"));
		System.out.println(arrayList.size());
		arrayList.remove(4);

		System.out.println(arrayList);
	}

}
