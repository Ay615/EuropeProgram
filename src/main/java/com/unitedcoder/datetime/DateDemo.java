package com.unitedcoder.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date.toString());
        SimpleDateFormat sd=new SimpleDateFormat("M-d-yyyy");
        SimpleDateFormat sd1=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(sd.format(date));
        System.out.println(sd1.format(date));
        System.out.println("***Local Date Tile Library***");
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime.getDayOfMonth());
        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getMonth());
        System.out.println(dateTime);
        System.out.println(dateTime.plusDays(10));
    }
}
