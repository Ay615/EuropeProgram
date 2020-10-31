package com.unitedcoder.dadastructure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        //linkedList class implements the queue interface
        //queue FIFO  first in first out
        Queue<Integer> customers=new LinkedList<>();
        customers.add(1);
        customers.add(2);
        customers.add(3);
        customers.add(4);
        System.out.println(customers.toString());
        customers.remove();//1
        System.out.println(customers.toString());
        //check the next customer exist or not
        System.out.println(customers.peek());
        customers.poll();//remove
        System.out.println(customers.toString());
        System.out.println(customers.add(5));
        System.out.println(customers.toString());
        customers.remove();//3
        customers.remove();//4
        customers.remove();//5
        customers.peek();
        customers.poll();
        customers.remove(4);
        System.out.println(customers.toString());
        System.out.println(customers.contains(7));
        System.out.println("Priority Queue");
        //manage based on alphabatic
        Queue<String> priorityQueue=new PriorityQueue<>();
        priorityQueue.add("Banana");
        priorityQueue.add("Apple");
        priorityQueue.add("Pear");
        priorityQueue.add("Grape");
        priorityQueue.add("Ccacb");
        priorityQueue.add("Deq");
        System.out.println(priorityQueue.toString());
        Queue<Integer> priorityQueue1=new PriorityQueue<>();
        priorityQueue1.add(10);
        priorityQueue1.add(4);
        priorityQueue1.add(7);
        priorityQueue1.add(5);
        priorityQueue1.remove();
        System.out.println(priorityQueue1.toString());
    }
}
