package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MAP_EXAMPLE5_USING_VALUES {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();

        // HASHMAP WORKS ON: Key - Value Pair
        // Key: MUST BE UNIQUE & Value: CAN BE DUPLICATE
        // IN HASHMAP ONLY ONE NULL KEY IS ALLOWED

        map.put(1, "Yogesh");
        map.put(2, "Sujit");
        map.put(3, "Yogesh");
        map.put(4, "null");
        map.put(5, "null");
        map.put(6, "Sujit");
        map.put(null, "Sujit");

        System.out.println("============= ITERATION USING VALUES METHOD ==============");

        Collection<String> values = map.values();

        Iterator<String> itr = values.iterator();

        while (itr.hasNext()) {

            String value = itr.next();

            System.out.println(value);
        }

        System.out.println("============= ITERATION USING FOR EACH LOOP ==============");

        for (String value : values) {

            System.out.println(value);
        }
    }
}