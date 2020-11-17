package com.unitedcoder.cubecartautomation;

import com.unitedcoder.classconcepts.LoginUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends TestBase {

    public void login(LoginUser user){
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php");
        WebElement userNameField=driver.findElement(By.id("username"));
        waitForElementPresent(userNameField,5);
        userNameField.sendKeys(user.getUserName());
        WebElement passwordField=driver.findElement(By.id("password"));
        waitForElementPresent(passwordField,5);
        passwordField.sendKeys(user.getPassWord());
        WebElement loginButton=driver.findElement(By.id("login"));
        waitForElementPresent(loginButton,5);
        loginButton.click();
    }
}
