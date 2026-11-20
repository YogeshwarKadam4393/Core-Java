package com.collections_methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("Yogesh");
		names.add("Akash");
		names.add("Sarvadnya");
		names.add("Bhaktaraj");

		// syncronizedList ---> Collections.synchronizedList() returns a
		// synchronized/thread-safe wrapper around the specified List, making individual
		// List operations synchronized.
		// SAME METHODS ARE AVAILABLE FOR SET & MAP
		List<String> syncList = Collections.synchronizedList(names);
		System.out.println(syncList);

		// swap ---> Used to swap the elements at the given indexes
		Collections.swap(names, 0, 3);
		System.out.println("ELEMENTS AFTER SWAPED : " + names);

		// EMPTY_LIST ---> Predefined empty immutable List constant provided by the
		// Collections class
		List<String> emptyList = Collections.EMPTY_LIST;
		System.out.println(emptyList);

		// copy() ---> Copies elements from source List to destination List
		// Destination List size must be >= Source List size
		List<String> destination = new ArrayList<String>();

		destination.add("  ");
		destination.add("  ");
		destination.add("  ");
		destination.add("  ");

		Collections.copy(destination, names);
		System.out.println("ELEMENTS COPIED FROM LIST 1 TO LIST 2 : " + destination);

		// min ---> Used to Find the Minimum value
		System.out.println("FIND MINIMUM VALUE IN LIST : " + Collections.min(names));

		// To find Max in the list
		System.out.println("FIND MAXIMUM VALUE IN LIST : " + Collections.max(names));

		// addAll ---> adds All Elements
		Collections.addAll(names, "Yogesh", "Sumit", "Sujit", "Omkar");
		System.out.println("ELEMENTS ARE ADDED IN THE LIST : " + names);

		// reverse ---> It Gives Elements in Reverse Order
		Collections.reverse(names);
		System.out.println("NAMES IN REVERSE ORDER : " + names);

		// sorting is done from a-z
		Collections.sort(names);
		System.out.println("NAMES AFTER SORTING IN ASCENDING ORDER : " + names);

		// shuffle ---> It Gives the Output in Shuffled For Security Purpose
		Collections.shuffle(names);
		System.out.println(names);

		// Total We Have 3 Methods For UnModify --->
		// 1. Collections.unmodifiableList(null);
		// 2. Collections.unmodifiableSet(null);
		// 3. Collections.unmodifiableMap(null);

		names = Collections.unmodifiableList(names);
		// names.add("Yogesh"); // ---> If we tries to add any values after doing
		// unmodifiable then it gives UnsupportedOperationException ... We Cannot add
		// any values after doing unmodify

	}

}
