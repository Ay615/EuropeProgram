package com.unitedcoder.classconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaharaLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.mahara.org/");
        LoginUser user=new LoginUser();
        user.setUserName("admin");//hard code
        user.setPassWord("MaharaDemo");
        WebElement userNameField = driver.findElement(By.cssSelector("input[id='login_login_username']"));
        userNameField.sendKeys(user.getUserName());
        WebElement passWordField = driver.findElement(By.xpath("//input[@id='login_login_password']"));
        passWordField.sendKeys(user.getPassWord());
        WebElement loginBtn = driver.findElement(By.id("login_submit"));
        loginBtn.click();
        WebElement acntMenu = driver.findElement(By.cssSelector("span[class='icon icon-chevron-down collapsed']"));
        acntMenu.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"logoutbutton\"]/span[2]")).click();
        driver.close();
        driver.quit();
    }
}
