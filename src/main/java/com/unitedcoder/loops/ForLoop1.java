package com.unitedcoder.loops;

public class ForLoop1 {
    public static void main(String[] args) {
        //1-1000
        for(int i=1;i<=1000;i++){
            System.out.println(i);//1 2 3 ..... 1000
        }
        //1000-1
        for(int j=1000;j>0;j--){
            System.out.println(j);
        }
        int sum=0;
        for(int i=0;i<100;i=i+5){
            sum++;
            System.out.println("You can buy");//5 =i 10 15
        }
        System.out.println(String.format("You can buy %d stuff",sum));
        System.out.println("You dont have enough money");

        //1-100
        int evenNumberCounts=0;
        for(int i=0;i<100;i=i+2){
            evenNumberCounts++;
            System.out.println("Even numbers between 1-100 is :"+i);
        }
        System.out.println("Even Numbers are "+evenNumberCounts);

//        for(int i=0;i<100;i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }



    }
}
