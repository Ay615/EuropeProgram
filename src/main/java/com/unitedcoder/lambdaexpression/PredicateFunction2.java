package com.unitedcoder.lambdaexpression;

import java.util.function.Predicate;

public class PredicateFunction2 {
    public static void main(String[] args) {
        //given value is greate than 30 or not
        Predicate<Integer> predicate=p->(p>30);
        System.out.println(predicate.test(90));
        //given String length is gretaer than 4
        Predicate<String> p1=s->(s.length()>4);
        System.out.println(p1.test("City"));
        System.out.println(p1.test("Selenium"));
        System.out.println(p1.test("Turkey"));
        String name[]={"Tom","Mike","Merry","David"};
        for(String names:name){
//            if (p1.test(names)) {
//                System.out.println(names);
//            }
            if(names.length()>4)
                System.out.println(names);
        }




    }
}
