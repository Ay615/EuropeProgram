package com.unitedcoder.classconcepts;

public class SingletonClass {
    private static SingletonClass singleton=null;
    public String str="Hello,Java-Selenium";

    private SingletonClass(){
        //str="Hello,Java-Selenium";
    }

    //lazy initialization
    public static SingletonClass getInstance(){
        if(singleton==null) {
            singleton = new SingletonClass();
        }
            return singleton;
        }

    public static void main(String[] args) {
        SingletonClass x=SingletonClass.getInstance();
        SingletonClass y=SingletonClass.getInstance();
        SingletonClass z=SingletonClass.getInstance();

        x.str=(x.str).toUpperCase();
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);
    }
    }

