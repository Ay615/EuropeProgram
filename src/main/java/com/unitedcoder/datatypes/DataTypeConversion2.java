package com.unitedcoder.datatypes;

public class DataTypeConversion2 {
    public static void main(String[] args) {
        //numeric string
        String day="25";
        System.out.println(day+100);//25100

        int i1=Integer.parseInt(day);
        System.out.println(i1+100);

        double d1=Double.parseDouble(day);
        System.out.printf("d1=%f \n",d1);

        float f1=Float.parseFloat(day);
        System.out.printf("f1=%f \n",f1);

        String s1="7865AAB";//7865
        s1=s1.replace("AAB","");
        System.out.println("s1 after replace is : "+s1);
        int i2=Integer.parseInt(s1);
        System.out.println(i2);
//convert number to String
        int x=300;
        System.out.println(100+x);//400
        String x1=String.valueOf(x);
        System.out.println(100+x1);//100300

        int x3=888;
        float f4=456.1234f;
        String s2=String.valueOf(x3);
        String s3=String.valueOf(f4);
        System.out.println(x3+f4);
        System.out.println(s2+s3);

        System.out.println(Integer.toBinaryString(123));
        System.out.println(Integer.toHexString(123));
        System.out.println(Integer.toOctalString(123));

        //Integer.parseInt ---return datatype int
        //Integer.valueOf-----return type object
        String age="27";
        System.out.println(Integer.valueOf(age));
        Integer age1=new Integer("27");
        Integer n=27;//a=Integer.valueOf("27")








    }
}
