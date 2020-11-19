package com.unitedcoder.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        if(args.length>=1){
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            try{
                float c=a/b;
            }catch (Exception e){
                File file=new File("exception"+".txt");
                PrintWriter writer= null;
                try {
                    writer = new PrintWriter(file);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                writer.print("denominator cant not be zero"+e.getMessage());
                writer.close();
            }
        }else {
            System.out.println("You did not input numbers");
        }

    }
}
