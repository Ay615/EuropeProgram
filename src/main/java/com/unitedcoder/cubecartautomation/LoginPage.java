package com.unitedcoder.cubecartautomation;

import com.unitedcoder.classconcepts.LoginUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class LoginPage extends TestBase {

    public void login(LoginUser user){
        driver.get("");
        WebElement userNameField=driver.findElement(By.id("username"));
        waitForElementPresent(userNameField,5);
        userNameField.sendKeys(user.getUserName());
        WebElement passwordField=driver.findElement(By.id("password"));
        waitForElementPresent(passwordField,6);
        passwordField.sendKeys(user.getPassWord());
        WebElement loginButton=driver.findElement(By.id("login"));
        waitForElementPresent(loginButton,3);
        loginButton.click();
    }
}
