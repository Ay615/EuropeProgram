package com.unitedcoder.dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(options);
        //maximize the browser
        driver.manage().window().maximize();
        //open google site
        driver.get("https://www.facebook.com/reg/?rs=6&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjA1MDI4NjA4LCJjYWxsc2l0ZV9pZCI6NzMxOTQxNDIwNzMyOTEwfQ%3D%3D");
        WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));
        //10/07/1992
        Select s1 = new Select(day);
        //s1.selectByVisibleText("10");
//        Select s2=new Select(month);
//        s2.selectByVisibleText("Jul");
        // Select s3=new Select(year);
//        s3.selectByVisibleText("1992");
        SelectClassDemo1.selectValueFromDropDown(day, "10");
        SelectClassDemo1.selectValueFromDropDown(month, "Jul");
        SelectClassDemo1.selectValueFromDropDown(year, "1992");
        System.out.println(s1.isMultiple());
    }

    public static void selectValueFromDropDown(WebElement element,String value){
        Select s1=new Select(element);
        s1.selectByVisibleText(value);
    }

}
