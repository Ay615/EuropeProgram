package com.unitedcoder.configutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationConfig {
    //write a method to read a specific key value pair from config file
    public static String readConfigProperties(String fileName,String key){
        Properties prop=new Properties();
        String workingDirectory=System.getProperty("user.dir");
        String value;
        try {
            prop.load(new FileInputStream(workingDirectory+ File.separator+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        value=prop.getProperty(key);
        System.out.println(String.format("%s=%s",key,value));
        return value;
    }
}
