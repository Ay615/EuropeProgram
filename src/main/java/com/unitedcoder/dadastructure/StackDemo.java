package com.unitedcoder.dadastructure;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Book1");
        stack.push("Book2");
        stack.push("Book3");
        stack.push("Book4");
        //print the stack  LIFO
        System.out.println(stack.toString());
        //remove the book from the stack
        String removedBook=stack.pop();
        System.out.println("The book on the top is : "+removedBook);
        System.out.println(stack.toString());
        System.out.println(stack.search("Book2"));
        System.out.println(stack.search("Book1"));
    }
}
