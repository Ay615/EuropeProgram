package com.unitedcoder.lambdaexpression;

import java.util.function.Predicate;

public class PredicateFunction3 {
    public static void main(String[] args) {
        int a[]={10,50,30,99,87,55,60};
        Predicate<Integer> p1=p->(p%2==0);
        Predicate<Integer> p2=s->(s>20);
//        for(int arr:a){
//            //if(p1.test(arr)&&p2.test(arr)){
//            if (p1.or(p2).test(arr)) {
//                System.out.println(arr);
//            }
//            }
        for(int arr:a){
            if (p1.negate().test(arr)) {

                System.out.println(arr);
            }
        }
        }

    }

