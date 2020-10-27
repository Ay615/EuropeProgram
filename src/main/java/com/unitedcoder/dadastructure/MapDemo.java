package com.unitedcoder.dadastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> age=new HashMap<>();
        age.put("Kawuljan",30);
        age.put("Abliz",30);
        age.put("aron",3);
        System.out.println(age.get("Abliz"));
        System.out.println(age.get("aron"));
        age.replace("Abliz",35);
        System.out.println(age.get("Abliz"));
        Set<String> set=age.keySet();
        System.out.println(set.toString());
        for(String s:set){
            System.out.print(age.get(s)+" ");
        }
        System.out.println();

        for(Map.Entry entry:age.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        System.out.println(age.toString());
    }
}
