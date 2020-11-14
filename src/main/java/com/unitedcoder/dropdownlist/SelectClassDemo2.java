package com.unitedcoder.dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClassDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(options);
        //maximize the browser
        driver.manage().window().maximize();
        //open google site
        driver.get("https://www.facebook.com/reg/?rs=6&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjA1MDI4NjA4LCJjYWxsc2l0ZV9pZCI6NzMxOTQxNDIwNzMyOTEwfQ%3D%3D");
        WebElement day=driver.findElement(By.id("day"));
        WebElement month=driver.findElement(By.id("month"));
        WebElement year=driver.findElement(By.id("year"));
        Select s=new Select(day);
        List<WebElement> option=s.getOptions();
        System.out.println(option.size());
        //how do you select element in dropdown without select tag
        //10
        for(int i=0;i<option.size();i++){
            System.out.println(option.get(i).getText());
            //String monthValue=option.get(i).getText();
//            if(monthValue.equalsIgnoreCase("15")){
//                option.get(i).click();
//                break;
//            }
        }
    }
}
