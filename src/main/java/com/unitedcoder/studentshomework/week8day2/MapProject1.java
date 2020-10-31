package com.unitedcoder.studentshomework.week8day2;

import java.util.HashMap;
import java.util.Map;

public class MapProject1 {
    public static void main(String[] args) {
/*
Write a Java program with the following requirements.
Use Java Map data structure store following information.
Key	Value
MD	Maryland
VA	Virginia
NY	New York
Count the number of keys and print out the number
Use for each loop, print out the key and value of each state.
 */
        Map<String,String> states=new HashMap<>();
        states.put("MD","Maryland");
        states.put("VA","Virginia");
        states.put("NY","New York");
        int countKey=0;
        for (int i=0;i<states.size();i++){
            countKey++;
        }
        System.out.println("Total Keys: "+countKey);
//Use for each loop, print out the key and value of each state.
        //  Set<String> set=states.keySet();
        for (Map.Entry entry:states.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
