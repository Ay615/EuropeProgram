package com.unitedcoder.classconcepts;
enum level{
    LOW,MEDIUM,HIGH
}
public class EnumType {
    public static void main(String[] args) {
        // System.out.println(level.HIGH);
        level l=level.HIGH;
        switch (l){
            case HIGH:
                System.out.println("High level");
                break;
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
        }

    }
}
