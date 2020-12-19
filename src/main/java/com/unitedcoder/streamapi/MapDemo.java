package com.unitedcoder.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<String> cars= Arrays.asList("Bus","Honda","Toyota","Benz");
        List<String> upperCaseCars=new ArrayList<>();
        upperCaseCars=cars.stream().map(m->m.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCaseCars);
        cars.stream().map(n->n.length()).forEach(n-> System.out.println(n));

    }
}
