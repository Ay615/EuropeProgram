package com.unitedcoder.uiautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearch2 {
    public static void main(String[] args) {
        //define chrome driver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver=new ChromeDriver(options);
        //maximize the browser
        driver.manage().window().maximize();
        //open google site
        driver.get("https://www.google.com");
        //find search box element
        //driver.findElement(By.linkText("English")).click();
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Java" + Keys.ENTER);
        WebElement searchResult = driver.findElement(By.id("result-stats"));
        String resultText=searchResult.getText();
        //String resultText="Yaklaşık 761.000.000 sonuç bulundu (0,37 saniye)";
        System.out.println(resultText);
        int beginIndex=resultText.indexOf("(");
        resultText=resultText.substring(0,beginIndex-1);
        resultText=resultText.replace("Yaklaşık","")
                .replace("sonuç bulundu","").trim();
        resultText=resultText.replace(".","");
        if(Integer.parseInt(resultText)>=100000){
            System.out.println("Test passed");
        }else
            System.out.println("Test failed");

        System.out.println(resultText);
        driver.close();
        driver.quit();

    }
}
