package com.map;

import java.util.HashMap;
import java.util.Map;

public class MAP_EXAMPLE7_WORLD {

    Map<String, Map<String, Map<String, String>>> CountriesData() {

        // cities of Maharashtra
        Map<String, String> maharashtra = new HashMap<>();
        maharashtra.put("P1", "Pune");
        maharashtra.put("P2", "Mumbai");
        maharashtra.put("P3", "Parbhani");

        // cities of Rajasthan
        Map<String, String> rajasthan = new HashMap<>();
        rajasthan.put("R1", "Jaipur");
        rajasthan.put("R2", "Udaipur");
        rajasthan.put("R3", "Jaisalmer");

        // India
        Map<String, Map<String, String>> india = new HashMap<>();
        india.put("Maharashtra", maharashtra);
        india.put("Rajasthan", rajasthan);

        // cities of California
        Map<String, String> california = new HashMap<>();
        california.put("C1", "Los Angeles");
        california.put("C2", "San Francisco");
        california.put("C3", "San Diego");

        // cities of Florida
        Map<String, String> florida = new HashMap<>();
        florida.put("F1", "Miami");
        florida.put("F2", "Orlando");
        florida.put("F3", "Tampa");

        // USA
        Map<String, Map<String, String>> usa = new HashMap<>();
        usa.put("California", california);
        usa.put("Florida", florida);

        // World
        Map<String, Map<String, Map<String, String>>> world = new HashMap<>();
        world.put("India", india);
        world.put("USA", usa);

        return world;
    }
}