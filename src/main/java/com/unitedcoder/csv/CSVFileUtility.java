package com.unitedcoder.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVFileUtility {
    public List<String> readCSVFile(String filePath,String fileName,String headerName) {
        List<String> values=new  ArrayList<>();
        Reader reader=null;
        try {
            reader=new FileReader(filePath+ File.separator+fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Iterable<CSVRecord> records=null;
        try {
           records= CSVFormat.RFC4180.withFirstRecordAsHeader().withHeader(headerName).parse(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(CSVRecord record:records){
          String contents=record.get(headerName);
           values.add(contents);
            System.out.println(String.format("search word %s",contents));
        }
        return values;
    }
}
