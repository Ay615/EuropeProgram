package com.unitedcoder.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch2 {
    public static void main(String[] args) {
        //define chrome driver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        WebDriver driver=new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //open google site
        driver.get("https://www.google.com");
        //find search box element
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium"+ Keys.ENTER);
        WebElement searchResult=driver.findElement(By.id("result-stats"));
        String resultText=searchResult.getText();
        System.out.println(resultText);
        driver.close();
        driver.quit();
    }
}
