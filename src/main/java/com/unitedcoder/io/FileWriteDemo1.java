package com.unitedcoder.io;

public class FileWriteDemo1 {
    public static void main(String[] args) {
        FileUtility fileUtility=new FileUtility();
        StringBuffer fileContant=new StringBuffer();
        fileContant.append("I love coding in Java \n");
        //fileContant.append(System.getProperty("line.separator"));
        fileContant.append("Java coding is fun \n");
        fileContant.append("Java Test Automation Demo \n");
        fileContant.append("Test Passed");
        fileUtility.writeToFile("test-Result",
                "result"+System.currentTimeMillis(),
                ".txt",fileContant.toString());
    }
}
