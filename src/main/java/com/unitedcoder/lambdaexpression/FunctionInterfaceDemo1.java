package com.unitedcoder.lambdaexpression;

import java.util.function.Function;

public class FunctionInterfaceDemo1 {
    public static void main(String[] args) {
        Function<Integer,Integer> f1=n->n*n;
        System.out.println(f1.apply(10));
        Function<String,Integer> f2=s->s.length();
        System.out.println(f2.apply("Java"));
        Function<Integer,Integer> f3=f->f*2;
        System.out.println(f3.andThen(f1).apply(4));
        System.out.println(f3.compose(f3).apply(5));
    }
}
