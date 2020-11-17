package com.unitedcoder.cubecartautomation;

import com.unitedcoder.classconcepts.ProductContent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends TestBase {
    public boolean  addProduct(){
        WebElement productsLink=driver.findElement(By.id("nav_products"));
        waitForElementPresent(productsLink,5);
        productsLink.click();
        WebElement addProductLink=driver.findElement(By.xpath("//*[text()='Add Product']"));
        waitForElementPresent(addProductLink,5);
        addProductLink.click();
        ProductContent content=new ProductContent("Aynigar"+System.currentTimeMillis(),
                "pz7865");
        driver.findElement(By.id("name")).sendKeys(content.getProductName());
        driver.findElement(By.id("product_code")).sendKeys(content.getProductCode());
        WebElement dropDown=driver.findElement(By.id("condition"));
        Select selectDropDown=new Select(dropDown);
        selectDropDown.selectByValue("used");
        driver.findElement(By.xpath("//input[@value='Save']")).click();
        String successfulMessage=driver.findElement(By.xpath("//div[@id=\"gui_message\"]/div[2]")).getText();
        if(driver.getPageSource().contains(successfulMessage)) {
            System.out.println("Product added successfully , test pass");
            return true;
        }
        else {
            System.out.println("Product not added , test failed");
            return false;
        }
    }
}
