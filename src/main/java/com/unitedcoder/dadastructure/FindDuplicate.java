package com.unitedcoder.dadastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        List<String> countryName=new ArrayList<>();
        countryName.add("Australia");
        countryName.add("Brazil");
        countryName.add("Canada");
        countryName.add("Brazil");
        countryName.add("UK");
        countryName.add("Canada");
        countryName.add("US");
        Set<String> set=new HashSet<>();//not allow duplicate
        for(int i=0;i<countryName.size();i++){
            String names=countryName.get(i);
            if(set.add(names)==false){
                System.out.println(names+" Is duplicated");
            }
        }
    }
}
