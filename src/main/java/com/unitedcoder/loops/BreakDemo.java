package com.unitedcoder.loops;

public class BreakDemo {
    public static void main(String[] args) {

        //1-10000---2000
//        int i=0;
//        for(i=1;i<=100000;i++){
//            if(i>2000)
//                break;
//            System.out.println(i);
//        }
//        System.out.println(i);

        for(int j=1;j<=10;j++){//1 2 3 4 5 6 7 8 9 10
            if(j%4==0)
                break;
            System.out.println(j);
        }




    }
}
