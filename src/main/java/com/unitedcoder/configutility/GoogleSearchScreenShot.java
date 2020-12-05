package com.unitedcoder.configutility;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearchScreenShot {
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
        String[] searchWords=new String[]{"Turkey","Japan","Dubai","Finland","Amesterdam"};
        UiUtility utility=new UiUtility(driver);
        for(String words:searchWords) {
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys(words + Keys.ENTER);
            utility.takeScreenShot(words+".png");
            driver.navigate().back();
        }
        driver.close();
        driver.quit();

    }
}
