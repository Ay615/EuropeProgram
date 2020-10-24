package com.unitedcoder.dadastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();//list of integer value
        //ArrayList<Integer> list1=new ArrayList<>();
        list.add(100);
        list.add(80);
        list.add(50);
        list.add(1000);
        list.add(100);
        System.out.println(list.size());
        Collections.sort(list);
        System.out.println(list.get(2));
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list.toString());
        list.set(3,80);
        list.add(700);
        System.out.println(list.size());
        System.out.println(list.toString());
        //for loop to retrieve elements in list
        int sum=0;
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
            sum=sum+list.get(i);
        }
        System.out.println();
        System.out.println(sum);
        //average
        System.out.println(sum/(list.size()));
        System.out.println();
        //use for each loop
        int sum1=0;
        for(int l:list){
            System.out.print(l+" ");
            sum1=sum1+l;
        }
        System.out.println();
        System.out.println(sum1);

    }
}
