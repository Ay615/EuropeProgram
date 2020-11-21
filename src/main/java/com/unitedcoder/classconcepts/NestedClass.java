package com.unitedcoder.classconcepts;

public class NestedClass {//root class  outer class

    private void print(){
        System.out.println("This is a print statement of the root class");
    }
    //non - static inner class
    class InnerClassA{
        private int sum(int a,int b){
            System.out.println(String.format("%d+%d=%d",a,b,a+b));
            return a+b;}

        }

    //static inner class
    static class InnerClassB{
        private long multiply(int a,int b){
            return a*b;
        }

    }

    public static void main(String[] args) {
        NestedClass nestedClass=new NestedClass();
        nestedClass.print();
        //creating instance of inner class A
        //Encapsulation--data hiding
        NestedClass.InnerClassA innerClassA=new NestedClass().new InnerClassA();
        innerClassA.sum(100,300);
        InnerClassB classB=new InnerClassB();
        System.out.println(classB.multiply(20,4));

    }
}

