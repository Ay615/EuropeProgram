package com.unitedcoder.studentshomework.amazonsearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMultopleSearch {
    public static void main(String[] args) throws InterruptedException {
          /*String[] products = new String[]{"iphone", "mac", "ipad"};
        Product product = new Product();
*/
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        Product product = new Product();
        product.setProduct(new String[]{"iphone", "mac", "ipad"});
        int countBack =1;
        for (String s: product.getProduct()){
            WebElement searchBox = driver.findElement(By.name("field-keywords"));
            searchBox.sendKeys(s + Keys.ENTER);
            Thread.sleep(1000);
            if (countBack<product.getProduct().length)
                driver.navigate().back();
            countBack++;
        }
        driver.close();
        driver.quit();

    }
}
