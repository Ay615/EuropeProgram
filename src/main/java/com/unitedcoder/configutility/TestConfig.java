package com.unitedcoder.configutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestConfig {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        FileInputStream inputStream=new FileInputStream("C:\\Users\\Aynigar\\projects\\SeleniumJavaTests\\config.properties");
        properties.load(inputStream);
        System.out.println(properties.getProperty("qaurl"));
        System.out.println("befor change: "+properties.getProperty("qa"));
        properties.setProperty("qa","2");
        System.out.println("After change: "+properties.getProperty("qa"));
        FileOutputStream outputStream=new FileOutputStream("C:\\Users\\Aynigar\\projects\\SeleniumJavaTests\\config.properties");
        properties.store(outputStream,null);
    }
}
