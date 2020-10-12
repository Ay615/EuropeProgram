package com.unitedcoder.datatypes;

public class StringDemo2 {
    public static void main(String[] args) {
        String country="Turkey";
        String city="Istanbul/Kadikoy moda mahellesi  ";
        //indexOf -- method
        System.out.println(country.indexOf("k"));
        System.out.println(country.indexOf("K"));
        System.out.println("length of city is : "+city.length());
        System.out.println(city.indexOf("moda"));
        System.out.println(city.indexOf("Moda"));//return -1
        String address="  istanbul beylikduzu main street  ";
        System.out.println(address.length());
        address=address.trim();
        System.out.println(address.length());
        //compare two string--equalsto()
        String h1="hello";
        String h2="Hello";
        System.out.println(h1.equals(h2));//false
        System.out.println(h1.equalsIgnoreCase(h2));//true
       String x="100";
       double d1=Double.parseDouble(x);
       int d2=Integer.valueOf(x);
        System.out.println(d1+10);
        System.out.println(d2+10);






    }
}
