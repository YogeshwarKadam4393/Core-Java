package com.collectionsclass;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	
	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<Integer>();
		System.out.println();
		System.out.println("1. Collections.addAll()");
		System.out.println();
		java.util.Collections.addAll(num, 34, 57, 37, 12, 89, 45, 23, 78, 90, 11,11,11);
		System.out.println(num);
		System.out.println();
		System.out.println("2. Collections.shuffle()");
		System.out.println();
		java.util.Collections.shuffle(num);
		System.out.println(num);
		System.out.println();
		System.out.println("3. Collections.sort()");
		System.out.println();
		java.util.Collections.sort(num);
		System.out.println(num);
		System.out.println();
		System.out.println("4. Collections.reverse()");
		System.out.println();
		java.util.Collections.reverse(num);
		System.out.println(num);
		System.out.println();
		System.out.println("5. Collections.min()");
		System.out.println();
		Integer min = java.util.Collections.min(num);
		System.out.println(min);
		System.out.println();
		System.out.println("6. Collections.max()");
		System.out.println();
		Integer max = java.util.Collections.max(num);
		System.out.println(max);
		System.out.println();
		System.out.println("7. Collections.frequency()");
		System.out.println();
		int frequency = java.util.Collections.frequency(num, 11);
		System.out.println("Frequeny of 11 --> " + frequency);
		System.out.println();
		System.out.println("8. Collections.copy()\n"
				+ "Copies elements from one list to another.");
		System.out.println();
		List<Integer> numCopy = new ArrayList<Integer>();
		java.util.Collections.addAll(numCopy, 1,2,3,4,5,6,7,8,9,10,11,12);
		
		/* Interview answer
		 * Collections.copy() copies all elements from a source list into an existing
		 * destination list. The destination list must already contain at least as many
		 * elements as the source list. It replaces the destination's existing values;
		 * it does not increase the destination's size.
		 */		
		
		System.out.println("List before Copy --> ");
		System.out.println(numCopy);
		java.util.Collections.copy(numCopy, num);
		System.out.println();
		System.out.println("List after  Copy --> ");
		System.out.println(numCopy);
		System.out.println();
		System.out.println("9. Collections.binarySearch()\n"
				+ "Searches for an element using binary \r\n"
				+ "search.The list must be sorted first.");
		System.out.println();
		java.util.Collections.sort(num);
		int binarySearch = java.util.Collections.binarySearch(num, 34);
		System.out.println("-- Index of 34 --> " + binarySearch);
		/*
		 * Remember this for interviews 
		 * Collections.binarySearch() searches a sorted
		 * list. If the list is not sorted, the result is undefined/unreliable.
		 */
		System.out.println();
		System.out.println("10. Collections.fill()\n"
				+ "Replaces every element with the specified value.");
		System.out.println();
		java.util.Collections.fill(num, 7);
		System.out.println(num);
		System.out.println();
		System.out.println("11. Collections.replaceAll()\n"
				+ "Replaces all occurrences of one value with another.");
		System.out.println();
		java.util.Collections.replaceAll(num, 7, 5);
		System.out.println(num);
		num.add(0, 10);
		num.add(13, 20);
		System.out.println(num);
		System.out.println();
		System.out.println("12. Collections.swap()");
		System.out.println();
		System.out.println("List Before Swapping ---> ");
		System.out.println(num);
		System.out.println();
		java.util.Collections.swap(num, 0, 13);
		System.out.println("List After Swapping ---> ");
		System.out.println(num);
		
		
	}
}
