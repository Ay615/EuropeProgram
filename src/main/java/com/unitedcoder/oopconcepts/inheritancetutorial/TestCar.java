package com.unitedcoder.oopconcepts.inheritancetutorial;

public class TestCar {
    public static void main(String[] args) {
        //compile time polymorphism  static polymorphisim
        BMW bmw=new BMW();
        bmw.stop();
        bmw.start();
        bmw.theftSafety();
        bmw.refuel();
        System.out.println("*******************");

        Car car=new Car();
        car.refuel();
        car.start();
        car.stop();
        //car.theftSafety();  not allowed
        System.out.println("*****************");
        //dynamic polymorphism --run time polymorphism  Top casting
        Car c=new BMW();
        c.stop();
        c.start();
        c.refuel();
        //c.thftSafety();
        //down casting
        BMW b=(BMW)new Car();

    }
}
