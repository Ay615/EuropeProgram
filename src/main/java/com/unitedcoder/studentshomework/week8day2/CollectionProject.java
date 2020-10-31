package com.unitedcoder.studentshomework.week8day2;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionProject {
    public static void main(String[] args) {
        ArrayList<Integer> arr30 = new ArrayList<Integer>();
        ArrayList<Integer> arr100 = new ArrayList<Integer>();
        int countEven = 0;
        int countOdd = 0;
        int count3 = 0;
        int sum = 0;
        for(int i = 0; i <100; i++){
            //0.0 --0.99  0--99   1-100
            int ran = (int)(Math.random()*100+1);
            // The array that length of 100
            arr100.add(ran);
            sum = sum + arr100.get(i);
            // The array that length of 30
            if (i<30) {
                arr30.add(ran);
                //Even, Odd and the number divided by 3 counts
                if (arr30.get(i) % 2 == 0) {
                    countEven++;
                }
                if(arr30.get(i)%2!=0)
                    countOdd++;
                if (arr30.get(i) % 3 == 0)
                    count3++;
            }
        }
        System.out.println(arr30);
        System.out.println("Total even number is: "+ countEven);
        System.out.println("Total Odd number is: "+ countOdd);
        System.out.println("Total count of number that divided by 3 is: "+ count3);
        System.out.println(String.format("\nSum of 100 random namber is: %d, average is: %d.", sum, sum/100));
        // sort by ascending order
        Collections.sort(arr30);
        Collections.sort(arr100);
        System.out.println("100 random numbers ascending order:\n" + arr100);
        System.out.println("30 random numbers ascending order:\n" + arr30);
        //sort by descending order
        for(int i= arr30.size()-1; i >=0; i--){
            System.out.print(arr30.get(i)+" ");
        }
    }
}
