package com.unitedcoder.oopconcepts.inheritancetutorial;

public class Benz extends BMW {
    public void start(){
        System.out.println("Benz---start");
    }

    public static void main(String[] args) {
        Benz benz=new Benz();
        benz.start();
        benz.stop();
        benz.refuel();
        benz.theftSafety();
    }
}
