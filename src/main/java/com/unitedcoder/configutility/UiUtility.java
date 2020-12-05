package com.unitedcoder.configutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UiUtility {
    private int timeout=Integer.parseInt(ApplicationConfig
            .readConfigProperties("config.properties","timeout"));
    private WebDriver driver;
    public UiUtility(WebDriver driver){
        this.driver=driver;
    }
    public void waitForElementPresent(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
