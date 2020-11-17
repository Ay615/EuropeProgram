package com.unitedcoder.cubecartautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
    public static WebDriver driver;
    public static String browserName = "chrome";

    public static void initialzation() {
        //singlton design pattern
        if (driver == null) {
            if (browserName.equalsIgnoreCase("chrome")) {
                //switch (browserName){
                // case "chrome":
                System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                //break;
                //case "firefox":
            } else if (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "c:\\webdriver\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                //break;
            }
        }

    }

    public static void closeBrowser() {
        driver.quit();
        driver = null;
    }

    //method for explicit wait
    public void waitForElementPresent(WebElement element, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void sleep(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
