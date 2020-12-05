package com.unitedcoder.uiautomation;

import com.unitedcoder.configutility.UiUtility;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class AmazonSearch1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //open google site
        DateTime browserOpenedTime=new DateTime();
        driver.get("https://www.amazon.com");
        //multiple product search iphone ipad sumsung
        //String[] products = {"Iphone", "Ipad", "Sumsung", "Mac"};
        List<String> products=new ArrayList<>();
        products.add("Iphone");
        products.add("Ipad");
        products.add("Mac");
        UiUtility utility=new UiUtility(driver);
        for (String keyWords : products) {
            WebElement serachBox = driver.findElement(By.id("twotabsearchtextbox"));
            serachBox.sendKeys(keyWords+ Keys.ENTER);
            utility.takeScreenShot(keyWords+".png");
            driver.navigate().back();
        }
        driver.close();
        driver.quit();
        DateTime testEndTime=new DateTime();
        Period period=new Period(browserOpenedTime,testEndTime, PeriodType.seconds());
        System.out.println("Total test time is : "+period.getSeconds());
    }
}
