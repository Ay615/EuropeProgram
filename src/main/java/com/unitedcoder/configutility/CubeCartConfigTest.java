package com.unitedcoder.configutility;

import com.unitedcoder.classconcepts.LoginUser;
import com.unitedcoder.io.FileUtility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class CubeCartConfigTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String url;
        String configFile="config.properties";
        if(Integer.parseInt(ApplicationConfig.readConfigProperties(configFile,"qa"))==1){
            url=ApplicationConfig.readConfigProperties(configFile,"qaurl");
        }
        else{
            url=ApplicationConfig.readConfigProperties(configFile,"produrl");
        }
        driver.get(url);
        UiUtility utility=new UiUtility(driver);
        WebElement userNameField=driver.findElement(By.id("username"));
        String userName=ApplicationConfig.readConfigProperties(configFile,"username");
        utility.waitForElementPresent(userNameField);
        userNameField.sendKeys(userName);
        WebElement passwordField=driver.findElement(By.id("password"));
        String password=ApplicationConfig.readConfigProperties(configFile,"password");
        utility.waitForElementPresent(passwordField);
        passwordField.sendKeys(password);
        WebElement loginButton=driver.findElement(By.id("login"));
        utility.waitForElementPresent(loginButton);
        loginButton.click();
        WebElement logOutIcon=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        StringBuilder result=new StringBuilder();
        FileUtility fileUtility=new FileUtility();
        if(logOutIcon.isDisplayed()){
            result.append("Login successfully");
            utility.takeScreenShot("loginsuccess.png");
        }
        fileUtility.writeToFile("test-Result","cubecart-result",
                ".txt",result.toString());
        utility.waitForElementPresent(logOutIcon);
        logOutIcon.click();
        WebElement loginButtonAfterLogOut=driver.findElement(By.id("login"));
        utility.waitForElementPresent(loginButtonAfterLogOut);
        if(loginButtonAfterLogOut.isDisplayed()){
            result.append("Log Out Successfully");
            utility.takeScreenShot("logousuccess.png");
        }
        File existingFile=new File("test-Result"+File.separator+"cubecart-result.txt");
        try {
            FileUtils.writeStringToFile(existingFile,result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
