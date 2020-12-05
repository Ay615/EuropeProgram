package com.unitedcoder.csv;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CSVWriteDemo {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        builder.append("TestID,TestModule,TestType,TestStatus").append("\n");
        builder.append("1,Customer,regression,Pass").append("\n");
        builder.append("2,Inventory,regression,Pass").append("\n");
        builder.append("3,Category,Smoke,Failed");
        File file=new File("test-Result"+File.separator+"test-result.csv");
        try {
            FileUtils.writeStringToFile(file,builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
