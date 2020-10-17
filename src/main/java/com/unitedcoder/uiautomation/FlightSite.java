package com.unitedcoder.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlightSite {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("");
        WebElement passengersDropDown=driver.findElement(By.id("divpaxinfo"));
        passengersDropDown.click();
        Thread.sleep(3000);
        for(int i=0;i<5;i++) {
            Thread.sleep(3000);
            WebElement adultPlusIcon = driver.findElement(By.id("hrefIncAdt"));
            adultPlusIcon.click();
        }
        driver.close();
        driver.quit();
    }
}
