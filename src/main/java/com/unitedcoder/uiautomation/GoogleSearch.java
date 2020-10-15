package com.unitedcoder.uiautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        //define chrome driver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        WebDriver driver=new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        Dimension dimension=new Dimension(500,500);
        //set browser window size
        driver.manage().window().setSize(dimension);
        //set browser location
        Point point=new Point(300,200);
        driver.manage().window().setPosition(point);
        //open google site
        driver.get("https://www.google.com");
        driver.close();// close current browser
        driver.quit();//close all driver instance --system memory

    }
}
