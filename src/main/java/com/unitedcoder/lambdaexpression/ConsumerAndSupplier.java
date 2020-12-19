package com.unitedcoder.lambdaexpression;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplier {
    public static void main(String[] args) {
        Consumer<String> c1=s-> System.out.println(s+" "+"is Fun");
        Consumer<String> c2=s-> System.out.println(s+" "+"is not difficult");
        Consumer<String> c3=s-> System.out.println(s+" "+"is intresting");
//        c1.accept("Java");
//        c2.accept("Java");
//        c3.accept("Java");
        c1.andThen(c2).andThen(c3).accept("java");

        Supplier<Date> s=()->new Date();
        System.out.println(s.get());



    }
}
