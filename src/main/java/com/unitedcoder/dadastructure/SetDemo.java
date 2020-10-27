package com.unitedcoder.dadastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(70);
        set1.add(90);
        set1.add(20);
        System.out.println(set1.toString());
        for(int s:set1){
            System.out.print(s+" ");
        }
        System.out.println();
        Object[] set=set1.toArray();
        for(int i=0;i<set.length;i++){
            System.out.print(set[i]+" ");
        }

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(70);
        list.add(90);
        list.add(20);
        int sum=0;//0+10 10+20 30+70 100+90 190+20
        for(int i=0;i<list.size();i++){
            sum=sum+list.get(i);
        }
        System.out.println(sum);
        // System.out.println(list.toString());
    }
}
