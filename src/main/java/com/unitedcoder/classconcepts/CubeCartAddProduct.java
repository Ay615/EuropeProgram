package com.unitedcoder.classconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CubeCartAddProduct {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("");
            LoginUser user=new LoginUser("","");
            WebElement userNameField=driver.findElement(By.id("username"));
            userNameField.sendKeys(user.getUserName());
            WebElement passwordField=driver.findElement(By.id("password"));
            passwordField.sendKeys(user.getPassWord());
            WebElement loginButton=driver.findElement(By.id("login"));
            loginButton.click();
            WebElement dashboard=driver.findElement(By.xpath("//div[@id=\"dashboard\"]/h3"));
            String word=dashboard.getText();
            if(driver.getPageSource().contains(word))
                System.out.println("Login successfully");
            else
                System.out.println("Login failed");
            WebElement productsLink=driver.findElement(By.id("nav_products"));
            productsLink.click();
            WebElement addProductLink=driver.findElement(By.xpath("//*[text()='Add Product']"));
            addProductLink.click();
            //aynigar10 20 30
            ProductContent content=new ProductContent("Aynigar"+System.currentTimeMillis(),
                    "pz7865");
            driver.findElement(By.id("name")).sendKeys(content.getProductName());
            driver.findElement(By.id("product_code")).sendKeys(content.getProductCode());
            WebElement dropDown=driver.findElement(By.id("condition"));
            Select selectDropDown=new Select(dropDown);
            selectDropDown.selectByValue("used");
            selectDropDown.selectByVisibleText(DropDownContent.Refurbished.name());
            driver.findElement(By.xpath("//input[@value='Save']")).click();
            String successfulMessage=driver.findElement(By.xpath("//div[@id=\"gui_message\"]/div[2]")).getText();
            if(driver.getPageSource().contains(successfulMessage))
                System.out.println("Product added successfully , test pass");
            else
                System.out.println("Product not added , test failed");
            driver.close();
            driver.quit();

        }
}
