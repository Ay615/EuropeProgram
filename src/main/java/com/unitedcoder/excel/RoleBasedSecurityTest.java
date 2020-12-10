package com.unitedcoder.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RoleBasedSecurityTest {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php?_g=customers&node=email");
            ExcelUtility utility=new ExcelUtility();
            List<LoginInfo> loginUser=utility.readMultipleCellValue("C:\\Users\\Aynigar\\projects\\SeleniumJavaTests\\testdata\\login.xlsx",
                    "Sayfa1",1);
            System.out.println(loginUser.size());
            for(LoginInfo users:loginUser){
            WebElement userNameField=driver.findElement(By.id("username"));
            waitForElementPresent(driver,userNameField);
            userNameField.sendKeys(users.getUsername());
            WebElement passwordField=driver.findElement(By.id("password"));
            waitForElementPresent(driver,passwordField);
            passwordField.sendKeys(users.getPassword());
            WebElement loginButton=driver.findElement(By.id("login"));
            waitForElementPresent(driver,loginButton);
            loginButton.click();
            WebElement productLink=driver.findElement(By.id("nav_products"));
            if(productLink.isDisplayed()){
                System.out.println("Login test passed");}
            else {
                System.out.println("Login test failed");
            }
            WebElement logOutIcon=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
            waitForElementPresent(driver,logOutIcon);
            logOutIcon.click();
            }
            driver.close();
            driver.quit();


        }
        public static void waitForElementPresent(WebDriver driver,WebElement element){
            WebDriverWait wait=new WebDriverWait(driver,60);
            wait.until(ExpectedConditions.visibilityOf(element));
        }
}
