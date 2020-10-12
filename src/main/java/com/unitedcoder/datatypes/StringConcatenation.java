package com.unitedcoder.datatypes;

public class StringConcatenation {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        String x="Hi";
        String y="Java";
        String z="50";//numeric string
        System.out.println(a+b);
        System.out.println(a+z);//10050
        System.out.println(x+y);
        System.out.println(a+b+z+x+y);//30050hijava
        System.out.println(x+y+(a+b));//hijava300
        System.out.println(x+y+a+b);
        System.out.println(a+b+x+y+a+b);//300hijava100200
        System.out.println(a+b+x+y+(a+b));
        System.out.println(b-a);
        //String concatenation -join two string - + , concat method , String.format
        String s1="United";
        String s2="Coder";
        String s3=" ";
        System.out.println(s1+s3+s2);
        System.out.println(s1+" "+s2);
        System.out.println(s1.concat(" "+s2));
        System.out.println(String.format("Welcom to %s %s",s1,s2));
        String country="USA";
        String city="LA";
        System.out.println(String.format("I live in %s %s",country,city));
        String name="Aynigar";
        System.out.println(name);
        System.out.println("My name is :"+name);
        System.out.println(String.format("My name is %s",name));







    }

}
