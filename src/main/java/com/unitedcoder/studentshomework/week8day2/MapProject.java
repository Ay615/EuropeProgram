package com.unitedcoder.studentshomework.week8day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapProject {
    public static void main(String[] args) {
/* Use Java Map data structure store following information.
        Key 	Value
        MD 	Maryland
        VA 	Virginia
        NY 	New York
      Count the number of keys and print out the number
      Use for each loop, print out the key and value of each state.*/
        Map<String, String> cities = new HashMap<>();
        cities.put("MD", "Maryland");
        cities.put("VA", "Virginia");
        cities.put("NY", "New York");
        System.out.println("Number of keys is: " + cities.size());
        Set<String> cityKey = cities.keySet();

        for (String keys: cityKey) {
            System.out.println(String.format("%s : %s", keys, cities.get(keys)));
        }

    }
}
