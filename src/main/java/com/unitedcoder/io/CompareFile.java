package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CompareFile {
    public static void main(String[] args) {
        File file1=new File("test-result"+File.separator+"myfile.txt");
        File file2=new File("test-result"+File.separator+"mynewfile.txt");

        String file1Content= null;
        try {
            file1Content = FileUtils.readFileToString(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String file2Content= null;
        try {
            file2Content = FileUtils.readFileToString(file2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(file1Content.equalsIgnoreCase(file2Content)){
            System.out.println("files are the same");
        }else
            System.out.println("files are different");


    }
}
