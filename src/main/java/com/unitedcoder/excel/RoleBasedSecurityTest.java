package com.unitedcoder.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
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
            String filePath="testdata\\cubecart-report2.xlsx";
            List<String> testResult=new ArrayList<>();
            testResult.add("testcase,module,test data,result");
            for(LoginInfo users:loginUser){
            WebElement userNameField=driver.findElement(By.id("username"));
            waitForElementPresent(driver,userNameField);
            String username=users.getUsername();
            userNameField.sendKeys(username);
            WebElement passwordField=driver.findElement(By.id("password"));
            waitForElementPresent(driver,passwordField);
            String password=users.getPassword();
            passwordField.sendKeys(password);
            WebElement loginButton=driver.findElement(By.id("login"));
            waitForElementPresent(driver,loginButton);
            loginButton.click();
            WebElement productLink=driver.findElement(By.id("nav_products"));
            if(productLink.isDisplayed()) {
                System.out.println("Login test passed");
                testResult.add("Admin Login,Login," + username + password + ",Passed");
            }
            else {
                System.out.println("Login test failed");
                testResult.add("Admin Login,Login," + username + password + ",Failed");
            }
            WebElement logOutIcon=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
            waitForElementPresent(driver,logOutIcon);
            logOutIcon.click();
            }
            utility.writeToExcelMultipleCells(filePath,"cubecart-report",testResult);
            driver.close();
            driver.quit();
        }
        public static void waitForElementPresent(WebDriver driver,WebElement element){
            WebDriverWait wait=new WebDriverWait(driver,60);
            wait.until(ExpectedConditions.visibilityOf(element));
        }
}
