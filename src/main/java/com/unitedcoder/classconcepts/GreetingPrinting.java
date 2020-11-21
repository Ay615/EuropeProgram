package com.unitedcoder.classconcepts;

import java.util.Date;

public class GreetingPrinting implements Runnable{
    private String message;

    public GreetingPrinting(String message){
        this.message=message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            Date date = new Date();
            System.out.println(date + " " + message);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
