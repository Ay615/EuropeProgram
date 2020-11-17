package com.unitedcoder.cubecartautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashBoardPage extends TestBase {
    public void logOut(){
        WebElement logOutBUtton=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        waitForElementPresent(logOutBUtton,5);
        logOutBUtton.click();
    }
}
