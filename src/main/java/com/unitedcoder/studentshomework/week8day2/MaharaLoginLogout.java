package com.unitedcoder.studentshomework.week8day2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class MaharaLoginLogout {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:/webdriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.mahara.org/");
        Thread.sleep(3000);
        List<String> userNames = new ArrayList<>();
        userNames.add("admin");
        userNames.add("student");
        userNames.add("learner");
        userNames.add("staff");
        userNames.add("sitestaff");
        for (int i = 0; i < userNames.size(); i++) {
            WebElement loginUser = driver.findElement(By.cssSelector("input[id='login_login_username']"));
            loginUser.click();
            loginUser.sendKeys(userNames.get(i), Keys.TAB);
            WebElement passWord = driver.findElement(By.xpath("//input[@id='login_login_password']"));
            passWord.sendKeys("MaharaDemo");
            WebElement loginBtn = driver.findElement(By.id("login_submit"));
            loginBtn.click();
            //WebElement message=driver.findElement(By.cssSelector("button[title='Administration menu']"));
            WebElement acntMenu = driver.findElement(By.cssSelector("span[class='icon icon-chevron-down collapsed']"));
            acntMenu.click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"logoutbutton\"]/span[2]")).click();
        }
        Thread.sleep(3000);
        WebElement verifMesg = driver.findElement(By.xpath("//div[contains(text(),'You have been logged out successfully')]"));
        String sucsMesg = verifMesg.getText();
        System.out.println(sucsMesg);

        if (sucsMesg.equalsIgnoreCase("You have been logged out successfully")) {//verify if it is logout
            System.out.println("User logged out");
        } else {
            System.out.println("failed");
        }
        driver.close();
        driver.quit();

    }
}
