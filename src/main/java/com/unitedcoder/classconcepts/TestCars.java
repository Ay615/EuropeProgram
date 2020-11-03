package com.unitedcoder.classconcepts;

import java.util.ArrayList;
import java.util.List;

public class TestCars {
    public static void main(String[] args) {
        //define Car object --new keyword
        Car toyota=new Car();//define car object  reference is car1
        toyota.setBrand("Toyota");
        toyota.setColor("White");
        toyota.setMade("Japon");
        toyota.setMileAge("15000");
        toyota.setPrice(35000);
        toyota.setYear(2019);
        Car benz=new Car();
        benz.setBrand("Benz");
        benz.setColor("Black");
        benz.setMade("Germany");
        benz.setPrice(60000);
        benz.setYear(2018);
        benz.setMileAge("45000");
        Car honda=new Car();
        honda.setBrand("Honda");
        honda.setMade("Japan");
        honda.setMileAge("250000");
        honda.setColor("red");
        honda.setPrice(80000);
        honda.setYear(2019);

        System.out.println(toyota.getColor());
        System.out.println(honda.getPrice());
        System.out.println(benz.getBrand());
        System.out.println(toyota.getMade());
        List<Car> carList=new ArrayList<>();
        carList.add(toyota);//add("A")
        carList.add(honda);
        carList.add(benz);

        for(Car cars:carList) {
            // if(cars.getBrand().equalsIgnoreCase("toyota")){
            System.out.print(String.format("%s %s %s %s %d %d",
                    cars.getBrand(),
                    cars.getColor(),
                    cars.getMade(),
                    cars.getMileAge(),
                    cars.getPrice(),
                    cars.getYear()
            ));
            // }
            System.out.println();
        }

    }

}
