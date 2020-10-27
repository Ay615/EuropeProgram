package com.unitedcoder.dadastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("Java");
        list.add("Python");
        LinkedList<String> list1=new LinkedList();
        list1.add("Java script");
        list1.add("Selenium");
        list1.addFirst("webDriver");
        list1.addLast("Test");
        System.out.println(list);
        //System.out.println(list1);
        //Generics  rowType
        List<Object> list2=new ArrayList();//object
        list2.add(20);
        list2.add("apple");
        list2.add(89.67);
        //use for loop
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        //user for each loop
        for(String s:list1){
            System.out.print(s+" ");
        }
        System.out.println();
        //iterator
        Iterator<String> iterator=list1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        List<Integer> value=new ArrayList<>();
        value.add(10);
        value.add(90);
        value.add(200);
        Iterator<Integer> it=value.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        for(int i=0;i<value.size();i++){
            if(it.hasNext())
                System.out.println(it.next());
        }

    }
}
