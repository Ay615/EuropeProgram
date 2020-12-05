package com.unitedcoder.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;

public class CSVFileReader {
    public static void main(String[] args) {
        Reader reader=null;
        try {
            reader=new FileReader("test-Result"+ File.separator+"login.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Iterable<CSVRecord> records=null;
        try {
           records= CSVFormat.RFC4180.withHeader("username","password","phonenumber","mail").parse(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(CSVRecord record:records){
            String username=record.get("username");
            String password=record.get("password");
            String phone=record.get("phonenumber");
            String mail=record.get("mail");
            System.out.println(String.format("%s %s %s %s",username,password,phone,mail));
        }
    }
}
