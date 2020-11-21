package com.unitedcoder.classconcepts;

public class MultiThreadDemo {
    public static void main(String[] args) {
        //print 4 message on the screen in parallel
        //define Object instance of class
        GreetingPrinting g1=new GreetingPrinting("Hello,Java");
        GreetingPrinting g2=new GreetingPrinting("Test Automation");
        GreetingPrinting g3=new GreetingPrinting("Selenium is Fun");
        GreetingPrinting g4=new GreetingPrinting("SDET trainig");
        //define Thread
        Thread t1=new Thread(g1);
        Thread t2=new Thread(g2);
        Thread t3=new Thread(g3);
        Thread t4=new Thread(g4);
        //start the thread
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
