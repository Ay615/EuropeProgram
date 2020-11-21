package com.unitedcoder.classconcepts;

public class MultiBrowserTest {
    public static void main(String[] args) {
        MultipleGoogleSearch search1=new MultipleGoogleSearch("Java");
        MultipleGoogleSearch search2=new MultipleGoogleSearch("Selenium");
        MultipleGoogleSearch search3=new MultipleGoogleSearch("Test");

         Thread thread1=new Thread(search1);
         Thread thread2=new Thread(search2);
         Thread thread3=new Thread(search3);

         thread1.start();
         thread2.start();
         thread3.start();



    }
}
