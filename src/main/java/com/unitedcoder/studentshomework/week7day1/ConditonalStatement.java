package com.unitedcoder.studentshomework.week7day1;

import java.util.Scanner;

public class ConditonalStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ئاي سانىنى كىرگۈزۈڭ:");
        int ay = input.nextInt();
        switch (ay) {
            case 1:
                System.out.println("ئۇيغۇرچە ئاتىلىشى: يانىۋار  January ");  // چوقۇم بىرىكنىbreak; ئۇنتۇپ قالماسلىق كېرەك
                // چوقۇم بىرىكنىbreak; ئۇنتۇپ قالماسلىق كېرەك
                break;
            case 2:
                System.out.println("ئۇيغۇرچە ئاتىلىشى :فىبرايىل february ");
                break;
            case 3:
                System.out.println("March  ئۇيغۇرچە ئاتلىشى: مارىس");
                break;
            case 4:
                System.out.println("April ئۇيغۇرچە ئاتلىشى : ئاپىرىل");

                break;
            case 5:
                System.out.println("May  ئۇيغۇرچە ئاتلىشى: ماي");
                break;
            case 6:
                System.out.println("June  ئۇيغۇرچە ئاتلىشى : ئىيۇن");
                break;
            case 7:
                System.out.println("July  ئۇيغۇرچە ئاتىلىشى : ئىيول");
                break;
            case 8:
                System.out.println("August  ئۇيغۇرچە ئاتلىشى : ئاۋغۇسىت");
                break;
            case 9:
                System.out.println("Septemberئۇيغۇرچە ئاتلىشى : سىمتەمبىر");
                break;
            case 10:
                System.out.println("October   ئۇيغۇرچە ئاتلىشى : ئۆكتەبىر");
                break;
            case 11:
                System.out.println("November  ئۇيغۇرچە ئاتلىشى : نۇيابىر");
                break;
            case 12:
                System.out.println("December   ئۇيغۇرچە ئاتلىشى : دېسەمبىر");
                break;
            default:
        }
        if (ay >= 6 && ay <= 8) {
            System.out.println("ياز ئېيىغا تەۋە ");
        } else if (ay >= 3 && ay <= 5)
            System.out.println("باھار ئېيىغا تەۋە ، ئىشنىڭ بېشى باھاردىن دەپتىكەن كونىلار");

        else if (ay >= 9 && ay <= 11)
            System.out.println("بەركەتلىك كۈز ئېيىغا تەۋە");

        else
            System.out.println("ئەگەر سىز ھازىر قىش ئايلىرىدا بولغان بولسىڭىز ، قېلىنراق كېيىنىڭ");


    }
}
