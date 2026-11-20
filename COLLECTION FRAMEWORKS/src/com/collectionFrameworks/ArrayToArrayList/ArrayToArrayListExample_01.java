package com.collectionFrameworks.ArrayToArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListExample_01 {
	
	public static void main(String[] args) {
		
		String[] array = new String[] {"ANDROID","IOS","GOOGLE"};
		ArrayList<String> stringLists = new ArrayList<String>(Arrays.asList(array));
		
		System.out.println(stringLists);
	}
}
