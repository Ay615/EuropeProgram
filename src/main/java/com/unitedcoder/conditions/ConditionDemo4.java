package com.unitedcoder.conditions;

public class ConditionDemo4 {
    public static void main(String[] args) {
        //        int month=11;
//        switch (month){
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Spring");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Summer");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Autumn");
//                break;
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("Winter");
//                break;
//
//        }

        //60 pass 60 faile
        int score=58;
//        if(score>=60){
//            System.out.println("Passed");
//        }
//        else
//            System.out.println("Failed the exam");
        switch (score/10){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Failed");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Passed");
                break;


        }

    }
}
