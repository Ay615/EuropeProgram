package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo2 {
    public static void main(String[] args) {
        String content="Test Passed";
        content=content+"Test";
        //define timeStamp for the file
        DateTime date=new DateTime();
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-ss-SS");
        String timeStamp=date.toString(formatter);
        String fileName="test"+timeStamp+".txt";
        File myFile=new File("test-result"+File.separator+fileName);
        try {
            FileUtils.writeStringToFile(myFile,content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
