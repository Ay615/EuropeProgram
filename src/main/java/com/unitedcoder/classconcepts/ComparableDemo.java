package com.unitedcoder.classconcepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Car> carList=new ArrayList<>();
        carList.add(new Car("Toyota","White",1000));
        carList.add(new Car("Honda","Black",10000));
        carList.add(new Car("BMW","Black",50000));
        carList.add(new Car("Benz","Green",100));
        System.out.println(carList.toString());

        //comparable interface comparator method
//        carList.sort(Comparator.comparing(Car::getPrice));
//        System.out.println(carList.toString());
//        carList.sort(Comparator.comparing(Car::getPrice).reversed());
//        System.out.println(carList.toString());
        Collections.sort(carList);
        System.out.println(carList.toString());


    }
}
