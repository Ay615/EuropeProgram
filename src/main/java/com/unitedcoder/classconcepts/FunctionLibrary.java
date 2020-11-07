package com.unitedcoder.classconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FunctionLibrary {
    WebDriver driver;//class level  gloable
    //define open browser method
    public void openBrowser(String siteURL){
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(siteURL);
    }
    public void logIn(LoginUser user){
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(user.getUserName());
        WebElement passwordField=driver.findElement(By.id("password"));
        passwordField.sendKeys(user.getPassWord());
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
    }
    public boolean verifyLogin(){
        WebElement logOutLink=driver.findElement(By.xpath("//div[@id=\"header\"]/span/a[2]"));
        if(logOutLink.isDisplayed()) {
            System.out.println("Login successfully");
            return true;
        }
        else {
            System.out.println("Login failed");
            return false;
        }
    }
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
