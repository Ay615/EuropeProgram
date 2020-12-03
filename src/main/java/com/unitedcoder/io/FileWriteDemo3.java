package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo3 {
    public static void main(String[] args) {
        //append content to an existing file
        StringBuilder builder=new StringBuilder();
        builder.append("testautomation\n");
        builder.append("automation123!");
        File existingFile=new File("test-result"+File.separator+"myfile.txt");
        try {
            FileUtils.writeStringToFile(existingFile,builder.toString(),true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
