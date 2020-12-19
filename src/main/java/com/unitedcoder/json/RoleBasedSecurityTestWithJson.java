package com.unitedcoder.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcoder.excel.ExcelUtility;
import com.unitedcoder.excel.LoginInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleBasedSecurityTestWithJson {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php?_g=customers&node=email");
        //for getting the sart time
        TestResult testResult = new TestResult();
        String startTime = TestHelper.getToday() + " " + TestHelper.getCurrentTime();
        testResult.setTestStartTime(startTime);
        //for current user
        testResult.setTestExecutedBy(TestHelper.getCurrentUser());

        ObjectMapper mapper = new ObjectMapper();
        Users loginUser = null;
        try {
            loginUser = mapper.readValue(new File("testdata\\users.json"), Users.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<TestResultObject> testResultObjects = new ArrayList<>();
        List<User> users = loginUser.getUsers();
        for (User user : users) {
            TestResultObject testResultObject = new TestResultObject();
            if (user.getActive()) {
                testResultObject.setTestModule("Login");
                testResultObject.setTestName("Login");

                String testDate = TestHelper.getToday();
                testResultObject.setTestDate(testDate);
                String testTime = TestHelper.getCurrentTime();
                testResultObject.setTestTime(testTime);

                WebElement userNameField = driver.findElement(By.id("username"));
                waitForElementPresent(driver, userNameField);
                String username = user.getUsername();
                userNameField.sendKeys(username);
                WebElement passwordField = driver.findElement(By.id("password"));
                waitForElementPresent(driver, passwordField);
                String password = user.getPassword();
                passwordField.sendKeys(password);
                WebElement loginButton = driver.findElement(By.id("login"));
                waitForElementPresent(driver, loginButton);
                loginButton.click();
                sleep(3);
                WebElement productLink = driver.findElement(By.id("nav_products"));
                if (productLink.isDisplayed()) {
                    System.out.println("Login test passed");
                    testResultObject.setTestStatus(true);
                } else {
                    System.out.println("Login test failed");
                    testResultObject.setTestStatus(false);
                }
                WebElement logOutIcon = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
                waitForElementPresent(driver, logOutIcon);
                logOutIcon.click();
                sleep(5);
            }
            testResultObjects.add(testResultObject);
        }
        driver.close();
        driver.quit();
        testResult.setTestEndTime(TestHelper.getToday() + " " + TestHelper.getCurrentTime());
        testResult.setTestResultObjectList(testResultObjects);
        ObjectMapper mapper1=new ObjectMapper();
        try {
            mapper1.writeValue(new File("testdata\\login-test-result.json"),testResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sleep(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitForElementPresent(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
