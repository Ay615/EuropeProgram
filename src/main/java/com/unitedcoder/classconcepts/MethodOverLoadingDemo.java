package com.unitedcoder.classconcepts;

public class MethodOverLoadingDemo {
    //method overloading is type of Java oop -Polymorphisim
    public int addTwoNumbers(int i1,int i2){
        int sum=i1+i2;
        return sum;
    }

    public long addTwoNumbers(int i1,long i2){
        long sum=i1+i2;
        return sum;
    }
    public int addTwoNumbers(int i1,int i2,int i3){
        int sum=i1+i2;
        return sum;
    }
}
